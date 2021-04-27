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

/* postulant/add1.html.twig */
class __TwigTemplate_3e8cf4a7efca56c58f9ed1b9cc221a87d2bfb08d1b09d09b56e762f9972be94b extends Template
{
    private $source;
    private $macros = [];

    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->source = $this->getSourceContext();

        $this->blocks = [
            'content' => [$this, 'block_content'],
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/add1.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/add1.html.twig"));

        $this->parent = $this->loadTemplate("base2.html.twig", "postulant/add1.html.twig", 1);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 2
    public function block_content($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "content"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "content"));

        echo "  ";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    // line 3
    public function block_body($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        // line 4
        echo "    <!DOCTYPE html>
    <html lang=\"en\">
    <head>
        <meta charset=\"UTF-8\">
        <title>ajouter participation</title>
    </head>
    <body>
    <h1>Créer une nouvelle Post</h1>
    <form action=\"\" method=\"POST\">
        Nom: <input type=\"text\" placeholder=\"Nom\" name=\"Nom\">
        Prenom: <input type=\"text\" placeholder=\"Prenom\" name=\"Prenom\">
        Sexe:
        <p>
            Homme: <input type=\"radio\" name=\"Sexe\" value=\"Homme\"/><br />
            femme: <input type=\"radio\" name=\"Sexe\" value=\"femme\"/>
        </p>
        EtatScolaire: <input type=\"text\" placeholder=\"EtatScolaire\" name=\"EtatScolaire\">
        Adresse: <input type=\"text\" placeholder=\"Adresse\" name=\"Adresse\">
        Date de naissance: <input type=\"date\" placeholder=\"DateNais\" name=\"DateNais\">
        Telephone: <input type=\"text\" placeholder=\"Telephone\" name=\"Telephone\">
        Status:
        <p>
            Marié(e) <input type=\"radio\" placeholder=\"Status\" name=\"Status\" value=\"Marié(e)\">
            Célibaire <input type=\"radio\" placeholder=\"Status\" name=\"Status\" value=\"Célibaire\">
        </p>
        Competences: <input type=\"text\" placeholder=\"Competences\" name=\"Competences\">
        Email: <input type=\"text\" placeholder=\"Email\" name=\"Email\">


        <button type=\"submit\" class=\"btn btn-primary btn-sm\">submit</button>
    </form>
    </body>
    </html>
";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "postulant/add1.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  88 => 4,  78 => 3,  59 => 2,  36 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base2.html.twig' %}
 {% block content %}  {% endblock  %}
{% block body %}
    <!DOCTYPE html>
    <html lang=\"en\">
    <head>
        <meta charset=\"UTF-8\">
        <title>ajouter participation</title>
    </head>
    <body>
    <h1>Créer une nouvelle Post</h1>
    <form action=\"\" method=\"POST\">
        Nom: <input type=\"text\" placeholder=\"Nom\" name=\"Nom\">
        Prenom: <input type=\"text\" placeholder=\"Prenom\" name=\"Prenom\">
        Sexe:
        <p>
            Homme: <input type=\"radio\" name=\"Sexe\" value=\"Homme\"/><br />
            femme: <input type=\"radio\" name=\"Sexe\" value=\"femme\"/>
        </p>
        EtatScolaire: <input type=\"text\" placeholder=\"EtatScolaire\" name=\"EtatScolaire\">
        Adresse: <input type=\"text\" placeholder=\"Adresse\" name=\"Adresse\">
        Date de naissance: <input type=\"date\" placeholder=\"DateNais\" name=\"DateNais\">
        Telephone: <input type=\"text\" placeholder=\"Telephone\" name=\"Telephone\">
        Status:
        <p>
            Marié(e) <input type=\"radio\" placeholder=\"Status\" name=\"Status\" value=\"Marié(e)\">
            Célibaire <input type=\"radio\" placeholder=\"Status\" name=\"Status\" value=\"Célibaire\">
        </p>
        Competences: <input type=\"text\" placeholder=\"Competences\" name=\"Competences\">
        Email: <input type=\"text\" placeholder=\"Email\" name=\"Email\">


        <button type=\"submit\" class=\"btn btn-primary btn-sm\">submit</button>
    </form>
    </body>
    </html>
{% endblock %}", "postulant/add1.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\postulant\\add1.html.twig");
    }
}
