<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20210303003044 extends AbstractMigration
{
    public function getDescription() : string
    {
        return '';
    }

    public function up(Schema $schema) : void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('CREATE TABLE offre (id INT AUTO_INCREMENT NOT NULL, libelle VARCHAR(255) NOT NULL, desription VARCHAR(255) NOT NULL, salaire INT NOT NULL, disponabilite VARCHAR(255) NOT NULL, date_limite DATE NOT NULL, PRIMARY KEY(id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE postulant (id INT AUTO_INCREMENT NOT NULL, prenom VARCHAR(255) NOT NULL, sexe VARCHAR(255) NOT NULL, etat_scolaire VARCHAR(255) NOT NULL, adresse VARCHAR(255) NOT NULL, telephone INT NOT NULL, date_nais DATE NOT NULL, email VARCHAR(255) NOT NULL, status VARCHAR(255) NOT NULL, competences VARCHAR(255) NOT NULL, nom VARCHAR(255) NOT NULL, PRIMARY KEY(id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
    }

    public function down(Schema $schema) : void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('DROP TABLE offre');
        $this->addSql('DROP TABLE postulant');
    }
}
