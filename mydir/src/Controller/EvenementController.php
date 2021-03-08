<?php

namespace App\Controller;

use App\Entity\Evenement;
use App\Entity\Promotion;

use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\HttpFoundation\Request;

class EvenementController extends AbstractController


{
    /**
     * @Route("/evenement", name="evenement")
     */
    public function index(): Response
    {
        $class = $this->getDoctrine()->getRepository(Evenement::class)->findAll();

        return $this->render('evenement/list.html.twig', ['classe'=>$class]);

    }
    /**
     * @Route("/evenementf", name="evenementf")
     */
    public function ind(): Response
    {
        $class = $this->getDoctrine()->getRepository(Evenement::class)->findAll();

        return $this->render('evenement/f.html.twig', ['classe'=>$class]);

    }
    /**
     * @param $id
     * @Route ("/listPost/{id}", name="listPost")
     */

    public function ListPost($id){
        $class = $this->getDoctrine()->getRepository(Evenement::class)->find($id);
        $post =$class->getPostulants();
        return  $this->render('postulant/a.html.twig', ['post'=>$post]);


    }

    /**
     * @param $id
     * @Route ("/listPost1/{id}", name="listPost1")
     */

    public function ListPost1($id){
        $class = $this->getDoctrine()->getRepository(Evenement::class)->find($id);
        $post =$class->getPromotions();
        return  $this->render('promotion/b.html.twig', ['post'=>$post]);


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
    }

    /**
     * @Route("/modifierEvenement/{id}", name="modifierEvenement")
     */
    public function updateEvenement(Request $request,$id)
    {
        if ($request->request->count()>0)
        {
            $em=$this->getDoctrine()->getManager();
            $evenement=$em->getRepository(Evenement::class)->find($id);
            $evenement->setLibelle($request->get('Libelle'));
            $evenement->setDescription($request->get('description'));
            $evenement->setDateDebut($request->get('DateDebut'));
            $evenement->setDateFin($request->get('DateFin'));
            $evenement->setPrixInscription($request->get('PrixInscription'));
            $em->flush();
            return $this->redirectToRoute('evenement');
        }
        $evenement=$this->getDoctrine()->getRepository(Evenement::class)->find($id);
        return $this->render('evenement/update.html.twig', ['evenement'=>$evenement]);
    }

    /**
     * @Route("/supprimerEvenement/{id}",name="supprimerEvenement")
     */
    public function deleteEvenement($id)
    {
        $em = $this->getDoctrine()->getManager();
        $class = $this->getDoctrine()->getRepository(Evenement::class)->find($id);
        $em->remove($class);
        $em->flush();
        return $this->redirectToRoute('evenement');
    }

}
