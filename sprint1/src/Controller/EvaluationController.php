<?php

namespace App\Controller;
use App\Entity\Evaluation;
use App\Entity\Quiz;
use App\Entity\Utilisateur;
use App\Form\EvaluationType;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
//use Symfony\Component\BrowserKit\Request;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;
use Symfony\Component\Form\Extension\Core\Type\TextType;


class EvaluationController extends AbstractController
{
    /**
     * @Route("/evaluation", name="evaluation")
     */
    public function index(): Response
    {
        $class = $this->getDoctrine()->getRepository(Evaluation::class)->findAll();
        return $this->render('evaluation/list.html.twig', ['classe'=>$class]);
    }

    /**
     * @Route("/afficherParticipants", name="afficherParticipants")
     */
    public function listparticipants(): Response
    {
        $class = $this->getDoctrine()->getRepository(Evaluation::class)->findAll();
        return $this->render('evaluation/participants.html.twig', ['classe'=>$class]);
    }
    /**
     * @Route("/afficherQuiz", name="afficherQuiz")
     */
    public function listquiz(): Response
    {
        $class = $this->getDoctrine()->getRepository(Evaluation::class)->findAll();
        return $this->render('evaluation/quiz.html.twig', ['classe'=>$class]);
    }

    /**
     * @Route("/ajouterEvaluation", name="ajouterEvaluation")
     */
    public function createEvaluation(Request $request)
    {
        if ($request->request->count()>0)
        {
            $evaluation=new Evaluation();
            $evaluation->setLibelle($request->get('Libelle'));
            $evaluation->setDescription($request->get('Description'));
            $evaluation->setDateevaluation($request->get('Dateevaluation'));
            $evaluation->setIdEntreprise($request->get('Identreprise'));
            $em=$this->getDoctrine()->getManager();
            $em->persist($evaluation);
            $em->flush();
            return $this->redirectToRoute('evaluation');
        }
        $entreprise=$this->getDoctrine()->getRepository(Utilisateur::class)->findAll();
        return $this->render('evaluation/add.html.twig',['classe'=>$entreprise]);
    }

    /**
     * @Route("/modifierEvaluation/{id}", name="modifierEvaluation")
     */
    public function updateEvaluation(Request $request,$id)
    {
        if ($request->request->count()>0)
        {
            $em=$this->getDoctrine()->getManager();
            $evaluation=$em->getRepository(Evaluation::class)->find($id);
            $evaluation->setLibelle($request->get('Libelle'));
            $evaluation->setDescription($request->get('Description'));
            $evaluation->setDateevaluation($request->get('Dateevaluation'));
            $evaluation->setIdEntreprise($request->get('Identreprise'));
            $em->flush();
            return $this->redirectToRoute('evaluation');
        }
        $evaluation=$this->getDoctrine()->getRepository(Evaluation::class)->find($id);
        $entreprise=$this->getDoctrine()->getRepository(Utilisateur::class)->findAll();
        return $this->render('evaluation/update.html.twig', ['evaluation'=>$evaluation,'classe'=>$entreprise]);
    }

    /**
     * @Route("/supprimerEvaluation/{id}",name="supprimerEvaluation")
     */
    public function deleteEvaluation($id)
    {
        $em = $this->getDoctrine()->getManager();
        $class = $this->getDoctrine()->getRepository(Evaluation::class)->find($id);
        $em->remove($class);
        $em->flush();
        return $this->redirectToRoute('evaluation');
    }

}

