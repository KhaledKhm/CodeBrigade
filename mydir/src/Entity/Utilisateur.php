<?php

namespace App\Entity;

use App\Repository\UtilisateurRepository;
use Doctrine\ORM\Mapping as ORM;

/**
 * @ORM\Entity(repositoryClass=UtilisateurRepository::class)
 */
class Utilisateur
{
    /**
     * @ORM\Id
     * @ORM\GeneratedValue
     * @ORM\Column(type="integer")
     */
    private $id;

    /**
     * @ORM\Column(type="string", length=40, nullable=true)
     */
    private $username;

    /**
     * @ORM\Column(type="string", length=128, nullable=true)
     */
    private $password;

    /**
     * @ORM\Column(type="string", length=16, nullable=true)
     */
    private $role;

    /**
     * @ORM\Column(type="string", length=16, nullable=true)
     */
    private $accountStatus;

    /**
     * @ORM\Column(type="integer", nullable=true)
     */
    private $cinPersonne;

    /**
     * @ORM\Column(type="string", length=16, nullable=true)
     */
    private $immatriculeEntreprise;

    /**
     * @ORM\Column(type="string", length=16, nullable=true)
     */
    private $nomPersonne;

    /**
     * @ORM\Column(type="string", length=16, nullable=true)
     */
    private $prenomPersonne;

    /**
     * @ORM\Column(type="string", length=16, nullable=true)
     */
    private $libelleEntreprise;

    /**
     * @ORM\Column(type="string", length=10, nullable=true)
     */
    private $sexePersonne;

    /**
     * @ORM\Column(type="date", nullable=true)
     */
    private $dateNaisPersonne;

    /**
     * @ORM\Column(type="string", length=16, nullable=true)
     */
    private $etatSocialePersonne;

    /**
     * @ORM\Column(type="integer", nullable=true)
     */
    private $telephone;

    /**
     * @ORM\Column(type="string", length=128, nullable=true)
     */
    private $adresse;

    /**
     * @ORM\Column(type="string", length=64, nullable=true)
     */
    private $email;

    /**
     * @ORM\Column(type="string", length=64, nullable=true)
     */
    private $siteweb;

    /**
     * @ORM\Column(type="string", length=64, nullable=true)
     */
    private $domainePersonne;

    /**
     * @ORM\Column(type="string", length=64, nullable=true)
     */
    private $secteurEntreprise;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getUsername(): ?string
    {
        return $this->username;
    }

    public function setUsername(?string $username): self
    {
        $this->username = $username;

        return $this;
    }

    public function getPassword(): ?string
    {
        return $this->password;
    }

    public function setPassword(?string $password): self
    {
        $this->password = $password;

        return $this;
    }

    public function getRole(): ?string
    {
        return $this->role;
    }

    public function setRole(?string $role): self
    {
        $this->role = $role;

        return $this;
    }

    public function getAccountStatus(): ?string
    {
        return $this->accountStatus;
    }

    public function setAccountStatus(?string $accountStatus): self
    {
        $this->accountStatus = $accountStatus;

        return $this;
    }

    public function getCinPersonne(): ?int
    {
        return $this->cinPersonne;
    }

    public function setCinPersonne(?int $cinPersonne): self
    {
        $this->cinPersonne = $cinPersonne;

        return $this;
    }

    public function getImmatriculeEntreprise(): ?string
    {
        return $this->immatriculeEntreprise;
    }

    public function setImmatriculeEntreprise(?string $immatriculeEntreprise): self
    {
        $this->immatriculeEntreprise = $immatriculeEntreprise;

        return $this;
    }

    public function getNomPersonne(): ?string
    {
        return $this->nomPersonne;
    }

    public function setNomPersonne(?string $nomPersonne): self
    {
        $this->nomPersonne = $nomPersonne;

        return $this;
    }

    public function getPrenomPersonne(): ?string
    {
        return $this->prenomPersonne;
    }

    public function setPrenomPersonne(?string $prenomPersonne): self
    {
        $this->prenomPersonne = $prenomPersonne;

        return $this;
    }

    public function getLibelleEntreprise(): ?string
    {
        return $this->libelleEntreprise;
    }

    public function setLibelleEntreprise(?string $libelleEntreprise): self
    {
        $this->libelleEntreprise = $libelleEntreprise;

        return $this;
    }

    public function getSexePersonne(): ?string
    {
        return $this->sexePersonne;
    }

    public function setSexePersonne(?string $sexePersonne): self
    {
        $this->sexePersonne = $sexePersonne;

        return $this;
    }

    public function getDateNaisPersonne(): ?\DateTimeInterface
    {
        return $this->dateNaisPersonne;
    }

    public function setDateNaisPersonne(?\DateTimeInterface $dateNaisPersonne): self
    {
        $this->dateNaisPersonne = $dateNaisPersonne;

        return $this;
    }

    public function getEtatSocialePersonne(): ?string
    {
        return $this->etatSocialePersonne;
    }

    public function setEtatSocialePersonne(?string $etatSocialePersonne): self
    {
        $this->etatSocialePersonne = $etatSocialePersonne;

        return $this;
    }

    public function getTelephone(): ?int
    {
        return $this->telephone;
    }

    public function setTelephone(?int $telephone): self
    {
        $this->telephone = $telephone;

        return $this;
    }

    public function getAdresse(): ?string
    {
        return $this->adresse;
    }

    public function setAdresse(?string $adresse): self
    {
        $this->adresse = $adresse;

        return $this;
    }

    public function getEmail(): ?string
    {
        return $this->email;
    }

    public function setEmail(?string $email): self
    {
        $this->email = $email;

        return $this;
    }

    public function getSiteweb(): ?string
    {
        return $this->siteweb;
    }

    public function setSiteweb(?string $siteweb): self
    {
        $this->siteweb = $siteweb;

        return $this;
    }

    public function getDomainePersonne(): ?string
    {
        return $this->domainePersonne;
    }

    public function setDomainePersonne(?string $domainePersonne): self
    {
        $this->domainePersonne = $domainePersonne;

        return $this;
    }

    public function getSecteurEntreprise(): ?string
    {
        return $this->secteurEntreprise;
    }

    public function setSecteurEntreprise(?string $secteurEntreprise): self
    {
        $this->secteurEntreprise = $secteurEntreprise;

        return $this;
    }
}
