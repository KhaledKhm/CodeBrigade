<?php

namespace App\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class InscriptionCandidatController extends AbstractController
{
    /**
     * @Route("/inscription/candidat", name="inscription_candidat")
     */
    public function index(): Response
    {
        return $this->render('inscription_candidat/index.html.twig', [
            'controller_name' => 'InscriptionCandidatController',
        ]);
    }
}
