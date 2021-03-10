<?php

namespace App\Controller;

use App\Entity\Utilisateur;
use App\Form\CandidatformType;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\Security\Core\Encoder\UserPasswordEncoderInterface;

class InscriptionEntrepriseController extends AbstractController
{
    /**
     * @Route("/inscription/entreprise", name="inscription_entreprise")
     */
    public function index(): Response
    {
        return $this->render('inscription_entreprise/login.html.twig', [
            'controller_name' => 'InscriptionEntrepriseController',
        ]);
    }

    /**
     * @Route("/inscription/entreprise/inscription_entreprise_add", name="inscription_entreprise_add")
     */
    public function addEntreprise(Request $request,UserPasswordEncoderInterface $passwordEncoder)
    {
        $utilisateur = new utilisateur();
        $form = $this->createForm(CandidatformType::class, $utilisateur);
        $form->add('Add', SubmitType::class);
        $form->handleRequest($request);

        if ($form->isSubmitted() /*&& $form->isValid()*/) {
            $utilisateur->setPassword($passwordEncoder->encodePassword($utilisateur,$utilisateur->getPassword()));
            $utilisateur->setRole('Entreprise');
            $utilisateur = $form->getData();
            $em = $this->getDoctrine()->getManager();
            $em->persist($utilisateur);
            $em->flush();
            return $this->redirectToRoute('inscription/utilisateurs');


        }
        return $this->render('inscription_entreprise/addEntreprise.html.twig', [
            'form' => $form->createView(),
        ]);
    }
}
