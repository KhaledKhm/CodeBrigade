<?php

namespace App\Controller;

use App\Entity\Utilisateur;
use App\Form\CandidatformType;
use App\Form\FormateurformType;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class InscriptionCandidatController extends AbstractController
{
    /**
     * @Route("/inscription/formateur/inscription_condidat_add", name="inscription_condidat_add")
     */
    public function addCandidat(Request $request)
    {
        $utilisateur = new utilisateur();
        $form = $this->createForm(CandidatformType::class, $utilisateur);
        $form->add('Add', SubmitType::class);
        $form->handleRequest($request);
        if ($form->isSubmitted() /*&& $form->isValid()*/) {
            $utilisateur->setRole('Candidat');
            $utilisateur = $form->getData();
            $em = $this->getDoctrine()->getManager();
            $em->persist($utilisateur);
            $em->flush();
            return $this->redirectToRoute('inscription/utilisateurs');


        }
        return $this->render('inscription_candidat/addCandidat.html.twig', [
            'form' => $form->createView(),
        ]);
    }

    /**
     * @Route("/inscription/candidat/inscription_candidat", name="/inscription/candidat/inscription_formateur2")
     */
    public function readCandidat()
    {
        $repository = $this->getDoctrine()->getRepository(Utilisateur::class);
        $utilisateur = $repository->findAll();

        return $this->render('inscription_candidat/listCandidat.html.twig', [
            'utilisateur' => $utilisateur,
        ]);
    }
    /* public function adduser(Request $request)
     {
         $utilisateur= new $utilisateur();
         $form=$this->createForm(AddsocieteType::class,$utilisateur);
         $form->add('Add',SubmitType::class);
         $form->handleRequest($request);
         if($form->isSubmitted() && $form->isValid())
         {



             $entityManager = $this->getDoctrine()->getManager();
             $entityManager->persist($user);
             $entityManager->flush();
             return $this->redirectToRoute("manager");
         }

         return $this->render('user/add1.html.twig', [
             'form' => $form->createView(),
         ]);
     }*/

}
