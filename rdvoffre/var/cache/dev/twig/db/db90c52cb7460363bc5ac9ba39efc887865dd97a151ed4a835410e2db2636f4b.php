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

/* rdv/add.html.twig */
class __TwigTemplate_eeccb987ca84632788f7683c3f7404f0e03d5bee8de8032c97487934ea138f2d extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "rdv/add.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "rdv/add.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "rdv/add.html.twig", 1);
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
                var date=document.form1.Date.value;
                var Emplacement=document.form1.Emplacement.value;
                if (date==null || date==\"\"){
                    alert(\"la date de la rendez-vous ne peut pas être vide.\");
                    return false;
                }else if(Emplacement == null || Emplacement == \"\"){
                    alert(\"l'emplacement de la rendez-vous ne peut pas être vide.\");
                    return false;
                }
                alert('Vous avez ajouter une Rendez-vous avec success au :  \\n '+Emplacement+'a\\n' +date+'\\n Merci.');
            }
        </script>
    </head>
    <body>

    <h2>Ajouter une Rendez vous</h2>
    <div class=\"container\">
        <form action=\"\" method=\"post\" name=\"form1\">
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Libelle\">Date</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"date\"  name=\"Date\" placeholder=\"Date..\">
                </div>
            </div>

            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Salaire\">Emplacement</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\" placeholder=\"Emplacement\" name=\"Emplacement\">
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
        return "rdv/add.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  68 => 3,  58 => 2,  35 => 1,);
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
                var date=document.form1.Date.value;
                var Emplacement=document.form1.Emplacement.value;
                if (date==null || date==\"\"){
                    alert(\"la date de la rendez-vous ne peut pas être vide.\");
                    return false;
                }else if(Emplacement == null || Emplacement == \"\"){
                    alert(\"l'emplacement de la rendez-vous ne peut pas être vide.\");
                    return false;
                }
                alert('Vous avez ajouter une Rendez-vous avec success au :  \\n '+Emplacement+'a\\n' +date+'\\n Merci.');
            }
        </script>
    </head>
    <body>

    <h2>Ajouter une Rendez vous</h2>
    <div class=\"container\">
        <form action=\"\" method=\"post\" name=\"form1\">
            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Libelle\">Date</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"date\"  name=\"Date\" placeholder=\"Date..\">
                </div>
            </div>

            <div class=\"row\">
                <div class=\"col-25\">
                    <label for=\"Salaire\">Emplacement</label>
                </div>
                <div class=\"col-75\">
                    <input required type=\"text\" placeholder=\"Emplacement\" name=\"Emplacement\">
                </div>
            </div>

            <div class=\"row\">
                <input type=\"submit\" value=\"Submit\" onclick=\"Verif()\">
            </div>
        </form>
    </div>
    </body>
    </html>


{% endblock %}", "rdv/add.html.twig", "C:\\Users\\firas\\OneDrive\\Documents\\GitHub\\CodeBrigade\\rdvoffre\\templates\\rdv\\add.html.twig");
    }
}
