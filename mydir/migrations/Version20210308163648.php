<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20210308163648 extends AbstractMigration
{
    public function getDescription() : string
    {
        return '';
    }

    public function up(Schema $schema) : void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('CREATE TABLE evenement_promotion (evenement_id INT NOT NULL, promotion_id INT NOT NULL, INDEX IDX_6F437100FD02F13 (evenement_id), INDEX IDX_6F437100139DF194 (promotion_id), PRIMARY KEY(evenement_id, promotion_id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE evenement_postulant (evenement_id INT NOT NULL, postulant_id INT NOT NULL, INDEX IDX_59CD99C3FD02F13 (evenement_id), INDEX IDX_59CD99C31CD30E78 (postulant_id), PRIMARY KEY(evenement_id, postulant_id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('CREATE TABLE postulant_evenement (postulant_id INT NOT NULL, evenement_id INT NOT NULL, INDEX IDX_E53528E21CD30E78 (postulant_id), INDEX IDX_E53528E2FD02F13 (evenement_id), PRIMARY KEY(postulant_id, evenement_id)) DEFAULT CHARACTER SET utf8mb4 COLLATE `utf8mb4_unicode_ci` ENGINE = InnoDB');
        $this->addSql('ALTER TABLE evenement_promotion ADD CONSTRAINT FK_6F437100FD02F13 FOREIGN KEY (evenement_id) REFERENCES evenement (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE evenement_promotion ADD CONSTRAINT FK_6F437100139DF194 FOREIGN KEY (promotion_id) REFERENCES promotion (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE evenement_postulant ADD CONSTRAINT FK_59CD99C3FD02F13 FOREIGN KEY (evenement_id) REFERENCES evenement (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE evenement_postulant ADD CONSTRAINT FK_59CD99C31CD30E78 FOREIGN KEY (postulant_id) REFERENCES postulant (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE postulant_evenement ADD CONSTRAINT FK_E53528E21CD30E78 FOREIGN KEY (postulant_id) REFERENCES postulant (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE postulant_evenement ADD CONSTRAINT FK_E53528E2FD02F13 FOREIGN KEY (evenement_id) REFERENCES evenement (id) ON DELETE CASCADE');
        $this->addSql('ALTER TABLE evenement CHANGE prix_inscription prix_inscription INT NOT NULL');
    }

    public function down(Schema $schema) : void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('DROP TABLE evenement_promotion');
        $this->addSql('DROP TABLE evenement_postulant');
        $this->addSql('DROP TABLE postulant_evenement');
        $this->addSql('ALTER TABLE evenement CHANGE prix_inscription prix_inscription VARCHAR(255) CHARACTER SET utf8mb4 NOT NULL COLLATE `utf8mb4_unicode_ci`');
    }
}
