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

/* base2.html.twig */
class __TwigTemplate_044275617daf56ce95020bb9110bccedf07d67a999b015278b2c454751465e66 extends Template
{
    private $source;
    private $macros = [];

    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->source = $this->getSourceContext();

        $this->parent = false;

        $this->blocks = [
            'body' => [$this, 'block_body'],
        ];
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "base2.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "base2.html.twig"));

        // line 1
        echo "<!--
=========================================================
Material Kit - v2.0.7
=========================================================

Product Page: https://www.creative-tim.com/product/material-kit
Copyright 2020 Creative Tim (https://www.creative-tim.com/)

Coded by Creative Tim

=========================================================

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. -->
<!DOCTYPE html>
<html lang=\"en\">

<head>
    <meta charset=\"utf-8\" />
    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=";
        // line 19
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("/assets/img/apple-icon.png"), "html", null, true);
        echo ">
    <link rel=\"icon\" type=\"image/png\" href=";
        // line 20
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("/assets/img/favicon.png"), "html", null, true);
        echo ">
    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />
    <title>
        Jobbook
    </title>
    <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link rel=\"stylesheet\" type=\"text/css\" href=";
        // line 27
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons"), "html", null, true);
        echo " >
    <link rel=\"stylesheet\" href=";
        // line 28
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"), "html", null, true);
        echo ">
    <!-- CSS Files -->
    <link rel=\"stylesheet\" href=";
        // line 30
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/css/material-kit.css?v=2.0.7"), "html", null, true);
        echo "  >
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link rel=\"stylesheet\" href=";
        // line 32
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/demo/demo.css"), "html", null, true);
        echo "  >
    <link rel=\"stylesheet\" href=";
        // line 33
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/owl-carousel.css"), "html", null, true);
        echo " >
    <link rel=\"stylesheet\" href=";
        // line 34
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/templatemo-style.css"), "html", null, true);
        echo " >

    <link rel=\"stylesheet\" href=";
        // line 36
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/bootstrap-theme.min.css"), "html", null, true);
        echo " >
</head>

<body class=\"index-page sidebar-collapse\">
<nav class=\"navbar navbar-transparent navbar-color-on-scroll fixed-top navbar-expand-lg\" color-on-scroll=\"100\" id=\"sectionsNav\">
    <div class=\"container\">
        <div class=\"navbar-translate\">
            <a class=\"navbar-brand\" href=\"sentra.html\">
                <div class=\"brand\">
                    <p style=\"color:Black ; font-size:30px\"><b>Jobbook.</b></p>
                </div>
            </a>
            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">
                <span class=\"sr-only\">Toggle navigation</span>
                <span class=\"navbar-toggler-icon\"></span>
                <span class=\"navbar-toggler-icon\"></span>
                <span class=\"navbar-toggler-icon\"></span>
            </button>
        </div>
        <div class=\"collapse navbar-collapse\">
            <ul class=\"navbar-nav ml-auto\">
                <li class=\"dropdown nav-item\">
                    <a href=\"#\" class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\">
                        <i class=\"material-icons\">apps</i> Services
                    </a>
                    <div class=\"dropdown-menu dropdown-with-icons\">
                        <a href=\"./Postulant.html\" class=\"dropdown-item\">
                            <i class=\"material-icons\">layers</i> Ajout CV
                        </a>
                        <a href=\"http://localhost:8000/evenementf\" class=\"dropdown-item\">
                            <i class=\"material-icons\">content_paste</i> Evenement
                        </a>
                        <a href=\"https://demos.creative-tim.com/material-kit/docs/2.0/getting-started/introduction.html\" class=\"dropdown-item\">
                            <i class=\"material-icons\">bookmark</i> Consulter RDV
                        </a>
                        <a href=\"https://demos.creative-tim.com/material-kit/docs/2.0/getting-started/introduction.html\" class=\"dropdown-item\">
                            <i class=\"material-icons\">warning</i> Reclamation
                        </a>
                    </div>
                </li>
                <li class=\"nav-item\">
                    <a class=\"nav-link\" href=\"https://www.creative-tim.com/product/material-kit-pro\" target=\"_blank\">
                        <i class=\"material-icons\">account_circle</i> Mon Compte
                    </a>
                </li>
                <li class=\"nav-item\">
                    <a href=\"javascript:;\" class=\"btn btn-rose btn-raised btn-fab btn-round\" data-toggle=\"dropdown\">
                        <i class=\"material-icons\">email</i>
                    </a>
                </li>
                <i>
                    <a class=\"nav-link\" href=\"https://www.creative-tim.com/product/material-kit-pro\" target=\"_blank\">
                        <button class=\"btn btn-rose\">Déconnexion</button>
                    </a>
                </i>
            </ul>
        </div>
    </div>
</nav>
<div class=\"page-header header-filter clear-filter\" data-parallax=\"true\" style=\"background-image: url('/assets/img/bg2.jpg');\">
    <div class=\"container\">
        <div class=\"row\">
            <div class=\"col-md-8 ml-auto mr-auto\">
                <div class=\"brand\">
                    <h1>Jobbook.</h1>
                    <h3>Get Hired !</h3>
                </div>
            </div>
        </div>
    </div>
</div>
<div class=\"main main-raised\">
    <div class=\"section section-basic\">
        <div class=\"container\">
            <div class=\"title\">

                ";
        // line 112
        $this->displayBlock('body', $context, $blocks);
        // line 113
        echo "            </div>
        </div>
    </div>
</div>

<!-- Classic Modal -->
<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\">
    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">
        <div class=\"modal-content\">
            <div class=\"modal-header\">
                <h5 class=\"modal-title\">Modal title</h5>
                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">
                    <i class=\"material-icons\">clear</i>
                </button>
            </div>
            <div class=\"modal-body\">
                <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar.
                </p>
            </div>
            <div class=\"modal-footer\">
                <button type=\"button\" class=\"btn btn-link\">Nice Button</button>
                <button type=\"button\" class=\"btn btn-danger btn-link\" data-dismiss=\"modal\">Close</button>
            </div>
        </div>
    </div>
</div>
<!--  End Modal -->
<footer class=\"footer\" data-background-color=\"black\">
    <div class=\"container\">
        <nav class=\"float-left\">
            <ul>
                <li>
                    <a href=\"https://www.creative-tim.com/presentation\" style=\"color:White\">
                        About Us
                    </a>
                </li>
                <li>
                    <a href=\"https://www.creative-tim.com/blog\" style=\"color:White\">
                        Blog
                    </a>
                </li>
                <li>
                    <a href=\"https://www.creative-tim.com/license\" style=\"color:White\">
                        Licenses
                    </a>
                </li>
            </ul>
        </nav>
        <div class=\"copyright float-right\" style=\"color:White\">
            &copy;
            <script>
                document.write(new Date().getFullYear())
            </script> by
            <a target=\"_blank\">Code Brigade</a>
        </div>
    </div>
</footer>
<!--   Core JS Files   -->
<script src=";
        // line 171
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("/assets/js/core/jquery.min.js"), "html", null, true);
        echo " type=\"text/javascript\"></script>
<script src=";
        // line 172
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("/assets/js/core/popper.min.js"), "html", null, true);
        echo " type=\"text/javascript\"></script>
<script src=";
        // line 173
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("/assets/js/core/bootstrap-material-design.min.js"), "html", null, true);
        echo " type=\"text/javascript\"></script>
<script src=";
        // line 174
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("/assets/js/plugins/moment.min.js"), "html", null, true);
        echo "></script>
<!--\tPlugin for the Datepicker, full documentation here: https://github.com/Eonasdan/bootstrap-datetimepicker -->
<script src=";
        // line 176
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("/assets/js/plugins/bootstrap-datetimepicker.js"), "html", null, true);
        echo " type=\"text/javascript\"></script>
<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
<script src=";
        // line 178
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("/assets/js/plugins/nouislider.min.js"), "html", null, true);
        echo " type=\"text/javascript\"></script>
<!--  Google Maps Plugin    -->
<!-- Control Center for Material Kit: parallax effects, scripts for the example pages etc -->
<script src=";
        // line 181
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("/assets/js/material-kit.js?v=2.0.7"), "html", null, true);
        echo " type=\"text/javascript\"></script>
<script>
    \$(document).ready(function() {
        //init DateTimePickers
        materialKit.initFormExtendedDatetimepickers();

        // Sliders Init
        materialKit.initSliders();
    });


    function scrollToDownload() {
        if (\$('.section-download').length != 0) {
            \$(\"html, body\").animate({
                scrollTop: \$('.section-download').offset().top
            }, 1000);
        }
    }
</script>




<script src=";
        // line 204
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/plugins.js"), "html", null, true);
        echo "></script>
<script src=";
        // line 205
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/main.js"), "html", null, true);
        echo "></script>




</body>

</html>";
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 112
    public function block_body($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "body"));

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "base2.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  322 => 112,  304 => 205,  300 => 204,  274 => 181,  268 => 178,  263 => 176,  258 => 174,  254 => 173,  250 => 172,  246 => 171,  186 => 113,  184 => 112,  105 => 36,  100 => 34,  96 => 33,  92 => 32,  87 => 30,  82 => 28,  78 => 27,  68 => 20,  64 => 19,  44 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("<!--
=========================================================
Material Kit - v2.0.7
=========================================================

Product Page: https://www.creative-tim.com/product/material-kit
Copyright 2020 Creative Tim (https://www.creative-tim.com/)

Coded by Creative Tim

=========================================================

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. -->
<!DOCTYPE html>
<html lang=\"en\">

<head>
    <meta charset=\"utf-8\" />
    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href={{ asset('/assets/img/apple-icon.png')}}>
    <link rel=\"icon\" type=\"image/png\" href={{ asset('/assets/img/favicon.png')}}>
    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />
    <title>
        Jobbook
    </title>
    <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link rel=\"stylesheet\" type=\"text/css\" href={{ asset('https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons')}} >
    <link rel=\"stylesheet\" href={{ asset('https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css')}}>
    <!-- CSS Files -->
    <link rel=\"stylesheet\" href={{ asset('assets/css/material-kit.css?v=2.0.7')}}  >
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link rel=\"stylesheet\" href={{ asset('assets/demo/demo.css')}}  >
    <link rel=\"stylesheet\" href={{ asset('css/owl-carousel.css')}} >
    <link rel=\"stylesheet\" href={{ asset('css/templatemo-style.css')}} >

    <link rel=\"stylesheet\" href={{ asset('css/bootstrap-theme.min.css')}} >
</head>

<body class=\"index-page sidebar-collapse\">
<nav class=\"navbar navbar-transparent navbar-color-on-scroll fixed-top navbar-expand-lg\" color-on-scroll=\"100\" id=\"sectionsNav\">
    <div class=\"container\">
        <div class=\"navbar-translate\">
            <a class=\"navbar-brand\" href=\"sentra.html\">
                <div class=\"brand\">
                    <p style=\"color:Black ; font-size:30px\"><b>Jobbook.</b></p>
                </div>
            </a>
            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">
                <span class=\"sr-only\">Toggle navigation</span>
                <span class=\"navbar-toggler-icon\"></span>
                <span class=\"navbar-toggler-icon\"></span>
                <span class=\"navbar-toggler-icon\"></span>
            </button>
        </div>
        <div class=\"collapse navbar-collapse\">
            <ul class=\"navbar-nav ml-auto\">
                <li class=\"dropdown nav-item\">
                    <a href=\"#\" class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\">
                        <i class=\"material-icons\">apps</i> Services
                    </a>
                    <div class=\"dropdown-menu dropdown-with-icons\">
                        <a href=\"./Postulant.html\" class=\"dropdown-item\">
                            <i class=\"material-icons\">layers</i> Ajout CV
                        </a>
                        <a href=\"http://localhost:8000/evenementf\" class=\"dropdown-item\">
                            <i class=\"material-icons\">content_paste</i> Evenement
                        </a>
                        <a href=\"https://demos.creative-tim.com/material-kit/docs/2.0/getting-started/introduction.html\" class=\"dropdown-item\">
                            <i class=\"material-icons\">bookmark</i> Consulter RDV
                        </a>
                        <a href=\"https://demos.creative-tim.com/material-kit/docs/2.0/getting-started/introduction.html\" class=\"dropdown-item\">
                            <i class=\"material-icons\">warning</i> Reclamation
                        </a>
                    </div>
                </li>
                <li class=\"nav-item\">
                    <a class=\"nav-link\" href=\"https://www.creative-tim.com/product/material-kit-pro\" target=\"_blank\">
                        <i class=\"material-icons\">account_circle</i> Mon Compte
                    </a>
                </li>
                <li class=\"nav-item\">
                    <a href=\"javascript:;\" class=\"btn btn-rose btn-raised btn-fab btn-round\" data-toggle=\"dropdown\">
                        <i class=\"material-icons\">email</i>
                    </a>
                </li>
                <i>
                    <a class=\"nav-link\" href=\"https://www.creative-tim.com/product/material-kit-pro\" target=\"_blank\">
                        <button class=\"btn btn-rose\">Déconnexion</button>
                    </a>
                </i>
            </ul>
        </div>
    </div>
</nav>
<div class=\"page-header header-filter clear-filter\" data-parallax=\"true\" style=\"background-image: url('/assets/img/bg2.jpg');\">
    <div class=\"container\">
        <div class=\"row\">
            <div class=\"col-md-8 ml-auto mr-auto\">
                <div class=\"brand\">
                    <h1>Jobbook.</h1>
                    <h3>Get Hired !</h3>
                </div>
            </div>
        </div>
    </div>
</div>
<div class=\"main main-raised\">
    <div class=\"section section-basic\">
        <div class=\"container\">
            <div class=\"title\">

                {% block body %}{% endblock  %}
            </div>
        </div>
    </div>
</div>

<!-- Classic Modal -->
<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\">
    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">
        <div class=\"modal-content\">
            <div class=\"modal-header\">
                <h5 class=\"modal-title\">Modal title</h5>
                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">
                    <i class=\"material-icons\">clear</i>
                </button>
            </div>
            <div class=\"modal-body\">
                <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar.
                </p>
            </div>
            <div class=\"modal-footer\">
                <button type=\"button\" class=\"btn btn-link\">Nice Button</button>
                <button type=\"button\" class=\"btn btn-danger btn-link\" data-dismiss=\"modal\">Close</button>
            </div>
        </div>
    </div>
</div>
<!--  End Modal -->
<footer class=\"footer\" data-background-color=\"black\">
    <div class=\"container\">
        <nav class=\"float-left\">
            <ul>
                <li>
                    <a href=\"https://www.creative-tim.com/presentation\" style=\"color:White\">
                        About Us
                    </a>
                </li>
                <li>
                    <a href=\"https://www.creative-tim.com/blog\" style=\"color:White\">
                        Blog
                    </a>
                </li>
                <li>
                    <a href=\"https://www.creative-tim.com/license\" style=\"color:White\">
                        Licenses
                    </a>
                </li>
            </ul>
        </nav>
        <div class=\"copyright float-right\" style=\"color:White\">
            &copy;
            <script>
                document.write(new Date().getFullYear())
            </script> by
            <a target=\"_blank\">Code Brigade</a>
        </div>
    </div>
</footer>
<!--   Core JS Files   -->
<script src={{ asset('/assets/js/core/jquery.min.js')}} type=\"text/javascript\"></script>
<script src={{ asset('/assets/js/core/popper.min.js')}} type=\"text/javascript\"></script>
<script src={{ asset('/assets/js/core/bootstrap-material-design.min.js')}} type=\"text/javascript\"></script>
<script src={{ asset('/assets/js/plugins/moment.min.js')}}></script>
<!--\tPlugin for the Datepicker, full documentation here: https://github.com/Eonasdan/bootstrap-datetimepicker -->
<script src={{ asset('/assets/js/plugins/bootstrap-datetimepicker.js')}} type=\"text/javascript\"></script>
<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
<script src={{ asset('/assets/js/plugins/nouislider.min.js')}} type=\"text/javascript\"></script>
<!--  Google Maps Plugin    -->
<!-- Control Center for Material Kit: parallax effects, scripts for the example pages etc -->
<script src={{ asset('/assets/js/material-kit.js?v=2.0.7')}} type=\"text/javascript\"></script>
<script>
    \$(document).ready(function() {
        //init DateTimePickers
        materialKit.initFormExtendedDatetimepickers();

        // Sliders Init
        materialKit.initSliders();
    });


    function scrollToDownload() {
        if (\$('.section-download').length != 0) {
            \$(\"html, body\").animate({
                scrollTop: \$('.section-download').offset().top
            }, 1000);
        }
    }
</script>




<script src={{ asset('js/plugins.js')}}></script>
<script src={{ asset('js/main.js')}}></script>




</body>

</html>", "base2.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\base2.html.twig");
    }
}
