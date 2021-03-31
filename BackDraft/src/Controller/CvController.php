<?php

namespace App\Controller;

use App\Entity\CV;
use MercurySeries\FlashyBundle\FlashyNotifier;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\BinaryFileResponse;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;

class CvController extends AbstractController
{

    /**
     * @Route("/notifupdatecv/{id}", name="notifupdatecv")
     */
    public function notifupdatecv(FlashyNotifier $flashy,$id)
    {

        $flashy->primarydark('Votre Cv a ete modifiee avec succès. Un mail a ete envoyé', 'http://gmail.com');

        return $this->redirectToRoute('faffichecv' ,array('id' => $id));


    }
    /**
     * @Route("/fupdateCV/{id}", name="fupdateCv")
     */
    public function fupdateCv($id, \Swift_Mailer $mailer)
    {   $cv=new CV();
        $em = $this->getDoctrine()->getManager();
        $cv = $em->getRepository(CV::class)->find($id);
        if(isset($_POST['nom']) and isset($_POST['prenom']) )
        {

            $cv->setNom($_POST['nom']);
            $cv->setPrenom($_POST['prenom']);
            if($_FILES['cvdoc']['name']!=null)
            {

                unlink($this->getParameter('upload_directory'). "/".$cv->getCvdoc());
                $fileName=$this->getParameter('upload_directory'). "/". basename($_FILES['cvdoc']['name']);
                if (move_uploaded_file($_FILES['cvdoc']['tmp_name'], $fileName)) {

                    $cv->setCvDoc($_FILES['cvdoc']['name']);
                } else {
                    echo "Erreur :Fichier n'est uploadee !\n";
                }
            }

            $em->flush();
            $message = (new \Swift_Message('CV Modifiee'))
                ->setFrom('noreplyjobbookmail@gmail.com')
                ->setTo('wissem.lahbib@esprit.tn')
                ->setBody('Bonjour Wissem ,Merci pour choisir JobBook ,Votre Cv a ete modifiee'
                );

            $mailer->send($message);
            return $this->redirectToRoute('notifupdatecv' ,array('id' => $id));

        }
        return $this->render("front/updateCv.html.twig", [
            "cv" => $cv,
        ]);

    }


    /**
     * @Route("/fdeleteCv/{id}", name="fdeleteCv")
     */
    public function fdeleteCv($id,FlashyNotifier $flashy, \Swift_Mailer $mailer)
    {
        $em=$this->getDoctrine()->getManager();
        $cv=$em->getRepository(Cv::class)->find($id);
        $em->remove($cv);
        $em->flush();
        $filename=$this->getParameter('upload_directory')."/".$cv->getCvDoc();
        unlink($filename);
        $flashy->primarydark('Votre Cv a ete Supprimee avec succès. Un mail a ete envoyé', 'http://gmail.com');
        $message = (new \Swift_Message('CV Supprimee'))
            ->setFrom('noreplyjobbookmail@gmail.com')
            ->setTo('wissem.lahbib@esprit.tn')
            ->setBody('Bonjour Wissem ,Merci pour choisir JobBook ,Votre Cv a ete Supprimee'
            );

        $mailer->send($message);

        return $this->redirectToRoute('fajouterCv');




    }



    /**
     * @Route("/faffichecv/{id}", name="faffichecv")
     */
    public function faffichecv($id)
    {
        $cv=$this->getDoctrine()
            ->getRepository(Cv::class)
            ->find($id);


        return $this->render('front/afficheCv.html.twig', [
            "cv" => $cv,
        ]);



    }


    /**
     * @Route("/notifajoutercv", name="notifajoutercv")
     */
    public function notifajoutercv(FlashyNotifier $flashy)
    {

        $flashy->primarydark('Votre Cv a ete ajoutee avec succès. Un mail a ete envoyé', 'http://gmail.com');
        return $this->redirectToRoute('fajouterCv');


    }
    /**
     * @Route("/fajouterCv", name="fajouterCv")
     */
    public function fajouterCv()
    {


        if(isset($_POST['nom']) and isset($_POST['prenom']) )
        {
            $cv=new CV();
            $cv->setNom($_POST['nom']);
            $cv->setPrenom($_POST['prenom']);
            $cv->setIdutli(1);
            $fileName=$this->getParameter('upload_directory'). "/". basename($_FILES['cvdoc']['name']);
            if (move_uploaded_file($_FILES['cvdoc']['tmp_name'], $fileName)) {
                echo "Fichier Uploadee.\n";
                $cv->setCvDoc($_FILES['cvdoc']['name']);
            } else {
                echo "Erreur :Fichier n'est uploadee !\n";
            }

            $em=$this->getDoctrine()->getManager();
            $em->persist($cv);
            $em->flush();
            return $this->redirectToRoute('notifajoutercv');
        }

        return $this->render('front/ajouterCv.html.twig');


    }

    /**
     * @Route("/notiajoutercv", name="notiajoutercv")
     */
    public function notiajoutercv(FlashyNotifier $flashy)
    {

        $flashy->primarydark('Votre Cv a ete ajoutee avec succès. Un mail a ete envoyé', 'http://gmail.com');
        return $this->redirectToRoute('listCv');


    }

    /**
     * @Route("/ajouterCv", name="ajouterCv")
     */
    public function ajouterCv( \Swift_Mailer $mailer)
    {

        if(isset($_POST['nom']) and isset($_POST['prenom']) )
        {
            $cv=new CV();
            $cv->setNom($_POST['nom']);
            $cv->setPrenom($_POST['prenom']);
            $cv->setIdutli(1);
            $fileName=$this->getParameter('upload_directory'). "/". basename($_FILES['cvdoc']['name']);
            if (move_uploaded_file($_FILES['cvdoc']['tmp_name'], $fileName)) {

                $cv->setCvDoc($_FILES['cvdoc']['name']);
            } else {
                echo "Erreur :Fichier n'est uploadee !\n";
            }

            $em=$this->getDoctrine()->getManager();
            $em->persist($cv);
            $em->flush();

            $message = (new \Swift_Message('CV Ajoutee'))
                ->setFrom('noreplyjobbookmail@gmail.com')
                ->setTo('wissem.lahbib@esprit.tn')
                ->setBody('Bonjour Wissem ,Merci pour choisir JobBook ,Votre Cv a ete ajoutee'
                );

            $mailer->send($message);
            return $this->redirectToRoute('notiajoutercv');
        }
        return $this->render('cv/ajouterCv.html.twig');


    }


    /**
     * @Route("/listCv", name="listCv")
     */
    public function listCv()
    {   $listCv=$this->getDoctrine()
        ->getRepository(Cv::class)
        ->findAll();

        return $this->render('cv/listCv.html.twig', array('listCv'=>$listCv)

        );
    }
    /**
     * @Route("/flistCv", name="flistCv")
     */
    public function flistCv()
    {   $listCv=$this->getDoctrine()
        ->getRepository(Cv::class)
        ->findAll();

        return $this->render('front/listCv.html.twig', array('listCv'=>$listCv)

        );
    }
    /**
     * @Route("/openfile/{name}", name="openfile")
     */
    public function openfile($name)
    {

        return new BinaryFileResponse($this->getParameter('upload_directory')."/".$name);



    }

    /**
     * @Route("/deleteCv/{id}", name="deleteCv")
     */
    public function deleteCv($id,FlashyNotifier $flashy, \Swift_Mailer $mailer)
    {
        $em=$this->getDoctrine()->getManager();
        $cv=$em->getRepository(Cv::class)->find($id);
        $em->remove($cv);
        $em->flush();
        $filename=$this->getParameter('upload_directory')."/".$cv->getCvDoc();
        unlink($filename);
        $flashy->primarydark('Votre Cv a ete Supprimee avec succès. Un mail a ete envoyé', 'http://gmail.com');
        $message = (new \Swift_Message('CV Supprimee'))
            ->setFrom('noreplyjobbookmail@gmail.com')
            ->setTo('wissem.lahbib@esprit.tn')
            ->setBody('Bonjour Wissem ,Merci pour choisir JobBook ,Votre Cv a ete Supprimee'
            );

        $mailer->send($message);

        return $this->redirectToRoute('listCv');




    }
    /**
     * @Route("/notiupdatecv", name="notiupdatecv")
     */
    public function notiupdatecv(FlashyNotifier $flashy)
    {

        $flashy->primarydark('Votre Cv a ete modifiee avec succès. Un mail a ete envoyé', 'http://gmail.com');

        return $this->redirectToRoute('listCv');


    }
    /**
     * @Route("/updateCV/{id}", name="updateCv")
     */
    public function updateCv($id, \Swift_Mailer $mailer)
    {   $cv=new CV();
        $em = $this->getDoctrine()->getManager();
        $cv = $em->getRepository(CV::class)->find($id);
        if(isset($_POST['nom']) and isset($_POST['prenom']) )
        {

            $cv->setNom($_POST['nom']);
            $cv->setPrenom($_POST['prenom']);
            if($_FILES['cvdoc']['name']!=null)
            {

                unlink($this->getParameter('upload_directory'). "/".$cv->getCvdoc());
                $fileName=$this->getParameter('upload_directory'). "/". basename($_FILES['cvdoc']['name']);
                if (move_uploaded_file($_FILES['cvdoc']['tmp_name'], $fileName)) {
                    echo "Fichier Uploadee.\n";
                    $cv->setCvDoc($_FILES['cvdoc']['name']);
                } else {
                    echo "Erreur :Fichier n'est uploadee !\n";
                }
            }

            $em->flush();
            $message = (new \Swift_Message('CV Modifiee'))
                ->setFrom('noreplyjobbookmail@gmail.com')
                ->setTo('wissem.lahbib@esprit.tn')
                ->setBody('Bonjour Wissem ,Merci pour choisir JobBook ,Votre Cv a ete modifiee'
                );

            $mailer->send($message);
            return $this->redirectToRoute('notiupdatecv');

        }
        return $this->render("cv/updateCv.html.twig", [
            "cv" => $cv,
        ]);

    }


}
