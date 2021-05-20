<?php

namespace App\Controller;

use App\Entity\Offre;
use App\Entity\Postulant;
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
        $class = $this->getDoctrine()->getRepository(Offre::class)->findAll();
        return $this->render('postulant/index2.html.twig', [
            'class' => $class,
        ]);
    }

    /**
     * @param Request $request
     * @param $id
     * @Route ("/ajoutPost/{id}", name="ajoutPost")
     */
    public function AjouterPostul(Request $request, $id){

        $em = $this->getDoctrine()->getManager();
        $offre = $em->getRepository(Offre::class)->find($id);
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
            $post->addOffre($offre);
            $em=$this->getDoctrine()->getManager();
            $em->persist($post);
            $em->flush();
            return $this->redirectToRoute('postulant');
        }
        return $this->render('postulant/add.html.twig');
    }

    /**
     * @Route("/suppPost/{id}", name="suppPost")
     */
    public function suppPost($id){
        $em = $this->getDoctrine()->getManager();
        $class = $this->getDoctrine()->getRepository(Postulant::class)->find($id);
        $em->remove($class);
        $em->flush();
        return $this->redirectToRoute('offre');
    }

    /**
     * @param $id
     * @return Response
     * @Route("/ajoutFav/{id}", name="ajoutFav")
     */

    public function AjoutFavoris($id){
        $em = $this->getDoctrine()->getManager();
        $offre = $em->getRepository(Offre::class)->find($id);
        $post= new Postulant();
        $class = $post->addFavori($offre);
        $fav = $class->getFavoris();

        return $this->render('postulant/fav.html.twig',['fav'=>$fav]);
    }


}
