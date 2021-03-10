<?php

namespace App\Entity;

use App\Repository\AvisRepository;
use Doctrine\ORM\Mapping as ORM;

/**
 * @ORM\Entity(repositoryClass=AvisRepository::class)
 */
class Avis
{
    /**
     * @ORM\Id
     * @ORM\GeneratedValue
     * @ORM\Column(type="integer")
     */
    private $id;


    /**
     * @ORM\Column(type="string", length=50)
     */
    private $commentaire;

    /**
     * @ORM\Column(type="integer")
     */
    private $Etoiles;

    public function getId(): ?int
    {
        return $this->id;
    }


    public function getCommentaire(): ?string
    {
        return $this->commentaire;
    }

    public function setCommentaire(string $commentaire): self
    {
        $this->commentaire = $commentaire;

        return $this;
    }

    public function getEtoiles(): ?int
    {
        return $this->Etoiles;
    }

    public function setEtoiles(int $Etoiles): self
    {
        $this->Etoiles = $Etoiles;

        return $this;
    }
}
