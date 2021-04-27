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

/* postulant/list.html.twig */
class __TwigTemplate_3192fa1f9d6961ae634357204407a7d28884b3e8ada9e183742587e0b5df0c91 extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/list.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/list.html.twig"));

        $this->parent = $this->loadTemplate("base2.html.twig", "postulant/list.html.twig", 1);
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
        echo "
    <table class=\"table\">
        <tr class=\"table-light\">
            <th scope=\"col\">Nom</th>
            <th scope=\"col\">Prénom</th>
            <th scope=\"col\">Sexe</th>
            <th scope=\"col\">Etat Scolaire</th>
            <th scope=\"col\">Adresse</th>
            <th scope=\"col\">Telephone</th>
            <th scope=\"col\">Email</th>
            <th scope=\"col\">Status</th>
            <th scope=\"col\">Date de naissance</th>
            <th scope=\"col\">Compétence</th>
        </tr>
        ";
        // line 17
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable((isset($context["post"]) || array_key_exists("post", $context) ? $context["post"] : (function () { throw new RuntimeError('Variable "post" does not exist.', 17, $this->source); })()));
        foreach ($context['_seq'] as $context["_key"] => $context["Post"]) {
            // line 18
            echo "            <tr>
                <td>
                    ";
            // line 20
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Nom", [], "any", false, false, false, 20), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 23
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Prenom", [], "any", false, false, false, 23), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 26
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Sexe", [], "any", false, false, false, 26), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 29
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "EtatScolaire", [], "any", false, false, false, 29), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 32
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Adresse", [], "any", false, false, false, 32), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 35
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Telephone", [], "any", false, false, false, 35), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 38
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Email", [], "any", false, false, false, 38), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 41
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Status", [], "any", false, false, false, 41), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 44
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "DateNais", [], "any", false, false, false, 44), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 47
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Post"], "Competences", [], "any", false, false, false, 47), "html", null, true);
            echo "
                </td>
                <td>
                    <a class=\"btn btn-success\" href=\"";
            // line 50
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("rendezvous", ["id" => twig_get_attribute($this->env, $this->source, $context["Post"], "id", [], "any", false, false, false, 50)]), "html", null, true);
            echo "\">Accepter</a>
                </td>
                <td>
                    <form  action=\"";
            // line 53
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("suppPost", ["id" => twig_get_attribute($this->env, $this->source, $context["Post"], "id", [], "any", false, false, false, 53)]), "html", null, true);
            echo "\"><button type=\"submit\" class=\"btn btn-danger\"> supprimer</button></form>
                </td>

            </tr>
        ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['Post'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 58
        echo "    </table>
";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "postulant/list.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  169 => 58,  158 => 53,  152 => 50,  146 => 47,  140 => 44,  134 => 41,  128 => 38,  122 => 35,  116 => 32,  110 => 29,  104 => 26,  98 => 23,  92 => 20,  88 => 18,  84 => 17,  68 => 3,  58 => 2,  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base2.html.twig' %}
{% block body %}

    <table class=\"table\">
        <tr class=\"table-light\">
            <th scope=\"col\">Nom</th>
            <th scope=\"col\">Prénom</th>
            <th scope=\"col\">Sexe</th>
            <th scope=\"col\">Etat Scolaire</th>
            <th scope=\"col\">Adresse</th>
            <th scope=\"col\">Telephone</th>
            <th scope=\"col\">Email</th>
            <th scope=\"col\">Status</th>
            <th scope=\"col\">Date de naissance</th>
            <th scope=\"col\">Compétence</th>
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
                    <a class=\"btn btn-success\" href=\"{{ path('rendezvous',{'id':Post.id})}}\">Accepter</a>
                </td>
                <td>
                    <form  action=\"{{ path('suppPost',{'id':Post.id})}}\"><button type=\"submit\" class=\"btn btn-danger\"> supprimer</button></form>
                </td>

            </tr>
        {% endfor %}
    </table>
{% endblock %}", "postulant/list.html.twig", "C:\\Users\\firas\\OneDrive\\Documents\\GitHub\\CodeBrigade\\rdvoffre\\templates\\postulant\\list.html.twig");
    }
}
