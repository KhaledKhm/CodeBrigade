<?php

namespace App\Controller;

use App\Entity\Utilisateur;
use App\Form\FormateurformType;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\Routing\Annotation\Route;
use App\Repository\UtilisateurRepository;


class InscriptionController extends AbstractController
{
    /**
     * @Route("/inscription/utilisateurs", name="inscription/utilisateurs")
     */
    /*public function index(): Response
    {
        return $this->render('inscription/listUtilisateur.html.twig', [
            'controller_name' => 'InscriptionController',
        ]);
    }*/

    public function readUtilisateur()
    {
        $repository = $this->getDoctrine()->getRepository(Utilisateur::class);
        $utilisateur = $repository->findAll();

        return $this->render('inscription/listUtilisateur.html.twig', [
            'utilisateur' => $utilisateur,
        ]);
    }
    /**
     * @Route("/modifierUtilisateur/{id}", name="modifierUtilisateur")
     */
    public function updateUtilisateur(Request $request,$id)
    {
        $em = $this->getDoctrine()->getManager();
        $Utilisateur = $em->getRepository(UtilisateurRepository::class)->find($id);
        $formedit = $this->createForm(FormateurformType::class);
        $formedit->add('Modifier', SubmitType::class);

        $formedit->handleRequest($request);
        if($formedit->isSubmitted() && $formedit->isValid())
        {
            $em=$this->getDoctrine()->getManager();
            $em->flush();
            return $this->redirectToRoute('inscription/utilisateurs');
        }
        return $this->render('inscription/utilisateurs',
            [
                'form'=>$formedit->createView(),
            ]
        );
        /*$form = $this->createForm(CompanyType::class, $company);
        $form->handleRequest($request);

        if ($form->isSubmitted() && $form->isValid()) {
            $this->getDoctrine()->getManager()->flush();

            return $this->redirectToRoute('company_index');
        }

        return $this->render('company/edit.html.twig', [
            'company' => $company,
            'form' => $form->createView(),
        ]);
        if ($request->request->count()>0)
        {
            $em=$this->getDoctrine()->getManager();
            $entretien=$em->getRepository(Utilisateur::class)->find($id);
            $entretien->setLibelle($request->get('Libelle'));
            $entretien->setDescription($request->get('Description'));
            $entretien->setDateentretien($request->get('Dateentretien'));
            $entretien->setIdutilisateur($request->get('Idutilisateur'));
            $em->flush();
            return $this->redirectToRoute('entretien');
        }
        $class = $this->getDoctrine()->getRepository(Utilisateur::class)->findAll();
        $entretien=$this->getDoctrine()->getRepository(Entretien::class)->find($id);
        return $this->render('inscription/update.html.twig', ['classe'=>$class,'entretien'=>$entretien]);*/
    }
    /**
     * @Route("/supprimerUtilisateur/{id}",name="supprimerUtilisateur")
     */
    public function deleteUtilisateur($id)
    {
        $em = $this->getDoctrine()->getManager();
        $class = $this->getDoctrine()->getRepository(Utilisateur::class)->find($id);
        $em->remove($class);
        $em->flush();
        return $this->redirectToRoute('inscription/utilisateurs');
    }
}
