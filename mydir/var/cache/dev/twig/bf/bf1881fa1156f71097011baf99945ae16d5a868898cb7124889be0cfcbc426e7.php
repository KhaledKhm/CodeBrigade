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

/* promotion/list.html.twig */
class __TwigTemplate_c2c5aa835236eff7267533ba460226b832afb8950bfa3a2c41154ce4bcf21e8b extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "promotion/list.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "promotion/list.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "promotion/list.html.twig", 1);
        $this->parent->display($context, array_merge($this->blocks, $blocks));
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

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
        echo "    <h2>Liste des Promotions</h2>
    <br><br>
    <table id=\"bootstrap-data-table\" class=\"table\">
        <tr class=\"table-light\">
            <th>ID Promotion</th>


            <th>Libelle</th>
            <th>Poucentage Reduction</th>
            <th>Prix final</th>
            <th>Modifier</th>
            <th>Supprimer</th>
        </tr>

        ";
        // line 18
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable((isset($context["classe"]) || array_key_exists("classe", $context) ? $context["classe"] : (function () { throw new RuntimeError('Variable "classe" does not exist.', 18, $this->source); })()));
        foreach ($context['_seq'] as $context["_key"] => $context["Promotion"]) {
            // line 19
            echo "            <tr>
                <td>
                    ";
            // line 21
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Promotion"], "id", [], "any", false, false, false, 21), "html", null, true);
            echo "
                </td>

                <td>
                    ";
            // line 25
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Promotion"], "libelle", [], "any", false, false, false, 25), "html", null, true);
            echo "
                </td>
                <td>
                    -";
            // line 28
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Promotion"], "PoucentageReduction", [], "any", false, false, false, 28), "html", null, true);
            echo "%
                </td>
                <td>
                    ";
            // line 31
            $context["sum"] = ((50 * twig_get_attribute($this->env, $this->source, $context["Promotion"], "PoucentageReduction", [], "any", false, false, false, 31)) / 100);
            // line 32
            echo "                    ";
            $context["em"] = (50 - (isset($context["sum"]) || array_key_exists("sum", $context) ? $context["sum"] : (function () { throw new RuntimeError('Variable "sum" does not exist.', 32, $this->source); })()));
            // line 33
            echo "                    ";
            echo twig_escape_filter($this->env, (isset($context["em"]) || array_key_exists("em", $context) ? $context["em"] : (function () { throw new RuntimeError('Variable "em" does not exist.', 33, $this->source); })()), "html", null, true);
            echo "dt
                </td>


                <td>
                    <form action=\"";
            // line 38
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("modifierPromotion", ["id" => twig_get_attribute($this->env, $this->source, $context["Promotion"], "id", [], "any", false, false, false, 38)]), "html", null, true);
            echo "\"><button class=\"btn btn-warning btn-sm\"><h6>MODIFIER</h6></button></form>
                </td>
                <td>
                    <form action=\"";
            // line 41
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("supprimerPromotion", ["id" => twig_get_attribute($this->env, $this->source, $context["Promotion"], "id", [], "any", false, false, false, 41)]), "html", null, true);
            echo "\"><button  class=\"btn btn-danger btn-sm\"><h6>Supprimer</h6></button></form>
                </td>
            </tr>
        ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['Promotion'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 45
        echo "
    </table>
    <a href=";
        // line 47
        echo $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("ajouterPromotion");
        echo ">Créer une Promotion</a>
";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "promotion/list.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  145 => 47,  141 => 45,  131 => 41,  125 => 38,  116 => 33,  113 => 32,  111 => 31,  105 => 28,  99 => 25,  92 => 21,  88 => 19,  84 => 18,  68 => 4,  58 => 3,  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base.html.twig' %}

{% block body %}
    <h2>Liste des Promotions</h2>
    <br><br>
    <table id=\"bootstrap-data-table\" class=\"table\">
        <tr class=\"table-light\">
            <th>ID Promotion</th>


            <th>Libelle</th>
            <th>Poucentage Reduction</th>
            <th>Prix final</th>
            <th>Modifier</th>
            <th>Supprimer</th>
        </tr>

        {% for Promotion in classe %}
            <tr>
                <td>
                    {{Promotion.id}}
                </td>

                <td>
                    {{Promotion.libelle}}
                </td>
                <td>
                    -{{Promotion.PoucentageReduction}}%
                </td>
                <td>
                    {%  set sum=(50*Promotion.PoucentageReduction)/100 %}
                    {%  set em=50-sum  %}
                    {{em}}dt
                </td>


                <td>
                    <form action=\"{{ path('modifierPromotion',{'id':Promotion.id} )}}\"><button class=\"btn btn-warning btn-sm\"><h6>MODIFIER</h6></button></form>
                </td>
                <td>
                    <form action=\"{{ path('supprimerPromotion',{'id':Promotion.id} )}}\"><button  class=\"btn btn-danger btn-sm\"><h6>Supprimer</h6></button></form>
                </td>
            </tr>
        {% endfor %}

    </table>
    <a href={{ path('ajouterPromotion') }}>Créer une Promotion</a>
{% endblock %}", "promotion/list.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\promotion\\list.html.twig");
    }
}
