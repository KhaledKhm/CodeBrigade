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

/* postulant/fav.html.twig */
class __TwigTemplate_64459465d42fb6f4315cc1daf58afb969af8483d534091c4e7f78c69c0ad0f15 extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/fav.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "postulant/fav.html.twig"));

        $this->parent = $this->loadTemplate("base2.html.twig", "postulant/fav.html.twig", 1);
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
        echo "    <div class=\"page-content\">

    <section id=\"blog\" class=\"content-section\" style=\"width: 1100pt\" >
        <div class=\"section-heading\" >
            <strong> <h1>Liste des<em>        Favoris</em></h1> </strong>
        </div>

        <div class=\"section-content\" style=\"margin-right:50px\" >
            <div class=\"tabs-content\" style=\"margin-top:0px\">
                <div class=\"wrapper\">
                    <ul class=\"tabs clearfix\" data-tabgroup=\"first-tab-group\">
                        <li><a href=\"#tab1\" class=\"active\">1</a></li>
                        <li><a href=\"#tab2\">2</a></li>
                        <li><a href=\"#tab3\">3</a></li>
                        <li><a href=\"#tab4\">4</a></li>
                    </ul>
                    ";
        // line 20
        $context['_parent'] = $context;
        $context['_seq'] = twig_ensure_traversable((isset($context["fav"]) || array_key_exists("fav", $context) ? $context["fav"] : (function () { throw new RuntimeError('Variable "fav" does not exist.', 20, $this->source); })()));
        foreach ($context['_seq'] as $context["_key"] => $context["offre"]) {
            // line 21
            echo "                        <section id=\"first-tab-group\" class=\"tabgroup\">
                            <div id=\"tab1\">
                                <ul>
                                    <li>
                                        <div class=\"item\">
                                            <img src=\"img/blog_2.jpg\" alt=\"\">
                                            <div class=\"text-content\">
                                                <h4> ";
            // line 28
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["offre"], "libelle", [], "any", false, false, false, 28), "html", null, true);
            echo "</h4>
                                                <span>";
            // line 29
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["offre"], "DateLimite", [], "any", false, false, false, 29), "html", null, true);
            echo "</span>
                                                <p>";
            // line 30
            echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, $context["offre"], "description", [], "any", false, false, false, 30), "html", null, true);
            echo "</p>

                                                <div class=\"accent-button button\">
                                                    <form action=\"";
            // line 33
            echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\RoutingExtension']->getPath("ajoutPost", ["id" => twig_get_attribute($this->env, $this->source, $context["offre"], "id", [], "any", false, false, false, 33)]), "html", null, true);
            echo "\"><button  class=\"btn btn-outline-info\"><h7>Participer</h7></button></form>
                                                </div>
                                            </div>
                                        </div>
                                    </li>

                                </ul>
                            </div>


                        </section>
                    ";
        }
        $_parent = $context['_parent'];
        unset($context['_seq'], $context['_iterated'], $context['_key'], $context['offre'], $context['_parent'], $context['loop']);
        $context = array_intersect_key($context, $_parent) + $_parent;
        // line 45
        echo "                </div>
            </div>
        </div>
    </section>
    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>
    <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.2.min.js\"><\\/script>')</script>

    <script src=\"js/vendor/bootstrap.min.js\"></script>

    <script src=\"js/plugins.js\"></script>
    <script src=\"js/main.js\"></script>

    <script>
        // Hide Header on on scroll down
        var didScroll;
        var lastScrollTop = 0;
        var delta = 5;
        var navbarHeight = \$('header').outerHeight();

        \$(window).scroll(function(event){
            didScroll = true;
        });

        setInterval(function() {
            if (didScroll) {
                hasScrolled();
                didScroll = false;
            }
        }, 250);

        function hasScrolled() {
            var st = \$(this).scrollTop();

            // Make sure they scroll more than delta
            if(Math.abs(lastScrollTop - st) <= delta)
                return;

            // If they scrolled down and are past the navbar, add class .nav-up.
            // This is necessary so you never see what is \"behind\" the navbar.
            if (st > lastScrollTop && st > navbarHeight){
                // Scroll Down
                \$('header').removeClass('nav-down').addClass('nav-up');
            } else {
                // Scroll Up
                if(st + \$(window).height() < \$(document).height()) {
                    \$('header').removeClass('nav-up').addClass('nav-down');
                }
            }

            lastScrollTop = st;
        }
    </script>

    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\" type=\"text/javascript\"></script>

";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "postulant/fav.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  151 => 45,  133 => 33,  127 => 30,  123 => 29,  119 => 28,  110 => 21,  106 => 20,  88 => 4,  78 => 3,  59 => 2,  36 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base2.html.twig' %}
 {% block content %}  {% endblock  %}
{% block body %}
    <div class=\"page-content\">

    <section id=\"blog\" class=\"content-section\" style=\"width: 1100pt\" >
        <div class=\"section-heading\" >
            <strong> <h1>Liste des<em>        Favoris</em></h1> </strong>
        </div>

        <div class=\"section-content\" style=\"margin-right:50px\" >
            <div class=\"tabs-content\" style=\"margin-top:0px\">
                <div class=\"wrapper\">
                    <ul class=\"tabs clearfix\" data-tabgroup=\"first-tab-group\">
                        <li><a href=\"#tab1\" class=\"active\">1</a></li>
                        <li><a href=\"#tab2\">2</a></li>
                        <li><a href=\"#tab3\">3</a></li>
                        <li><a href=\"#tab4\">4</a></li>
                    </ul>
                    {% for offre in fav %}
                        <section id=\"first-tab-group\" class=\"tabgroup\">
                            <div id=\"tab1\">
                                <ul>
                                    <li>
                                        <div class=\"item\">
                                            <img src=\"img/blog_2.jpg\" alt=\"\">
                                            <div class=\"text-content\">
                                                <h4> {{offre.libelle}}</h4>
                                                <span>{{ offre.DateLimite}}</span>
                                                <p>{{ offre.description}}</p>

                                                <div class=\"accent-button button\">
                                                    <form action=\"{{ path('ajoutPost',{'id':offre.id} )}}\"><button  class=\"btn btn-outline-info\"><h7>Participer</h7></button></form>
                                                </div>
                                            </div>
                                        </div>
                                    </li>

                                </ul>
                            </div>


                        </section>
                    {% endfor %}
                </div>
            </div>
        </div>
    </section>
    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>
    <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.2.min.js\"><\\/script>')</script>

    <script src=\"js/vendor/bootstrap.min.js\"></script>

    <script src=\"js/plugins.js\"></script>
    <script src=\"js/main.js\"></script>

    <script>
        // Hide Header on on scroll down
        var didScroll;
        var lastScrollTop = 0;
        var delta = 5;
        var navbarHeight = \$('header').outerHeight();

        \$(window).scroll(function(event){
            didScroll = true;
        });

        setInterval(function() {
            if (didScroll) {
                hasScrolled();
                didScroll = false;
            }
        }, 250);

        function hasScrolled() {
            var st = \$(this).scrollTop();

            // Make sure they scroll more than delta
            if(Math.abs(lastScrollTop - st) <= delta)
                return;

            // If they scrolled down and are past the navbar, add class .nav-up.
            // This is necessary so you never see what is \"behind\" the navbar.
            if (st > lastScrollTop && st > navbarHeight){
                // Scroll Down
                \$('header').removeClass('nav-down').addClass('nav-up');
            } else {
                // Scroll Up
                if(st + \$(window).height() < \$(document).height()) {
                    \$('header').removeClass('nav-up').addClass('nav-down');
                }
            }

            lastScrollTop = st;
        }
    </script>

    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\" type=\"text/javascript\"></script>

{% endblock %}", "postulant/fav.html.twig", "C:\\wamp64\\www\\rdvoffre\\templates\\postulant\\fav.html.twig");
    }
}
