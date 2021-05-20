<?php

namespace App\Entity;

use App\Repository\OffreRepository;
use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\Common\Collections\Collection;
use Doctrine\ORM\Mapping as ORM;
use phpDocumentor\Reflection\Types\Integer;
use Symfony\Component\Serializer\Annotation\Groups;

/**
 * @ORM\Entity(repositoryClass=OffreRepository::class)
 */
class Offre
{
    /**
     * @ORM\Id
     * @ORM\GeneratedValue
     * @ORM\Column(type="integer")
     * @Groups("offre")
     */
    private $id;

    /**
     * @ORM\Column(type="string", length=255)
     * @Groups("offre")
     */
    private $Libelle;

    /**
     * @ORM\Column(type="string", length=255)
     * @Groups("offre")
     */
    private $Description;

    /**
     * @ORM\Column(type="string")
     * @Groups("offre")
     */
    private $Salaire;

    /**
     * @ORM\ManyToMany(targetEntity=Postulant::class, inversedBy="offres")

     */
    private $postulants;


    public function getId(): ?int
    {
        return $this->id;
    }

    public function getLibelle(): ?string
    {
        return $this->Libelle;
    }

    public function setLibelle(string $Libelle): self
    {
        $this->Libelle = $Libelle;

        return $this;
    }

    public function getDescription(): ?string
    {
        return $this->Description;
    }

    public function setDescription(string $Description): self
    {
        $this->Description = $Description;

        return $this;
    }

    public function getSalaire(): ?string
    {
        return $this->Salaire;
    }

    public function setSalaire(string $Salaire): self
    {
        $this->Salaire = $Salaire;

        return $this;
    }


    /**
     * @return Collection|Postulant[]
     */
    public function getPostulants(): Collection
    {
        return $this->postulants;
    }

    public function addPostulant(Postulant $postulant): self
    {
        if (!$this->postulants->contains($postulant)) {
            $this->postulants[] = $postulant;
        }

        return $this;
    }

    public function removePostulant(Postulant $postulant): self
    {
        $this->postulants->removeElement($postulant);

        return $this;
    }

}
