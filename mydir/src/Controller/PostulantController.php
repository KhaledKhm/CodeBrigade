<?php

namespace App\Controller;
use App\Entity\Postulant;
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
     * @Route("/inscriptions", name="inscriptions")
     */
    public function inde(): Response
    {
        $class = $this->getDoctrine()->getRepository(Postulant::class)->findAll();
        $evenement = $this->getDoctrine()->getRepository(Evenement::class)->findAll();

        return $this->render('postulant/a.html.twig', ['class'=>$class,'classe'=>$evenement]);

    }

    /**
     * @param Request $request
     * @param $id
     * @Route ("/ajoutPart/{id}", name="ajoutPart")
     */
    public function AjouterPart(Request $request, $id){

        $em = $this->getDoctrine()->getManager();
        $event = $em->getRepository(Evenement::class)->find($id);
        if ($request->request->count()>0)
        {
            $post=new Postulant();
            $post->setNom($request->get('Nom'));
            $post->setPrenom($request->get('Prenom'));
            $post->setSexe($request->get('Sexe'));
            $post->setEtatScolaire($request->get('EtatScolaire'));
            $post->setAdresse($request->get('Adresse'));
            $post->setTelephone($request->get('Telephone'));
            $post->setEmail($request->get('Email'));
            $post->setStatus($request->get('Status'));
            $post->setDateNais($request->get('DateNais'));
            $post->setCompetences($request->get('Competences'));
            $post->addEvenement($event);
            $em=$this->getDoctrine()->getManager();
            $em->persist($post);
            $em->flush();
            return $this->redirectToRoute('evenement');
        }
        return $this->render('postulant/add.html.twig');
    }

    /**
     * @param Request $request
     * @param $id
     * @Route ("/ajoutPart1/{id}", name="ajoutPart1")
     */
    public function AjouterPart1(Request $request, $id){

        $em = $this->getDoctrine()->getManager();
        $event = $em->getRepository(Evenement::class)->find($id);
        if ($request->request->count()>0)
        {
            $post=new Postulant();
            $post->setNom($request->get('Nom'));
            $post->setPrenom($request->get('Prenom'));
            $post->setSexe($request->get('Sexe'));
            $post->setEtatScolaire($request->get('EtatScolaire'));
            $post->setAdresse($request->get('Adresse'));
            $post->setTelephone($request->get('Telephone'));
            $post->setEmail($request->get('Email'));
            $post->setStatus($request->get('Status'));
            $post->setDateNais($request->get('DateNais'));
            $post->setCompetences($request->get('Competences'));
            $post->addEvenement($event);
            $em=$this->getDoctrine()->getManager();
            $em->persist($post);
            $em->flush();
            return $this->redirectToRoute('evenementf');
        }
        return $this->render('postulant/add1.html.twig');
    }




}
