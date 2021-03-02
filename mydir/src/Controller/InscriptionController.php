<?php

namespace App\Controller;

use App\Entity\Utilisateur;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

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
}
