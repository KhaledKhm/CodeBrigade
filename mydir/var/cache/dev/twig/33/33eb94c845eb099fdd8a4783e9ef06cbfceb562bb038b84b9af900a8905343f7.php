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

/* promotion/add.html.twig */
class __TwigTemplate_11727b5c05c30f563c1da7d9f8b30149dd995aa5e287a43364806a0f232b067a extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "promotion/add.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "promotion/add.html.twig"));

        $this->parent = $this->loadTemplate("base.html.twig", "promotion/add.html.twig", 1);
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
    <title>ajouter Promotion</title>
</head>
<body>
<h1></h1>
<form  name=\"formulaire2\" action=\"\" method=\"POST\" style=\"width: 3000000000000pt\">

    <div class=\"\">
        <br>

        <div class=\"col-lg-6\">
            <div class=\"card\">
                <div class=\"card-header\"><strong>Ajouter une Promotion</strong></div>

                <div class=\"card-body card-block\">
                    <div class=\"form-group\"><label class=\" form-control-label\">Libelle</label><input required type=\"text\" name=\"Libelle\" placeholder=\"Saisissez le titre...... \" class=\"form-control\"></div>
                    <div class=\"form-group\"><label  class=\" form-control-label\">PoucentageReduction</label><input required type=\"text\" name=\"PoucentageReduction\" placeholder=\"Saisissez PoucentageReduction......\" class=\"form-control\"></div>
                    <div class=\"form-actions form-group\">
                        <br>
                        <button onclick=\"Alertfunction1()\" type=\"submit\"class=\"btn btn-primary btn-sm\">Ajouter Promotion </button>
                    </div>
                </div>
            </div>

        </div>

    </div>


</form>
</body>
</html>

    <script>
        function Alertfunction1(){
            var Libelle=document.formulaire2.Libelle.value;
            var PoucentageReduction=document.formulaire2.PoucentageReduction.value;

            if (Libelle==null || Libelle==\"\"){
                alert(\"nom d'évènement ne peut pas être vide.\");
                return false;
            }else if(PoucentageReduction==null || PoucentageReduction==\"\"){
                alert(\"PoucentageReduction d'évènement ne peut pas être vide.\");
                return false;
            }
            alert(\"Vous avez ajouter unr promotion a un évènement avec success.\");
        }
    </script>

";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "promotion/add.html.twig";
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
    <title>ajouter Promotion</title>
</head>
<body>
<h1></h1>
<form  name=\"formulaire2\" action=\"\" method=\"POST\" style=\"width: 3000000000000pt\">

    <div class=\"\">
        <br>

        <div class=\"col-lg-6\">
            <div class=\"card\">
                <div class=\"card-header\"><strong>Ajouter une Promotion</strong></div>

                <div class=\"card-body card-block\">
                    <div class=\"form-group\"><label class=\" form-control-label\">Libelle</label><input required type=\"text\" name=\"Libelle\" placeholder=\"Saisissez le titre...... \" class=\"form-control\"></div>
                    <div class=\"form-group\"><label  class=\" form-control-label\">PoucentageReduction</label><input required type=\"text\" name=\"PoucentageReduction\" placeholder=\"Saisissez PoucentageReduction......\" class=\"form-control\"></div>
                    <div class=\"form-actions form-group\">
                        <br>
                        <button onclick=\"Alertfunction1()\" type=\"submit\"class=\"btn btn-primary btn-sm\">Ajouter Promotion </button>
                    </div>
                </div>
            </div>

        </div>

    </div>


</form>
</body>
</html>

    <script>
        function Alertfunction1(){
            var Libelle=document.formulaire2.Libelle.value;
            var PoucentageReduction=document.formulaire2.PoucentageReduction.value;

            if (Libelle==null || Libelle==\"\"){
                alert(\"nom d'évènement ne peut pas être vide.\");
                return false;
            }else if(PoucentageReduction==null || PoucentageReduction==\"\"){
                alert(\"PoucentageReduction d'évènement ne peut pas être vide.\");
                return false;
            }
            alert(\"Vous avez ajouter unr promotion a un évènement avec success.\");
        }
    </script>

{% endblock %}", "promotion/add.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\promotion\\add.html.twig");
    }
}
