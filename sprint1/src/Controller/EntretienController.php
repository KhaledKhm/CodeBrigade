<?php

namespace App\Controller;

use App\Entity\Entretien;
use App\Entity\ParticipationEvaluation;
use App\Entity\Evaluation;
use App\Form\EntretienType;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class EntretienController extends AbstractController
{
    /**
     * @Route("/entretien", name="entretien")
     */
    public function index(): Response
    {
        $class = $this->getDoctrine()->getRepository(Entretien::class)->findAll();
        return $this->render('entretien/list.html.twig', ['classe'=>$class]);
    }

    /**
     * @Route("/ajouterEntretien", name="ajouterEntretien")
     */
    public function createEntretien(Request $request)
    {
        if ($request->request->count()>0)
        {
            $entretien=new Entretien();
            $entretien->setLibelle($request->get('Libelle'));
            $entretien->setDescription($request->get('Description'));
            $entretien->setDateentretien($request->get('Dateentretien'));
            $entretien->setIdEvaluation($request->get('Idevaluation'));
            $em=$this->getDoctrine()->getManager();
            $em->persist($entretien);
            $em->flush();
            return $this->redirectToRoute('entretien');
        }
        $class = $this->getDoctrine()->getRepository(Evaluation::class)->findAll();
        $participant = $this->getDoctrine()->getRepository(ParticipationEvaluation::class)->findAll();
        return $this->render('entretien/add.html.twig', ['classe'=>$class,'participant'=>$participant]);
    }

    /**
     * @Route("/modifierEntretien/{id}", name="modifierEntretien")
     */
    public function updateEntretien(Request $request,$id)
    {
        if ($request->request->count()>0)
        {
            $em=$this->getDoctrine()->getManager();
            $entretien=$em->getRepository(Entretien::class)->find($id);
            $entretien->setLibelle($request->get('Libelle'));
            $entretien->setDescription($request->get('Description'));
            $entretien->setDateentretien($request->get('Dateentretien'));
            $em->flush();
            return $this->redirectToRoute('entretien');
        }
        $entretien=$this->getDoctrine()->getRepository(Entretien::class)->find($id);
        return $this->render('entretien/update.html.twig', ['entretien'=>$entretien]);
    }

    /**
     * @Route("/supprimerEntretien/{id}",name="supprimerEntretien")
     */
    public function deleteEntretien($id)
    {
        $em = $this->getDoctrine()->getManager();
        $class = $this->getDoctrine()->getRepository(Entretien::class)->find($id);
        $em->remove($class);
        $em->flush();
        return $this->redirectToRoute('entretien');
    }

    /**
     * @Route("/ajouterParticipantEntretien/{id}", name="ajouterParticipantEntretien")
     */
    public function ajouterParticipant(Request $request,$id)
    {
        if ($request->request->count()>0)
        {
            $em=$this->getDoctrine()->getManager();
            $entretien=$em->getRepository(Entretien::class)->find($id);
            $entretien->setIdParticipant($request->get('IdParticipant'));
            $em->flush();
            return $this->redirectToRoute('entretien');
        }
        $entretien=$this->getDoctrine()->getRepository(Entretien::class)->find($id);
        $participant = $this->getDoctrine()->getRepository(ParticipationEvaluation::class)->findAll();
        return $this->render('entretien/addP.html.twig', ['entretien'=>$entretien,'participant'=>$participant]);
    }
}
