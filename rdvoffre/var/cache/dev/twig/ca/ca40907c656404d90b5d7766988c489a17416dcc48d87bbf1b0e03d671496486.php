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

/* offre/index.html.twig */
class __TwigTemplate_00e22ef5b9ef0cebdee154ba47f1c540b117353662472e40c9ef2c2f1493dea4 extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "offre/index.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "offre/index.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "offre/index.html.twig", 1);
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
        echo "    <table class=\"table\">
        <tr class=\"table-light\">
            <th scope=\"col\">Description</th>
            <th scope=\"col\">Libelle</th>
            <th scope=\"col\">Date Limite</th>
            <th scope=\"col\">Salaire</th>
            <th scope=\"col\">Disponabilite</th>
            <th scope=\"col\">Modifier</th>
            <th scope=\"col\">Supprimer</th>
        </tr>
        ";
        // line 13
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable((isset($context["class"]) || array_key_exists("class", $context) ? $context["class"] : (function () { throw new RuntimeError('Variable "class" does not exist.', 13, $this->source); })()));
        foreach ($context['_seq'] as $context["_key"] => $context["Offre"]) {
            // line 14
            echo "            <tr>
                <td>
                    ";
            // line 16
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Offre"], "Description", [], "any", false, false, false, 16), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 19
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Offre"], "Libelle", [], "any", false, false, false, 19), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 22
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Offre"], "DateLimite", [], "any", false, false, false, 22), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 25
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Offre"], "Salaire", [], "any", false, false, false, 25), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 28
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Offre"], "Disponabilite", [], "any", false, false, false, 28), "html", null, true);
            echo "
                </td>
                <td>
                    <form action=\"";
            // line 31
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("modifierOffre", ["id" => twig_get_attribute($this->env, $this->source, $context["Offre"], "id", [], "any", false, false, false, 31)]), "html", null, true);
            echo "\">
                        <button type=\"submit\" class=\"btn btn-secondary\"> Modifier</button></form>
                </td>
                <td>
                    <form action=\"";
            // line 35
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("supprimerOffre", ["id" => twig_get_attribute($this->env, $this->source, $context["Offre"], "id", [], "any", false, false, false, 35)]), "html", null, true);
            echo "\">
                        <button type=\"submit\" class=\"btn btn-danger\">Supprimer</button></form>
                </td>
                <td>
                    <form action=\"";
            // line 39
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("listPost", ["id" => twig_get_attribute($this->env, $this->source, $context["Offre"], "id", [], "any", false, false, false, 39)]), "html", null, true);
            echo "\">
                        <button type=\"submit\" class=\"btn btn-primary\">Liste des postulants</button></form>
                </td>
            </tr>
        ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['Offre'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 44
        echo "
    </table>
    <a class=\"btn btn-success\"   href=";
        // line 46
        echo $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("Ajouteroffre");
        echo ">Créer une Offre</a>
";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "offre/index.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  147 => 46,  143 => 44,  132 => 39,  125 => 35,  118 => 31,  112 => 28,  106 => 25,  100 => 22,  94 => 19,  88 => 16,  84 => 14,  80 => 13,  68 => 3,  58 => 2,  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base.html.twig' %}
{% block body %}
    <table class=\"table\">
        <tr class=\"table-light\">
            <th scope=\"col\">Description</th>
            <th scope=\"col\">Libelle</th>
            <th scope=\"col\">Date Limite</th>
            <th scope=\"col\">Salaire</th>
            <th scope=\"col\">Disponabilite</th>
            <th scope=\"col\">Modifier</th>
            <th scope=\"col\">Supprimer</th>
        </tr>
        {% for Offre in class %}
            <tr>
                <td>
                    {{Offre.Description}}
                </td>
                <td>
                    {{Offre.Libelle}}
                </td>
                <td>
                    {{ Offre.DateLimite}}
                </td>
                <td>
                    {{ Offre.Salaire}}
                </td>
                <td>
                    {{ Offre.Disponabilite}}
                </td>
                <td>
                    <form action=\"{{ path('modifierOffre',{'id':Offre.id} )}}\">
                        <button type=\"submit\" class=\"btn btn-secondary\"> Modifier</button></form>
                </td>
                <td>
                    <form action=\"{{ path('supprimerOffre',{'id':Offre.id} )}}\">
                        <button type=\"submit\" class=\"btn btn-danger\">Supprimer</button></form>
                </td>
                <td>
                    <form action=\"{{ path('listPost',{'id':Offre.id})}}\">
                        <button type=\"submit\" class=\"btn btn-primary\">Liste des postulants</button></form>
                </td>
            </tr>
        {% endfor %}

    </table>
    <a class=\"btn btn-success\"   href={{ path('Ajouteroffre') }}>Créer une Offre</a>
{% endblock %}", "offre/index.html.twig", "C:\\Users\\firas\\OneDrive\\Documents\\GitHub\\CodeBrigade\\rdvoffre\\templates\\offre\\index.html.twig");
    }
}
