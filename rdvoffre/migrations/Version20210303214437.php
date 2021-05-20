<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20210303214437 extends AbstractMigration
{
    public function getDescription() : string
    {
        return '';
    }

    public function up(Schema $schema) : void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('CREATE TABLE offre_postulant (offre_id INT NOT NULL, postulant_id INT NOT NULL, INDEX IDX_AB1B3DED4CC8505A (offre_id), INDEX IDX_AB1B3DED1CD30E78 (postulant_id), PRIMARY KEY(offre_id, postulant_id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('ALTER TABLE offre_postulant ADD CONSTRAINT FK_AB1B3DED4CC8505A FOREIGN KEY (offre_id) REFERENCES offre (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE offre_postulant ADD CONSTRAINT FK_AB1B3DED1CD30E78 FOREIGN KEY (postulant_id) REFERENCES postulant (id) ON DELETE CASCADE');
    }

    public function down(Schema $schema) : void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('DROP TABLE offre_postulant');
    }
}
