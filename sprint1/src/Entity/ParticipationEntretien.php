<?php

namespace App\Entity;

use App\Repository\ParticipationEntretienRepository;
use Doctrine\ORM\Mapping as ORM;

/**
 * @ORM\Entity(repositoryClass=ParticipationEntretienRepository::class)
 */
class ParticipationEntretien
{
    /**
     * @ORM\Id
     * @ORM\GeneratedValue
     * @ORM\Column(type="integer")
     */
    private $code;

    /**
     * @ORM\Column(type="integer")
     */
    private $idE;

    /**
     * @ORM\Column(type="integer")
     */
    private $idevaluation;

    /**
    /**
     * @ORM\Column(type="integer")
     */
    private $idP;

    public function getCode(): ?int
    {
        return $this->code;
    }

    public function getIdE(): ?int
    {
        return $this->idE;
    }

    public function setIdE(int $idE): self
    {
        $this->idE = $idE;

        return $this;
    }

    public function getIdP(): ?int
    {
        return $this->idP;
    }

    public function setIdP(int $idP): self
    {
        $this->idP = $idP;

        return $this;
    }

    public function getIdEvaluation(): ?int
    {
        return $this->idevaluation;
    }

    public function setIdEvaluation(int $idevaluation): self
    {
        $this->idevaluation = $idevaluation;

        return $this;
    }
}
