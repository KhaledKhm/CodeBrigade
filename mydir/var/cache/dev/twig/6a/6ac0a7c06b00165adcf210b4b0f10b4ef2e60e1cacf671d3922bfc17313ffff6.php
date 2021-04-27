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

/* postulant/a.html.twig */
class __TwigTemplate_63b78b92e7c13ec8a49e13bc10febaf428668cd44d29ca592d2f3b7877089edb extends Template
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
        return "base.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/a.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/a.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "postulant/a.html.twig", 1);
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
        echo "    <h4>Inscription Evenements</h4>
    <br><br><br>
    <table id=\"bootstrap-data-table\"class=\"table\" >

        <th>Nom</th>
        <th>Prénom</th>
        <th>Sexe</th>
        <th>Etat Scolaire</th>
        <th>Adresse</th>
        <th>Telephone</th>
        <th>Email</th>
        <th>Status</th>
        <th>Date de naissance</th>
        <th>Compétence</th>

        </tr>
        ";
        // line 19
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable((isset($context["post"]) || array_key_exists("post", $context) ? $context["post"] : (function () { throw new RuntimeError('Variable "post" does not exist.', 19, $this->source); })()));
        foreach ($context['_seq'] as $context["_key"] => $context["Post"]) {
            // line 20
            echo "            <tr>

                <td>
                    ";
            // line 23
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Nom", [], "any", false, false, false, 23), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 26
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Prenom", [], "any", false, false, false, 26), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 29
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Sexe", [], "any", false, false, false, 29), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 32
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "EtatScolaire", [], "any", false, false, false, 32), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 35
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Adresse", [], "any", false, false, false, 35), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 38
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Telephone", [], "any", false, false, false, 38), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 41
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Email", [], "any", false, false, false, 41), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 44
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Status", [], "any", false, false, false, 44), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 47
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "DateNais", [], "any", false, false, false, 47), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 50
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Competences", [], "any", false, false, false, 50), "html", null, true);
            echo "
                </td>
                <td>
                    <form ><button  class=\"btn btn-outline-info\"><h6>Send Mail</h6></button></form>
                </td>


            </tr>
        ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['Post'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 59
        echo "    </table>

";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "postulant/a.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  164 => 59,  149 => 50,  143 => 47,  137 => 44,  131 => 41,  125 => 38,  119 => 35,  113 => 32,  107 => 29,  101 => 26,  95 => 23,  90 => 20,  86 => 19,  68 => 3,  58 => 2,  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base.html.twig' %}
{% block body %}
    <h4>Inscription Evenements</h4>
    <br><br><br>
    <table id=\"bootstrap-data-table\"class=\"table\" >

        <th>Nom</th>
        <th>Prénom</th>
        <th>Sexe</th>
        <th>Etat Scolaire</th>
        <th>Adresse</th>
        <th>Telephone</th>
        <th>Email</th>
        <th>Status</th>
        <th>Date de naissance</th>
        <th>Compétence</th>

        </tr>
        {% for Post in post %}
            <tr>

                <td>
                    {{Post.Nom}}
                </td>
                <td>
                    {{Post.Prenom}}
                </td>
                <td>
                    {{ Post.Sexe}}
                </td>
                <td>
                    {{ Post.EtatScolaire}}
                </td>
                <td>
                    {{ Post.Adresse}}
                </td>
                <td>
                    {{ Post.Telephone}}
                </td>
                <td>
                    {{ Post.Email}}
                </td>
                <td>
                    {{ Post.Status}}
                </td>
                <td>
                    {{ Post.DateNais}}
                </td>
                <td>
                    {{ Post.Competences}}
                </td>
                <td>
                    <form ><button  class=\"btn btn-outline-info\"><h6>Send Mail</h6></button></form>
                </td>


            </tr>
        {% endfor %}
    </table>

{% endblock %}
", "postulant/a.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\postulant\\a.html.twig");
    }
}
