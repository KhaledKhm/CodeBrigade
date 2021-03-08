<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20210308165020 extends AbstractMigration
{
    public function getDescription() : string
    {
        return '';
    }

    public function up(Schema $schema) : void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('CREATE TABLE evenement_postulant (evenement_id INT NOT NULL, postulant_id INT NOT NULL, INDEX IDX_59CD99C3FD02F13 (evenement_id), INDEX IDX_59CD99C31CD30E78 (postulant_id), PRIMARY KEY(evenement_id, postulant_id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('ALTER TABLE evenement_postulant ADD CONSTRAINT FK_59CD99C3FD02F13 FOREIGN KEY (evenement_id) REFERENCES evenement (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE evenement_postulant ADD CONSTRAINT FK_59CD99C31CD30E78 FOREIGN KEY (postulant_id) REFERENCES postulant (id) ON DELETE CASCADE');
    }

    public function down(Schema $schema) : void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('DROP TABLE evenement_postulant');
    }
}
