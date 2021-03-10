<?php

namespace App\Controller;

use App\Entity\Avis;
use App\Form\AvisType;
use App\Repository\AvisRepository;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;


class AvisController extends AbstractController
{
    /**
     * @Route("/avisss", name="aviss")
     */
    public function index(): Response
    {
        return $this->render('ajoutavis.html.twig', [
            'controller_name' => 'AvisController',
        ]);
    }
    /**
     * @param AvisRepository $repository
     * @return \Symfony\Component\HttpFoundation\Response
     * @Route("/Affiche",name="afficheravis")
     */
    public function Affiche(AvisRepository $repository)
    {
        $avis=$repository->findAll();
        return $this->render('afficheavis.html.twig',
            ['avis'=>$avis]);
    }

    /**
     * @Route("/SupprimerAvis/{id}",name="deleteavis")
     */
    function Delete($id,AvisRepository $repository)
    {
        $avis=$repository->find($id);
        $em=$this->getDoctrine()->getManager();
        $em->remove($avis);
        $em->flush();
        return $this->redirectToRoute('afficheravis');
    }



    /**
     * @param Request $request
     * @return \Symfony\Component\HttpFoundation\Response
     * @Route ("/Ajout",name="ajouteravis")
     */
    function Add(Request $request)
    {
        $avis=new Avis();
        $form=$this->createForm(AvisType::class, $avis);
        $form->handleRequest($request);
        if($form->isSubmitted() && $form->isValid())
        {
            $em=$this->getDoctrine()->getManager();
            $em->persist($avis);
            $em->flush();
            return $this->redirectToRoute('ajouteravis');
        }
        return $this->render('Avis.html.twig',
            [
                'form'=>$form->createView(),
            ]
        );
    }


    /**
     * @param Request $request
     * @Route("/Modifieravis/{id}",name="modifieravis")
     * @return \Symfony\Component\HttpFoundation\RedirectResponse|Response
     */
    function modifier(avisRepository $repository,$id,Request $request)
    {
        $avis=$repository->find($id);
        $form=$this->createForm(AvisType::class,$avis);
        $form->handleRequest($request);
        if($form->isSubmitted() && $form->isValid())
        {
            $em=$this->getDoctrine()->getManager();
            $em->flush();
            return $this->redirectToRoute('afficheravis');
        }
        return $this->render('ajoutavis.html.twig',
            [
                'form'=>$form->createView(),
            ]
        );
    }


}
