<?php

namespace App\Controller;

use App\Entity\Offre;
use App\Entity\Postulant;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

use Symfony\Component\Routing\Annotation\Route;

class OffreController extends AbstractController
{
    /**
     * @Route("/offre", name="offre")
     */
    public function index(): Response
    {
        $class = $this->getDoctrine()->getRepository(Offre::class)->findAll();
        return $this->render('offre/index.html.twig', [
            'class' => $class,
        ]);
    }

    /**
     * @Route("/Ajouteroffre", name="Ajouteroffre")
     * @param Request $request
     * @return \Symfony\Component\HttpFoundation\RedirectResponse|Response
     */
    public function AjouterOffre(Request $request){

        if ($request->request->count()>0)
        {
            $offre=new Offre();
            $offre->setDescription($request->get('Description'));
            $offre->setLibelle($request->get('Libelle'));
            $offre->setDateLimite($request->get('DateLimite'));
            $offre->setSalaire($request->get('Salaire'));
            $offre->setDisponabilite($request->get('Disponabilite'));
            $em=$this->getDoctrine()->getManager();
            $em->persist($offre);
            $em->flush();
            return $this->redirectToRoute('offre');
        }
        return $this->render('offre/add.html.twig');

    }

    /**
     * @Route("/supprimerOffre/{id}",name="supprimerOffre")
     */
    public function SupprimerOffre($id){
        $em = $this->getDoctrine()->getManager();
        $class = $this->getDoctrine()->getRepository(Offre::class)->find($id);
        $em->remove($class);
        $em->flush();
        return $this->redirectToRoute('offre');
    }
    /**
     * @Route("/modifierOffre/{id}",name="modifierOffre")
     */

    public function modifierOffre(Request $request,$id ){
        if ($request->request->count()>0)
        {
            $em=$this->getDoctrine()->getManager();
            $offre=$em->getRepository(Offre::class)->find($id);
            $offre->setLibelle($request->get('Libelle'));
            $offre->setDescription($request->get('Description'));
            $offre->setDateLimite($request->get('DateLimite'));
            $offre->setSalaire($request->get('Salaire'));
            $offre->setDisponabilite($request->get('Disponabilite'));
            $em->flush();
            return $this->redirectToRoute('offre');
        }
        $offre =$this->getDoctrine()->getRepository(Offre::class)->find($id);
        return $this->render('offre/update.html.twig', ['offre'=>$offre]);
    }

    /**
     * @param $id
     * @Route ("/listPost/{id}", name="listPost")
     */

    public function ListPost($id){
        $class = $this->getDoctrine()->getRepository(Offre::class)->find($id);
        $post =$class->getPostulants();
        return  $this->render('postulant/list.html.twig', ['post'=>$post]);


    }


}
