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

/* emails/rendezvous.html.twig */
class __TwigTemplate_3487c6fee0115748ddfebc397209c011993127ffe8f002bcaea95dec2723134c extends Template
{
    private $source;
    private $macros = [];

    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->source = $this->getSourceContext();

        $this->parent = false;

        $this->blocks = [
        ];
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "emails/rendezvous.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "emails/rendezvous.html.twig"));

        // line 1
        echo "
<h1>Nouveau Rendez-vous</h1>
<p>Titre : ";
        // line 3
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["rdv"]) || array_key_exists("rdv", $context) ? $context["rdv"] : (function () { throw new RuntimeError('Variable "rdv" does not exist.', 3, $this->source); })()), "TitreOffre", [], "any", false, false, false, 3), "html", null, true);
        echo "</p>
<p>Email : ";
        // line 4
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["rdv"]) || array_key_exists("rdv", $context) ? $context["rdv"] : (function () { throw new RuntimeError('Variable "rdv" does not exist.', 4, $this->source); })()), "email", [], "any", false, false, false, 4), "html", null, true);
        echo "</p>
<p>Votre demande a été acceptée, merci d'étre au rendez-vous.<br/>
   le rendez-vous sera le : ";
        // line 6
        echo twig_escape_filter($this->env, twig_date_format_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["rdv"]) || array_key_exists("rdv", $context) ? $context["rdv"] : (function () { throw new RuntimeError('Variable "rdv" does not exist.', 6, $this->source); })()), "date", [], "any", false, false, false, 6), "d-m-Y"), "html", null, true);
        echo " au ";
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["rdv"]) || array_key_exists("rdv", $context) ? $context["rdv"] : (function () { throw new RuntimeError('Variable "rdv" does not exist.', 6, $this->source); })()), "Adresse", [], "any", false, false, false, 6), "html", null, true);
        echo " </p>
";
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    public function getTemplateName()
    {
        return "emails/rendezvous.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  56 => 6,  51 => 4,  47 => 3,  43 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("
<h1>Nouveau Rendez-vous</h1>
<p>Titre : {{ rdv.TitreOffre }}</p>
<p>Email : {{ rdv.email }}</p>
<p>Votre demande a été acceptée, merci d'étre au rendez-vous.<br/>
   le rendez-vous sera le : {{ rdv.date|date('d-m-Y')}} au {{ rdv.Adresse}} </p>
", "emails/rendezvous.html.twig", "C:\\Users\\firas\\OneDrive\\Documents\\GitHub\\CodeBrigade\\rdvoffre\\templates\\emails\\rendezvous.html.twig");
    }
}
