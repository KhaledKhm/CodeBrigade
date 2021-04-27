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

/* evenement/add.html.twig */
class __TwigTemplate_6d05663fc93f0d7e41ff2d8d4d3cc2b3e0fa2f2b92ada0ca48d5a899fb08eb9d extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "evenement/add.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "evenement/add.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "evenement/add.html.twig", 1);
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
        echo "<!DOCTYPE html>
<html lang=\"en\">
<head>
    <meta charset=\"UTF-8\">
    <title>ajouter Evenement</title>
</head>
<body>
<h1></h1>
<form name=\"formulaire1\" action=\"\" method=\"POST\" style=\"width: 1500pt\">
                    <div class=\"card\">
                        <div class=\"card-header\"><strong>Ajouter Evenement</strong></div>
                        <div class=\"card-body card-block\">

                            <div class=\"form-group\"><label for=\"company\" class=\" form-control-label\" >Libelle</label>  <input required type=\"text\"  name=\"Libelle\" placeholder=\"Saisissez le titre....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"vat\" class=\" form-control-label\">Description</label><input required type=\"text\" name=\"description\" placeholder=\"Saisissez la description....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"street\" class=\" form-control-label\">DateDebut</label><input required min=\"2019-01-01\" max=\"2020-12-30\" value=\"\"  type=\"date\" required type=\"text\" name=\"DateDebut\" placeholder=\"Saisissez la Date Debut....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"country\" class=\" form-control-label\">DateFin</label><input required min=\"2019-01-01\" max=\"2020-12-30\" value=\"\"  type=\"date\" required type=\"text\" name=\"DateFin\" placeholder=\"Saisissez la Date Fin....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"country\" class=\" form-control-label\">PrixInscription</label><input required type=\"number\" name=\"PrixInscription\" placeholder=\"Saisissez Prix d'inscription....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"company\" class=\" form-control-label\" >color</label>  <input required type=\"color\"  name=\"color\"placeholder=\"Saisissez Prix d'inscription....................\"  class=\"form-control\"></div>
                            <div class=\"form-actions form-group\">
                                <button type=\"submit\" class=\"btn btn-primary btn-sm\" onclick=\"Alertfunction1()\"  >Ajouter Evenement</button>
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
            alert('Vous avez ajouter un évènement avec success du :  \\n '+DateDebut+'au\\n' +DateFin+'\\n Merci.');
        }
    </script>
";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "evenement/add.html.twig";
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
<html lang=\"en\">
<head>
    <meta charset=\"UTF-8\">
    <title>ajouter Evenement</title>
</head>
<body>
<h1></h1>
<form name=\"formulaire1\" action=\"\" method=\"POST\" style=\"width: 1500pt\">
                    <div class=\"card\">
                        <div class=\"card-header\"><strong>Ajouter Evenement</strong></div>
                        <div class=\"card-body card-block\">

                            <div class=\"form-group\"><label for=\"company\" class=\" form-control-label\" >Libelle</label>  <input required type=\"text\"  name=\"Libelle\" placeholder=\"Saisissez le titre....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"vat\" class=\" form-control-label\">Description</label><input required type=\"text\" name=\"description\" placeholder=\"Saisissez la description....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"street\" class=\" form-control-label\">DateDebut</label><input required min=\"2019-01-01\" max=\"2020-12-30\" value=\"\"  type=\"date\" required type=\"text\" name=\"DateDebut\" placeholder=\"Saisissez la Date Debut....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"country\" class=\" form-control-label\">DateFin</label><input required min=\"2019-01-01\" max=\"2020-12-30\" value=\"\"  type=\"date\" required type=\"text\" name=\"DateFin\" placeholder=\"Saisissez la Date Fin....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"country\" class=\" form-control-label\">PrixInscription</label><input required type=\"number\" name=\"PrixInscription\" placeholder=\"Saisissez Prix d'inscription....................\" class=\"form-control\"></div>
                            <div class=\"form-group\"><label for=\"company\" class=\" form-control-label\" >color</label>  <input required type=\"color\"  name=\"color\"placeholder=\"Saisissez Prix d'inscription....................\"  class=\"form-control\"></div>
                            <div class=\"form-actions form-group\">
                                <button type=\"submit\" class=\"btn btn-primary btn-sm\" onclick=\"Alertfunction1()\"  >Ajouter Evenement</button>
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
            alert('Vous avez ajouter un évènement avec success du :  \\n '+DateDebut+'au\\n' +DateFin+'\\n Merci.');
        }
    </script>
{% endblock %}", "evenement/add.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\evenement\\add.html.twig");
    }
}
