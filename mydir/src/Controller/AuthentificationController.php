<?php

namespace App\Controller;

use Scheb\TwoFactorBundle\Security\TwoFactor\Provider\Google\GoogleAuthenticatorInterface;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Annotation\Route;
use Symfony\Component\Security\Core\Authentication\Token\Storage\TokenStorageInterface;

class AuthentificationController extends AbstractController
{
    /**
     * @Route("/login", name="login")
     */
    public function login()
    {
        return $this->render('authentification/login.html.twig');
    }
    /**
     * @Route("/logout", name="logout")
     */
    public function logout(){

    }
/*
    /**
     * @Route("/2fa", name="2fa_login")
     */
  /*  public function displayGoogleAuthenticatorQrCode(QrCodeGenerator $qrCodeGenerator)
    {
        // $qrCode is provided by the endroid/qr-code library. See the docs how to customize the look of the QR code:
        // https://github.com/endroid/qr-code
        $qrCode = $qrCodeGenerator->getGoogleAuthenticatorQrCode($this->getUser());

        return new Response($qrCode->writeString(), 200, ['Content-Type' => 'image/png']);
    }*/


    /**
     * @Route("/2fa", name="2fa_login")
     */

    public function check2fa(GoogleAuthenticatorInterface $authenticator, TokenStorageInterface $storage){
        $code = $authenticator->getQRContent($storage->getToken()->getUser());
        $qrCode ="http://chart.apis.google.com/chart?cht=qr&chs=150x150&chl=".$code;
        return $this->render('authentification/2fa.html.twig', [
            'qrCode' => $qrCode]);
    }
}
