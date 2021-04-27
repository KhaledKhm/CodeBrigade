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

/* evenement/update.html.twig */
class __TwigTemplate_ace71e1eb55590f2d79f48d4e2a1d3a658e3c45873d3bd4a25575cc711f9a7a7 extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "evenement/update.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "evenement/update.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "evenement/update.html.twig", 1);
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
    <html lang=\"en\">
    <head>
        <meta charset=\"UTF-8\">
        <title>Modifier Evenement</title>
    </head>
    <body>


    <form name=\"formulaire1\" action=\"\" method=\"POST\" style=\"width: 1500pt\">
        <div class=\"card\">
            <div class=\"card-header\"><strong>Modifier Evenement</strong></div>
            <div class=\"card-body card-block\">

                <div class=\"form-group\"><label  class=\" form-control-label\">Libelle</label>  <input required type=\"text\" name=\"Libelle\" placeholder=\"Saisissez le titre....................\"value=";
        // line 17
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["evenement"]) || array_key_exists("evenement", $context) ? $context["evenement"] : (function () { throw new RuntimeError('Variable "evenement" does not exist.', 17, $this->source); })()), "libelle", [], "any", false, false, false, 17), "html", null, true);
        echo " class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\">Description</label><input required type=\"text\" name=\"description\" placeholder=\"Saisissez la description....................\"value=";
        // line 18
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["evenement"]) || array_key_exists("evenement", $context) ? $context["evenement"] : (function () { throw new RuntimeError('Variable "evenement" does not exist.', 18, $this->source); })()), "description", [], "any", false, false, false, 18), "html", null, true);
        echo " class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\">DateDebut</label><input required  type=\"date\" name=\"DateDebut\" placeholder=\"Saisissez la Date Debut....................\"value=";
        // line 19
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["evenement"]) || array_key_exists("evenement", $context) ? $context["evenement"] : (function () { throw new RuntimeError('Variable "evenement" does not exist.', 19, $this->source); })()), "DateDebut", [], "any", false, false, false, 19), "html", null, true);
        echo " class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\">DateFin</label><input required  type=\"date\" name=\"DateFin\" placeholder=\"Saisissez la Date Fin....................\"value=";
        // line 20
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["evenement"]) || array_key_exists("evenement", $context) ? $context["evenement"] : (function () { throw new RuntimeError('Variable "evenement" does not exist.', 20, $this->source); })()), "DateFin", [], "any", false, false, false, 20), "html", null, true);
        echo " class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\">PrixInscription</label><input required type=\"number\" name=\"PrixInscription\" placeholder=\"Saisissez Prix d'inscription....................\"value=";
        // line 21
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["evenement"]) || array_key_exists("evenement", $context) ? $context["evenement"] : (function () { throw new RuntimeError('Variable "evenement" does not exist.', 21, $this->source); })()), "PrixInscription", [], "any", false, false, false, 21), "html", null, true);
        echo " class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\" >color</label>  <input required type=\"color\"  name=\"color\" value=";
        // line 22
        echo twig_escape_filter($this->env, twig_get_attribute($this->env, $this->source, (isset($context["evenement"]) || array_key_exists("evenement", $context) ? $context["evenement"] : (function () { throw new RuntimeError('Variable "evenement" does not exist.', 22, $this->source); })()), "color", [], "any", false, false, false, 22), "html", null, true);
        echo "  class=\"form-control\"></div>
                <div class=\"form-actions form-group\">
                    <button type=\"submit\" onclick=\"Alertfunction1()\" class=\"btn btn-primary btn-sm\">modifier Evenement</button>
                </div>
            </div>
        </div>
    </form>
    </body>
    </html>

    <script>
        function Alertfunction1(){
            var Libelle=document.formulaire1.Libelle.value;
            var Description=document.formulaire1.description.value;
            var DateDebut=document.formulaire1.DateDebut.value;
            var DateFin=document.formulaire1.DateFin.value;
            var PrixInscription=document.formulaire1.PrixInscription.value;

            if (Libelle==null || Libelle==\"\"){
                alert(\"nom d'évènement ne peut pas être vide.\");
                return false;
            }else if(Description==null || Description==\"\"){
                alert(\"Description d'évènement ne peut pas être vide.\");
                return false;
            }
            else if(DateDebut==null || DateDebut==\"\"){
                alert(\"Entrer Votre Date Debut de l'évènement!\");
                return false;
            }
            else if(DateFin==null || DateFin==\"\"){
                alert(\"Entrer Votre Date Fin de l'évènement!\");
                return false;
            } else if(PrixInscription.length<1){
                alert(\"Prix d'inscription ne peut pas être vide.\");
                return false;
            }
            alert(\"Vous avez Modifier l'évènement avec success.\");
        }
    </script>
";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "evenement/update.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  104 => 22,  100 => 21,  96 => 20,  92 => 19,  88 => 18,  84 => 17,  68 => 3,  58 => 2,  35 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("{% extends 'base.html.twig' %}
{% block body %}
    <!DOCTYPE html>
    <html lang=\"en\">
    <head>
        <meta charset=\"UTF-8\">
        <title>Modifier Evenement</title>
    </head>
    <body>


    <form name=\"formulaire1\" action=\"\" method=\"POST\" style=\"width: 1500pt\">
        <div class=\"card\">
            <div class=\"card-header\"><strong>Modifier Evenement</strong></div>
            <div class=\"card-body card-block\">

                <div class=\"form-group\"><label  class=\" form-control-label\">Libelle</label>  <input required type=\"text\" name=\"Libelle\" placeholder=\"Saisissez le titre....................\"value={{ evenement.libelle }} class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\">Description</label><input required type=\"text\" name=\"description\" placeholder=\"Saisissez la description....................\"value={{ evenement.description }} class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\">DateDebut</label><input required  type=\"date\" name=\"DateDebut\" placeholder=\"Saisissez la Date Debut....................\"value={{ evenement.DateDebut }} class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\">DateFin</label><input required  type=\"date\" name=\"DateFin\" placeholder=\"Saisissez la Date Fin....................\"value={{ evenement.DateFin }} class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\">PrixInscription</label><input required type=\"number\" name=\"PrixInscription\" placeholder=\"Saisissez Prix d'inscription....................\"value={{ evenement.PrixInscription }} class=\"form-control\"></div>
                <div class=\"form-group\"><label  class=\" form-control-label\" >color</label>  <input required type=\"color\"  name=\"color\" value={{ evenement.color }}  class=\"form-control\"></div>
                <div class=\"form-actions form-group\">
                    <button type=\"submit\" onclick=\"Alertfunction1()\" class=\"btn btn-primary btn-sm\">modifier Evenement</button>
                </div>
            </div>
        </div>
    </form>
    </body>
    </html>

    <script>
        function Alertfunction1(){
            var Libelle=document.formulaire1.Libelle.value;
            var Description=document.formulaire1.description.value;
            var DateDebut=document.formulaire1.DateDebut.value;
            var DateFin=document.formulaire1.DateFin.value;
            var PrixInscription=document.formulaire1.PrixInscription.value;

            if (Libelle==null || Libelle==\"\"){
                alert(\"nom d'évènement ne peut pas être vide.\");
                return false;
            }else if(Description==null || Description==\"\"){
                alert(\"Description d'évènement ne peut pas être vide.\");
                return false;
            }
            else if(DateDebut==null || DateDebut==\"\"){
                alert(\"Entrer Votre Date Debut de l'évènement!\");
                return false;
            }
            else if(DateFin==null || DateFin==\"\"){
                alert(\"Entrer Votre Date Fin de l'évènement!\");
                return false;
            } else if(PrixInscription.length<1){
                alert(\"Prix d'inscription ne peut pas être vide.\");
                return false;
            }
            alert(\"Vous avez Modifier l'évènement avec success.\");
        }
    </script>
{% endblock %}", "evenement/update.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\evenement\\update.html.twig");
    }
}
