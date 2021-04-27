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

/* evenement/list.html.twig */
class __TwigTemplate_42dfc7bf6fc5b90181b84aac599959cc22f79f0bd239d5246f861623ce22fadf extends Template
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
        return "base.html.twig";
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "evenement/list.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "evenement/list.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "evenement/list.html.twig", 1);
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
        echo "    <section id=\"blog\" class=\"content-section\" style=\"width: 1200pt\" >
    <div class=\"section-heading\" >
        <strong> <h2>Liste des <em> Evènements</em></h2> </strong>
    </div>
    </section>

    <br><br><br>
    <table id=\"bootstrap-data-table\"class=\"table\" >
        <tr class=\"table-light\">
            <th>ID</th>
            <th>Libelle</th>
            <th>Description</th>
            <th>Date Debut</th>
            <th>Date Fin</th>
            <th>Prix Inscription</th>
            <th>Modifier</th>
            <th>Supprimer</th>


        </tr>
        ";
        // line 24
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable((isset($context["classe"]) || array_key_exists("classe", $context) ? $context["classe"] : (function () { throw new RuntimeError('Variable "classe" does not exist.', 24, $this->source); })()));
        foreach ($context['_seq'] as $context["_key"] => $context["Evenement"]) {
            // line 25
            echo "            <tr>
                <td>
                    ";
            // line 27
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Evenement"], "id", [], "any", false, false, false, 27), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 30
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Evenement"], "libelle", [], "any", false, false, false, 30), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 33
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Evenement"], "description", [], "any", false, false, false, 33), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 36
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Evenement"], "DateDebut", [], "any", false, false, false, 36), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 39
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Evenement"], "DateFin", [], "any", false, false, false, 39), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 42
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["Evenement"], "PrixInscription", [], "any", false, false, false, 42), "html", null, true);
            echo "dt
                </td>
                <td>
               <form  action=\"";
            // line 45
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("modifierEvenement", ["id" => twig_get_attribute($this->env, $this->source, $context["Evenement"], "id", [], "any", false, false, false, 45)]), "html", null, true);
            echo "\"><button class=\"btn btn-warning btn-sm\"><h6>Modifier</h6></button></form>
                </td>

                <td>

                    <form action=\"";
            // line 50
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("supprimerEvenement", ["id" => twig_get_attribute($this->env, $this->source, $context["Evenement"], "id", [], "any", false, false, false, 50)]), "html", null, true);
            echo "\"><button  class=\"btn btn-danger btn-sm\"><h6>Supprimer</h6></button></form>
                </td>
                <td>
                    <form action=\"";
            // line 53
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("ajoutPart", ["id" => twig_get_attribute($this->env, $this->source, $context["Evenement"], "id", [], "any", false, false, false, 53)]), "html", null, true);
            echo "\"><button  class=\"btn btn-outline-info\"><h6>Participer</h6></button></form>
                </td>
                <td>
                    <form action=\"";
            // line 56
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("listPost", ["id" => twig_get_attribute($this->env, $this->source, $context["Evenement"], "id", [], "any", false, false, false, 56)]), "html", null, true);
            echo "\"><button  class=\"btn btn-outline-info\"><h6>Liste Des Inscrits</h6></button></form>

                </td>
                <td>
                    <form action=\"";
            // line 60
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("ajoutPromo", ["id" => twig_get_attribute($this->env, $this->source, $context["Evenement"], "id", [], "any", false, false, false, 60)]), "html", null, true);
            echo "\"><button  class=\"btn btn-outline-info\"><h6>Promotion</h6></button></form>
                </td>
                <td>
                    <form action=\"";
            // line 63
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("listPost1", ["id" => twig_get_attribute($this->env, $this->source, $context["Evenement"], "id", [], "any", false, false, false, 63)]), "html", null, true);
            echo "\"><button  class=\"btn btn-outline-info\"><h6>liste des promotions</h6></button></form>
                </td>
            </tr>
        ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['Evenement'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 67
        echo "
    </table>

    <a href=";
        // line 70
        echo $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("ajouterEvenement");
        echo ">Créer une Evenement</a>



";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "evenement/list.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  202 => 70,  197 => 67,  187 => 63,  181 => 60,  174 => 56,  168 => 53,  162 => 50,  154 => 45,  148 => 42,  142 => 39,  136 => 36,  130 => 33,  124 => 30,  118 => 27,  114 => 25,  110 => 24,  88 => 4,  78 => 3,  59 => 2,  36 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base.html.twig' %}
 {% block content %}  {% endblock  %}
{% block body %}
    <section id=\"blog\" class=\"content-section\" style=\"width: 1200pt\" >
    <div class=\"section-heading\" >
        <strong> <h2>Liste des <em> Evènements</em></h2> </strong>
    </div>
    </section>

    <br><br><br>
    <table id=\"bootstrap-data-table\"class=\"table\" >
        <tr class=\"table-light\">
            <th>ID</th>
            <th>Libelle</th>
            <th>Description</th>
            <th>Date Debut</th>
            <th>Date Fin</th>
            <th>Prix Inscription</th>
            <th>Modifier</th>
            <th>Supprimer</th>


        </tr>
        {% for Evenement in classe %}
            <tr>
                <td>
                    {{Evenement.id}}
                </td>
                <td>
                    {{Evenement.libelle}}
                </td>
                <td>
                    {{ Evenement.description}}
                </td>
                <td>
                    {{ Evenement.DateDebut}}
                </td>
                <td>
                    {{ Evenement.DateFin}}
                </td>
                <td>
                    {{ Evenement.PrixInscription}}dt
                </td>
                <td>
               <form  action=\"{{ path('modifierEvenement',{'id':Evenement.id} )}}\"><button class=\"btn btn-warning btn-sm\"><h6>Modifier</h6></button></form>
                </td>

                <td>

                    <form action=\"{{ path('supprimerEvenement',{'id':Evenement.id} )}}\"><button  class=\"btn btn-danger btn-sm\"><h6>Supprimer</h6></button></form>
                </td>
                <td>
                    <form action=\"{{ path('ajoutPart',{'id':Evenement.id} )}}\"><button  class=\"btn btn-outline-info\"><h6>Participer</h6></button></form>
                </td>
                <td>
                    <form action=\"{{ path('listPost',{'id':Evenement.id} )}}\"><button  class=\"btn btn-outline-info\"><h6>Liste Des Inscrits</h6></button></form>

                </td>
                <td>
                    <form action=\"{{ path('ajoutPromo',{'id':Evenement.id} )}}\"><button  class=\"btn btn-outline-info\"><h6>Promotion</h6></button></form>
                </td>
                <td>
                    <form action=\"{{ path('listPost1',{'id':Evenement.id} )}}\"><button  class=\"btn btn-outline-info\"><h6>liste des promotions</h6></button></form>
                </td>
            </tr>
        {% endfor %}

    </table>

    <a href={{ path('ajouterEvenement') }}>Créer une Evenement</a>



{% endblock %}", "evenement/list.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\evenement\\list.html.twig");
    }
}
