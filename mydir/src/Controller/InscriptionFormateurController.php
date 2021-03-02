<?php

namespace App\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class InscriptionFormateurController extends AbstractController
{
    /**
     * @Route("/inscription/formateur", name="inscription_formateur")
     */
    public function index(): Response
    {
        return $this->render('inscription_formateur/index.html.twig', [
            'controller_name' => 'InscriptionFormateurController',
        ]);
    }
}
