<?php

use Twig\Environment;
use Twig\Error\LoaderError;
use Twig\Error\RuntimeError;
use Twig\Extension\SandboxExtension;
use Twig\Markup;
use Twig\Sandbox\SecurityError;
use Twig\Sandbox\SecurityNotAllowedTagError;
use Twig\Sandbox\SecurityNotAllowedFilterError;
use Twig\Sandbox\SecurityNotAllowedFunctionError;
use Twig\Source;
use Twig\Template;

/* postulant/add.html.twig */
class __TwigTemplate_a1e798d2931bbc32ddb38a81865ac06cb67a8308d2835520f674effe5e46c9d1 extends Template
{
    private $source;
    private $macros = [];

    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->source = $this->getSourceContext();

        $this->blocks = [
            'body' => [$this, 'block_body'],
        ];
    }

    protected function doGetParent(array $context)
    {
        // line 1
        return "base2.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/add.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/add.html.twig"));

        $this->parent = $this->loadTemplate("base2.html.twig", "postulant/add.html.twig", 1);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 2
    public function block_body($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 3
        echo "    <!DOCTYPE html>
    <html>
    <head>
        <style>
            * {
                box-sizing: border-box;
            }

            input[type=text], select, textarea {
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                resize: vertical;
            }

            label {
                padding: 12px 12px 12px 0;
                display: inline-block;
                display: block;
                font: 1rem 'Fira Sans', sans-serif;
            }

            input[type=submit] {
                background-color: #4CAF50;
                color: white;
                padding: 12px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                float: right;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }


            .col-25 {
                float: left;
                width: 25%;
                margin-top: 6px;
            }

            .col-75 {
                float: left;
                width: 75%;
                margin-top: 6px;
            }

            /* Clear floats after the columns */
            .row:after {
                content: \"\";
                display: table;
                clear: both;
            }

            /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
            @media screen and (max-width: 600px) {
                .col-25, .col-75, input[type=submit] {
                    width: 100%;
                    margin-top: 0;
                }
            }
        </style>
        <script>
            function Verif(){
                var nom=document.form1.Nom.value;
                var prenom=document.form1.Prenom.value;
                var Etat=document.form1.EtatScolaire.value;
                var Adresse=document.form1.Adresse.value;
                var Telephone=document.form1.Telephone.value;
                var Email=document.form1.Email.value;
                var Telephone=document.form1.Status.value;
                var datenais=document.form1.DateNais.value;
                var Competence=document.form1.Competences.value;

                if (nom==null || nom==\"\"){
                    alert(\"votre Nom ne peut pas être vide.\");
                    return false;
                }else if(prenom == null || prenom== \"\"){
                    alert(\"votre prenom ne peut pas etre vide.\");
                    return false;
                }
                else if(Etat == null || Etat == \"\"){
                    alert(\"Entrer Votre Etat Scolaire!\");
                    return false;
                }
                else if(Adresse == null || Adresse==\"\"){
                    alert(\"Entrer Votre Adresse!\");
                    return false;
                } else if(Telephone == null || Telephone == \"\"){
                    alert(\"la Numéro de telephone ne peut pas être vide.\");
                    return false;
                }else if(Email == null || Email == \"\"){
                    alert(\"l'email ne peut pas être vide.\");
                    return false;
                }else if(datenais == null || datenais == \"\"){
                    alert(\"la Date de naissance ne peut pas être vide.\");
                    return false;
                }else if(Competence == null || Competence == \"\"){
                    alert(\"Entrer Vos Competences!\");
                    return false;
                }


                alert('Vous avez ajouter un Post avec success Merci.');
            }
        </script>
    </head>
    <body>

    <h1>Créer une nouvelle Post</h1>
    <div class=\"container\">
        <form action=\"\" method=\"post\" name=\"form1\">
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Nom\">Nom</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"Nom\" placeholder=\"Nom..\">
                </div>
            </div>

            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Prenom\">Prénom</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\" placeholder=\"Prénom\" name=\"Prenom\">
                </div>
            </div>
                    Sexe:
            <p>
                    Homme : <input type=\"radio\" value=\"Homme\" name=\"Sexe\" >
                    Femme : <input type=\"radio\" value=\"Femme\" name=\"Sexe\" >
            </p>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"EtatScolaire\">Etat Scolaire</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"EtatScolaire\" placeholder=\"Etat Scolaire..\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Adresse\">Adresse</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"Adresse\" placeholder=\"Adresse..\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Telephone\">Téléphone</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"number\"  name=\"Telephone\" placeholder=\"Téléphone..\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Email\">Email</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"Email\" placeholder=\"Email..\">
                </div>
            </div>
                    <label for=\"Status\">Status</label>
                <p>
                    Marié(e): <input  type=\"radio\"  name=\"Status\" value=\"Marié(e)\" >
                    Celibataire: <input  type=\"radio\"  name=\"Status\" value=\"Celibataire\" >
                </p>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"DateNais\">Date de naissance</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"date\"  name=\"DateNais\" placeholder=\"Date de naissance..\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Competences\">Competences</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"Competences\" placeholder=\"Competneces..\">
                </div>
            </div>
            <div class=\"row\">
                <input type=\"submit\" value=\"Submit\" onclick=\"Verif()\">
            </div>
        </form>
    </div>
    </body>
    </html>


";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "postulant/add.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  68 => 3,  58 => 2,  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base2.html.twig' %}
{% block body %}
    <!DOCTYPE html>
    <html>
    <head>
        <style>
            * {
                box-sizing: border-box;
            }

            input[type=text], select, textarea {
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                resize: vertical;
            }

            label {
                padding: 12px 12px 12px 0;
                display: inline-block;
                display: block;
                font: 1rem 'Fira Sans', sans-serif;
            }

            input[type=submit] {
                background-color: #4CAF50;
                color: white;
                padding: 12px 20px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                float: right;
            }

            input[type=submit]:hover {
                background-color: #45a049;
            }


            .col-25 {
                float: left;
                width: 25%;
                margin-top: 6px;
            }

            .col-75 {
                float: left;
                width: 75%;
                margin-top: 6px;
            }

            /* Clear floats after the columns */
            .row:after {
                content: \"\";
                display: table;
                clear: both;
            }

            /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
            @media screen and (max-width: 600px) {
                .col-25, .col-75, input[type=submit] {
                    width: 100%;
                    margin-top: 0;
                }
            }
        </style>
        <script>
            function Verif(){
                var nom=document.form1.Nom.value;
                var prenom=document.form1.Prenom.value;
                var Etat=document.form1.EtatScolaire.value;
                var Adresse=document.form1.Adresse.value;
                var Telephone=document.form1.Telephone.value;
                var Email=document.form1.Email.value;
                var Telephone=document.form1.Status.value;
                var datenais=document.form1.DateNais.value;
                var Competence=document.form1.Competences.value;

                if (nom==null || nom==\"\"){
                    alert(\"votre Nom ne peut pas être vide.\");
                    return false;
                }else if(prenom == null || prenom== \"\"){
                    alert(\"votre prenom ne peut pas etre vide.\");
                    return false;
                }
                else if(Etat == null || Etat == \"\"){
                    alert(\"Entrer Votre Etat Scolaire!\");
                    return false;
                }
                else if(Adresse == null || Adresse==\"\"){
                    alert(\"Entrer Votre Adresse!\");
                    return false;
                } else if(Telephone == null || Telephone == \"\"){
                    alert(\"la Numéro de telephone ne peut pas être vide.\");
                    return false;
                }else if(Email == null || Email == \"\"){
                    alert(\"l'email ne peut pas être vide.\");
                    return false;
                }else if(datenais == null || datenais == \"\"){
                    alert(\"la Date de naissance ne peut pas être vide.\");
                    return false;
                }else if(Competence == null || Competence == \"\"){
                    alert(\"Entrer Vos Competences!\");
                    return false;
                }


                alert('Vous avez ajouter un Post avec success Merci.');
            }
        </script>
    </head>
    <body>

    <h1>Créer une nouvelle Post</h1>
    <div class=\"container\">
        <form action=\"\" method=\"post\" name=\"form1\">
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Nom\">Nom</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"Nom\" placeholder=\"Nom..\">
                </div>
            </div>

            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Prenom\">Prénom</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\" placeholder=\"Prénom\" name=\"Prenom\">
                </div>
            </div>
                    Sexe:
            <p>
                    Homme : <input type=\"radio\" value=\"Homme\" name=\"Sexe\" >
                    Femme : <input type=\"radio\" value=\"Femme\" name=\"Sexe\" >
            </p>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"EtatScolaire\">Etat Scolaire</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"EtatScolaire\" placeholder=\"Etat Scolaire..\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Adresse\">Adresse</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"Adresse\" placeholder=\"Adresse..\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Telephone\">Téléphone</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"number\"  name=\"Telephone\" placeholder=\"Téléphone..\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Email\">Email</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"Email\" placeholder=\"Email..\">
                </div>
            </div>
                    <label for=\"Status\">Status</label>
                <p>
                    Marié(e): <input  type=\"radio\"  name=\"Status\" value=\"Marié(e)\" >
                    Celibataire: <input  type=\"radio\"  name=\"Status\" value=\"Celibataire\" >
                </p>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"DateNais\">Date de naissance</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"date\"  name=\"DateNais\" placeholder=\"Date de naissance..\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Competences\">Competences</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\"  name=\"Competences\" placeholder=\"Competneces..\">
                </div>
            </div>
            <div class=\"row\">
                <input type=\"submit\" value=\"Submit\" onclick=\"Verif()\">
            </div>
        </form>
    </div>
    </body>
    </html>


{% endblock %}", "postulant/add.html.twig", "C:\\Users\\firas\\OneDrive\\Documents\\GitHub\\CodeBrigade\\rdvoffre\\templates\\postulant\\add.html.twig");
    }
}
