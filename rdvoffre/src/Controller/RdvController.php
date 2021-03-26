<?php

namespace App\Controller;

use App\Entity\Rdv;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class RdvController extends AbstractController
{
    /**
     * @Route("/rdv", name="rdv")
     */
    public function index(): Response
    {
        return $this->render('rdv/index.html.twig', [
            'controller_name' => 'RdvController',
        ]);
    }

    /**
     * @param Request $request
     * @return \Symfony\Component\HttpFoundation\RedirectResponse|Response
     * @Route("/Ajouterrdv", name="Ajouterrdv")
     */

    public function ajoutRdv(Request $request){
        if ($request->request->count()>0)
        {
            $rdv=new Rdv();
            $rdv->setDate($request->get('Date'));
            $rdv->setEmplacement($request->get('Emplacement'));
            $em=$this->getDoctrine()->getManager();
            $em->persist($rdv);
            $em->flush();
            return $this->redirectToRoute('offre');
        }
        return $this->render('rdv/add.html.twig');

    }
}
