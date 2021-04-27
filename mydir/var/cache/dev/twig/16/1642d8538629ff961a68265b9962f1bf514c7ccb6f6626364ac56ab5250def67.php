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

/* evenement/a.html.twig */
class __TwigTemplate_42de3d9910be39d47cad63453cc351f348b5e8177266ff938bc52ca10039d8af extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "evenement/a.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "evenement/a.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "evenement/a.html.twig", 1);
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
        // line 17
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable((isset($context["classe"]) || array_key_exists("classe", $context) ? $context["classe"] : (function () { throw new RuntimeError('Variable "classe" does not exist.', 17, $this->source); })()));
        foreach ($context['_seq'] as $context["_key"] => $context["Postulant"]) {
            // line 18
            echo "            <tr>
                <td>
                    ";
            // line 20
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 20, $this->source); })()), "Nom", [], "any", false, false, false, 20), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 23
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 23, $this->source); })()), "Prenom", [], "any", false, false, false, 23), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 26
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 26, $this->source); })()), "Sexe", [], "any", false, false, false, 26), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 29
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 29, $this->source); })()), "EtatScolaire", [], "any", false, false, false, 29), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 32
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 32, $this->source); })()), "Adresse", [], "any", false, false, false, 32), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 35
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 35, $this->source); })()), "Telephone", [], "any", false, false, false, 35), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 38
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 38, $this->source); })()), "Email", [], "any", false, false, false, 38), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 41
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 41, $this->source); })()), "Status", [], "any", false, false, false, 41), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 44
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 44, $this->source); })()), "DateNais", [], "any", false, false, false, 44), "html", null, true);
            echo "
                </td>
                <td>
                    ";
            // line 47
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["Post"]) || array_key_exists("Post", $context) ? $context["Post"] : (function () { throw new RuntimeError('Variable "Post" does not exist.', 47, $this->source); })()), "Competences", [], "any", false, false, false, 47), "html", null, true);
            echo "
                </td>


            </tr>
        ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['Postulant'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 53
        echo "    </table>

";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "evenement/a.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  158 => 53,  146 => 47,  140 => 44,  134 => 41,  128 => 38,  122 => 35,  116 => 32,  110 => 29,  104 => 26,  98 => 23,  92 => 20,  88 => 18,  84 => 17,  68 => 3,  58 => 2,  35 => 1,);
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
        {% for Postulant in classe %}
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


            </tr>
        {% endfor %}
    </table>

{% endblock %}

", "evenement/a.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\evenement\\a.html.twig");
    }
}
