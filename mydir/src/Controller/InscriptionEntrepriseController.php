<?php

namespace App\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class InscriptionEntrepriseController extends AbstractController
{
    /**
     * @Route("/inscription/entreprise", name="inscription_entreprise")
     */
    public function index(): Response
    {
        return $this->render('inscription_entreprise/index.html.twig', [
            'controller_name' => 'InscriptionEntrepriseController',
        ]);
    }
}
