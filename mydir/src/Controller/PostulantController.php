<?php

namespace App\Controller;

use App\Entity\Evenement;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class PostulantController extends AbstractController
{
    /**
     * @Route("/postulant", name="postulant")
     */
    public function index(): Response
    {
        return $this->render('postulant/index.html.twig', [
            'controller_name' => 'PostulantController',
        ]);
    }
    /**
     * @Route("/ajouterEvenement", name="ajouterEvenement")
     */
    public function createEvenement(Request $request)
    {
        if ($request->request->count()>0)
        {
            $evenement=new Evenement();
            $evenement->setLibelle($request->get('Libelle'));
            $evenement->setDescription($request->get('description'));
            $evenement->setDateDebut($request->get('DateDebut'));
            $evenement->setDateFin($request->get('DateFin'));
            $evenement->setPrixInscription($request->get('PrixInscription'));
            $em=$this->getDoctrine()->getManager();
            $em->persist($evenement);
            $em->flush();
            return $this->redirectToRoute('evenement');
        }
        return $this->render('evenement/add.html.twig');
    } /**
 * @Route("/ajouterParticipation", name="ajouterParticipation")
 */
    public function createParticipation(Request $request)
    {
        if ($request->request->count()>0)
        {
            $participation=new Participation();
            $participation->setLibelle($request->get('Libelle'));
            $participation->setDescription($request->get('description'));
            $participation->setDateDebut($request->get('DateDebut'));
            $participation->setDateFin($request->get('DateFin'));
            $participation->setPrixInscription($request->get('PrixInscription'));
            $em=$this->getDoctrine()->getManager();
            $em->persist($evenement);
            $em->flush();
            return $this->redirectToRoute('evenement');
        }
        return $this->render('evenement/add.html.twig');
    }



}
