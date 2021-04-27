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

/* offre/update.html.twig */
class __TwigTemplate_4566027eee654db5682f1642a6dd34766bdea0bb6be1a126ed4f1cb33bcc9c97 extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "offre/update.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "offre/update.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "offre/update.html.twig", 1);
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
                var Libelle=document.form1.Libelle.value;
                var Salaire=document.form1.Salaire.value;
                var Description=document.form1.Description.value;
                var Disponabilite=document.form1.Disponabilite.value;
                var DateLimite=document.form1.DateLimite.value;

                if (Libelle==null || Libelle==\"\"){
                    alert(\"Libelle d'offre ne peut pas être vide.\");
                    return false;
                }else if(Description == null || Description == \"\"){
                    alert(\"Description d'évènement ne peut pas être vide.\");
                    return false;
                }
                else if(Salaire == null || Salaire == \"\"){
                    alert(\"Entrer Votre Salaire de l'Offre!\");
                    return false;
                }
                else if(Disponabilite == null || Disponabilite==\"\"){
                    alert(\"Entrer Votre Disponabilite de l'Offre!\");
                    return false;
                } else if(DateLimite == null || DateLimite == \"\"){
                    alert(\"Prix d'inscription ne peut pas être vide.\");
                    return false;
                }
                alert('Vous avez modidifer votre Offre avec success  :  \\n '+Libelle+'\\n Merci.');
            }
        </script>
    </head>
    <body>

    <h2>Modifier une offre</h2>
    <div class=\"container\">
        <form action=\"\" method=\"post\" name=\"form1\">
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Libelle\">Libelle</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\" value=\"";
        // line 108
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["offre"]) || array_key_exists("offre", $context) ? $context["offre"] : (function () { throw new RuntimeError('Variable "offre" does not exist.', 108, $this->source); })()), "Libelle", [], "any", false, false, false, 108), "html", null, true);
        echo "\"  name=\"Libelle\" placeholder=\"Libelle..\">
                </div>
            </div>

            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Salaire\">Salaire</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"number\" placeholder=\"Salaire\" value=\"";
        // line 117
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["offre"]) || array_key_exists("offre", $context) ? $context["offre"] : (function () { throw new RuntimeError('Variable "offre" does not exist.', 117, $this->source); })()), "Salaire", [], "any", false, false, false, 117), "html", null, true);
        echo "\" name=\"Salaire\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Description\">Description</label>
                </div>
                <div class=\"col-75\">
                    <input type=\"text\" required id=\"Description\" name=\"Description\" value=\"";
        // line 125
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["offre"]) || array_key_exists("offre", $context) ? $context["offre"] : (function () { throw new RuntimeError('Variable "offre" does not exist.', 125, $this->source); })()), "Description", [], "any", false, false, false, 125), "html", null, true);
        echo "\" placeholder=\"Description..\" style=\"height:200px\"></input>
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Description\">Disponabilite</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\" name=\"Disponabilite\" placeholder=\"Disponabilite..\" value=\"";
        // line 133
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["offre"]) || array_key_exists("offre", $context) ? $context["offre"] : (function () { throw new RuntimeError('Variable "offre" does not exist.', 133, $this->source); })()), "Disponabilite", [], "any", false, false, false, 133), "html", null, true);
        echo "\" style=\"height:200px\"></input>
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"DateLimite\">Date Limite</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"date\"  name=\"DateLimite\" placeholder=\"Date Limite..\" value=\"";
        // line 141
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["offre"]) || array_key_exists("offre", $context) ? $context["offre"] : (function () { throw new RuntimeError('Variable "offre" does not exist.', 141, $this->source); })()), "DateLimite", [], "any", false, false, false, 141), "html", null, true);
        echo "\">
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
        return "offre/update.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  220 => 141,  209 => 133,  198 => 125,  187 => 117,  175 => 108,  68 => 3,  58 => 2,  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base.html.twig' %}
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
                var Libelle=document.form1.Libelle.value;
                var Salaire=document.form1.Salaire.value;
                var Description=document.form1.Description.value;
                var Disponabilite=document.form1.Disponabilite.value;
                var DateLimite=document.form1.DateLimite.value;

                if (Libelle==null || Libelle==\"\"){
                    alert(\"Libelle d'offre ne peut pas être vide.\");
                    return false;
                }else if(Description == null || Description == \"\"){
                    alert(\"Description d'évènement ne peut pas être vide.\");
                    return false;
                }
                else if(Salaire == null || Salaire == \"\"){
                    alert(\"Entrer Votre Salaire de l'Offre!\");
                    return false;
                }
                else if(Disponabilite == null || Disponabilite==\"\"){
                    alert(\"Entrer Votre Disponabilite de l'Offre!\");
                    return false;
                } else if(DateLimite == null || DateLimite == \"\"){
                    alert(\"Prix d'inscription ne peut pas être vide.\");
                    return false;
                }
                alert('Vous avez modidifer votre Offre avec success  :  \\n '+Libelle+'\\n Merci.');
            }
        </script>
    </head>
    <body>

    <h2>Modifier une offre</h2>
    <div class=\"container\">
        <form action=\"\" method=\"post\" name=\"form1\">
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Libelle\">Libelle</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\" value=\"{{ offre.Libelle }}\"  name=\"Libelle\" placeholder=\"Libelle..\">
                </div>
            </div>

            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Salaire\">Salaire</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"number\" placeholder=\"Salaire\" value=\"{{ offre.Salaire }}\" name=\"Salaire\">
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Description\">Description</label>
                </div>
                <div class=\"col-75\">
                    <input type=\"text\" required id=\"Description\" name=\"Description\" value=\"{{ offre.Description }}\" placeholder=\"Description..\" style=\"height:200px\"></input>
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Description\">Disponabilite</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\" name=\"Disponabilite\" placeholder=\"Disponabilite..\" value=\"{{ offre.Disponabilite }}\" style=\"height:200px\"></input>
                </div>
            </div>
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"DateLimite\">Date Limite</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"date\"  name=\"DateLimite\" placeholder=\"Date Limite..\" value=\"{{ offre.DateLimite }}\">
                </div>
            </div>
            <div class=\"row\">
                <input type=\"submit\" value=\"Submit\" onclick=\"Verif()\">
            </div>
        </form>
    </div>
    </body>
    </html>


{% endblock %}", "offre/update.html.twig", "C:\\Users\\firas\\OneDrive\\Documents\\GitHub\\CodeBrigade\\rdvoffre\\templates\\offre\\update.html.twig");
    }
}
