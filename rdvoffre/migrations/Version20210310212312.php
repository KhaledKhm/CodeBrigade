<?php

declare(strict_types=1);

namespace DoctrineMigrations;

use Doctrine\DBAL\Schema\Schema;
use Doctrine\Migrations\AbstractMigration;

/**
 * Auto-generated Migration: Please modify to your needs!
 */
final class Version20210310212312 extends AbstractMigration
{
    public function getDescription() : string
    {
        return '';
    }

    public function up(Schema $schema) : void
    {
        // this up() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE offre ADD post_favoris_id INT DEFAULT NULL');
        $this->addSql('ALTER TABLE offre ADD CONSTRAINT FK_AF86866F72908EDA FOREIGN KEY (post_favoris_id) REFERENCES postulant (id)');
        $this->addSql('CREATE INDEX IDX_AF86866F72908EDA ON offre (post_favoris_id)');
    }

    public function down(Schema $schema) : void
    {
        // this down() migration is auto-generated, please modify it to your needs
        $this->addSql('ALTER TABLE offre DROP FOREIGN KEY FK_AF86866F72908EDA');
        $this->addSql('DROP INDEX IDX_AF86866F72908EDA ON offre');
        $this->addSql('ALTER TABLE offre DROP post_favoris_id');
    }
}
