<?php

namespace App\Controller;

use App\Entity\Offre;
use App\Entity\Postulant;
use App\Repository\OffreRepository;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Form\Extension\Core\Type\SubmitType;
use Symfony\Component\Form\Extension\Core\Type\TextType;

use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\Serializer\Normalizer\NormalizerInterface;
use Symfony\Component\Serializer\SerializerInterface;

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
     * @param SerializerInterface $serializer
     * @return \Symfony\Component\HttpFoundation\RedirectResponse|Response
     */
    public function AjouterOffre(Request $request, SerializerInterface $serializer){

        if ($request->request->count()>0)
        {


            $offre=new Offre();
            $offre->setDescription($request->get('Description'));
            $offre->setLibelle($request->get('Libelle'));

            $offre->setSalaire($request->get('Salaire'));


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

            $offre->setSalaire($request->get('Salaire'));

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

    /**
     * @Route ("/list", name="list")
     * @param OffreRepository $repo
     * @param SerializerInterface $serializerInterface
     */
    public function getOffres(OffreRepository $repo,SerializerInterface $serializerInterface){
        $offres=$repo->findAll();
        $json=$serializerInterface->serialize($offres,'json',['groups'=>'offre']);
        return new response(json_encode($json));
    }
    /**
     * @Route("/addOffreJSON", name="addOffreJSON")
     */
    public function addOffreJSON(Request $request,NormalizerInterface $Normalizer){
        $em = $this->getDoctrine()->getManager();
        $offre = new Offre();
        $offre->setDescription($request->get('Description'));
        $offre->setLibelle($request->get('Libelle'));

        $offre->setSalaire($request->get('Salaire'));
        $em->persist($offre);
        $em->flush();
        $jsonContent = $Normalizer->normalize($offre, 'json',['groups'=>'offre']);
        return new response(json_encode($jsonContent));

    }


    /**
 * @param NormalizerInterface $normalizer
 * @param ServiceRepository $repo
 * @return Response
 * @throws \Symfony\Component\Serializer\Exception\ExceptionInterface
 * @Route ("/afficheoffresMobile",name="affichemobile")
 */
    public function afficheMobile(NormalizerInterface $normalizer, OffreRepository $repo){
        $offres=$repo->findAll();
        $jsonContent = $normalizer->normalize($offres,'json',['groups'=>'offre']);
        return new Response(json_encode($jsonContent));

    }

    /**
     * @Route("/updateOffreJSON/{id}")
     * @param Request $request
     * @param NormalizerInterface $normalizer
     * @param $id
     */
    public  function updateOffre(Request $request,NormalizerInterface $normalizer,$id){

        $em = $this->getDoctrine()->getManager();
        $offre = $em->getRepository(Offre::class)->find($id);
        $offre->setLibelle($request->get('Libelle'));
        $offre->setDescription($request->get('Description'));

        $offre->setSalaire($request->get('Salaire'));
        $em->flush();
        $jsonContent = $normalizer->normalize($offre, 'json',['groups'=>'offre']);
        return new Response("Information updated successfully".json_encode($jsonContent));
    }

    /**
     * @Route("/deleteOffreJSON/{id}", name="deleteOffreJSON")
     * @param Request $request
     * @param NormalizerInterface $normalizer
     * @param $id
     */
    public function deleteOffreJSON(Request $request,NormalizerInterface $normalizer,$id){
        $em = $this->getDoctrine()->getManager();
        $offre = $em->getRepository(Offre::class)->find($id);
        $em->remove($offre);
        $em->flush();
        $jsonContent = $normalizer->normalize($offre, 'json',['groups'=>'offre']);
        return new Response("Information deleted successfully".json_encode($jsonContent));
    }



}
