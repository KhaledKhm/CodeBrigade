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

/* base.html.twig */
class __TwigTemplate_f74c51ace42982e032c6336cd684906349f731d744206de9796837ab3fd3590f extends Template
{
    private $source;
    private $macros = [];

    public function __construct(Environment $env)
    {
        parent::__construct($env);

        $this->source = $this->getSourceContext();

        $this->parent = false;

        $this->blocks = [
            'content' => [$this, 'block_content'],
            'stylesheets' => [$this, 'block_stylesheets'],
            'body' => [$this, 'block_body'],
            'javascripts' => [$this, 'block_javascripts'],
        ];
    }

    protected function doDisplay(array $context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "base.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "base.html.twig"));

        // line 1
        echo "<!DOCTYPE html>
<html>
<head>
    <!-- Basic Page Info -->
    <meta charset=\"utf-8\">
    <title>DeskApp - Bootstrap Admin Dashboard HTML Template</title>
    ";
        // line 7
        $this->displayBlock('content', $context, $blocks);
        // line 8
        echo "    <!-- Site favicon -->
    <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"";
        // line 9
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/images/apple-touch-icon.png"), "html", null, true);
        echo "\">
    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"";
        // line 10
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/images/favicon-32x32.png"), "html", null, true);
        echo "\">
    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"";
        // line 11
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/images/favicon-16x16.png"), "html", null, true);
        echo "\">

    <!-- Mobile Specific Metas -->
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">
    ";
        // line 15
        $this->displayBlock('stylesheets', $context, $blocks);
        // line 17
        echo "    <!-- Google Font -->
    <link href=\"";
        // line 18
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap"), "html", null, true);
        echo "\" rel=\"stylesheet\">
    <!-- CSS -->
    <link rel=\"stylesheet\" type=\"text/css\" href=\"";
        // line 20
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/styles/core.css"), "html", null, true);
        echo "\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"";
        // line 21
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/styles/icon-font.min.css"), "html", null, true);
        echo "\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"";
        // line 22
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("src/plugins/datatables/css/dataTables.bootstrap4.min.css"), "html", null, true);
        echo "\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"";
        // line 23
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("src/plugins/datatables/css/responsive.bootstrap4.min.css"), "html", null, true);
        echo "\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"";
        // line 24
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/styles/style.css"), "html", null, true);
        echo "\">
    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async src=\"";
        // line 26
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("https://www.googletagmanager.com/gtag/js?id=UA-119386393-1"), "html", null, true);
        echo "\"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());

        gtag('config', 'UA-119386393-1');
    </script>
</head>

<body>




<div class=\"header\">
    <div class=\"header-left\">
        <div class=\"menu-icon dw dw-menu\"></div>


    </div>
    <div class=\"header-right\">
        <div class=\"dashboard-setting user-notification\">
            <div class=\"dropdown\">
                <a class=\"dropdown-toggle no-arrow\" href=\"javascript:;\" data-toggle=\"right-sidebar\">
                    <i class=\"dw dw-settings2\"></i>
                </a>
            </div>
        </div>



    </div>
</div>

<div class=\"right-sidebar\">
    <div class=\"sidebar-title\">
        <h3 class=\"weight-600 font-16 text-blue\">
            Layout Settings
            <span class=\"btn-block font-weight-400 font-12\">User Interface Settings</span>
        </h3>
        <div class=\"close-sidebar\" data-toggle=\"right-sidebar-close\">
            <i class=\"icon-copy ion-close-round\"></i>
        </div>
    </div>
    <div class=\"right-sidebar-body customscroll\">
        <div class=\"right-sidebar-body-content\">
            <h4 class=\"weight-600 font-18 pb-10\">Header Background</h4>
            <div class=\"sidebar-btn-group pb-30 mb-10\">
                <a href=\"javascript:void(0);\" class=\"btn btn-outline-primary header-white active\">White</a>
                <a href=\"javascript:void(0);\" class=\"btn btn-outline-primary header-dark\">Dark</a>
            </div>

            <h4 class=\"weight-600 font-18 pb-10\">Sidebar Background</h4>
            <div class=\"sidebar-btn-group pb-30 mb-10\">
                <a href=\"javascript:void(0);\" class=\"btn btn-outline-primary sidebar-light \">White</a>
                <a href=\"javascript:void(0);\" class=\"btn btn-outline-primary sidebar-dark active\">Dark</a>
            </div>

            <h4 class=\"weight-600 font-18 pb-10\">Menu Dropdown Icon</h4>
            <div class=\"sidebar-radio-group pb-10 mb-10\">
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebaricon-1\" name=\"menu-dropdown-icon\" class=\"custom-control-input\" value=\"icon-style-1\" checked=\"\">
                    <label class=\"custom-control-label\" for=\"sidebaricon-1\"><i class=\"fa fa-angle-down\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebaricon-2\" name=\"menu-dropdown-icon\" class=\"custom-control-input\" value=\"icon-style-2\">
                    <label class=\"custom-control-label\" for=\"sidebaricon-2\"><i class=\"ion-plus-round\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebaricon-3\" name=\"menu-dropdown-icon\" class=\"custom-control-input\" value=\"icon-style-3\">
                    <label class=\"custom-control-label\" for=\"sidebaricon-3\"><i class=\"fa fa-angle-double-right\"></i></label>
                </div>
            </div>

            <h4 class=\"weight-600 font-18 pb-10\">Menu List Icon</h4>
            <div class=\"sidebar-radio-group pb-30 mb-10\">
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-1\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-1\" checked=\"\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-1\"><i class=\"ion-minus-round\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-2\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-2\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-2\"><i class=\"fa fa-circle-o\" aria-hidden=\"true\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-3\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-3\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-3\"><i class=\"dw dw-check\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-4\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-4\" checked=\"\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-4\"><i class=\"icon-copy dw dw-next-2\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-5\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-5\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-5\"><i class=\"dw dw-fast-forward-1\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-6\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-6\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-6\"><i class=\"dw dw-next\"></i></label>
                </div>
            </div>

            <div class=\"reset-options pt-30 text-center\">
                <button class=\"btn btn-danger\" id=\"reset-settings\">Reset Settings</button>
            </div>
        </div>
    </div>
</div>

<div class=\"left-side-bar\">
    <div class=\"brand-logo\">
        <a href=\"http://localhost:8000/home\">
            <img src=\"vendors/images/deskapp-logo.svg\" alt=\"\" class=\"dark-logo\">
            <h1>JobBook</h1>
        </a>
        <div class=\"close-sidebar\" data-toggle=\"left-sidebar-close\">
            <i class=\"ion-close-round\"></i>
        </div>
    </div>
    <div class=\"menu-block customscroll\">
        <div class=\"sidebar-menu\">
            <ul id=\"accordion-menu\">
                <li class=\"dropdown\">
                    <a href=\"javascript:;\" class=\"dropdown-toggle\">
                        <span class=\"micon dw dw-house-1\"></span><span class=\"mtext\">Home</span>
                    </a>
                    <ul class=\"submenu\">
                        <li><a href=\"http://localhost:8000/stats\">Statistiques</a></li>
                    </ul>
                </li>

                <li class=\"dropdown\">
                    <a href=\"javascript:;\" class=\"dropdown-toggle\">
                        <span class=\"micon dw dw-library\"></span><span class=\"mtext\">Evènement</span>
                    </a>
                    <ul class=\"submenu\">
                        <li><a href=\"http://localhost:8000/ajouterEvenement\">Ajouter un évènement</a></li>
                        <li><a href=\"http://localhost:8000/evenement\">lister les évènements</a></li>


                    </ul>
                </li>
                <li class=\"dropdown\">
                    <a href=\"javascript:;\" class=\"dropdown-toggle\">
                        <span class=\"micon dw dw-library\"></span><span class=\"mtext\">Promotion</span>
                    </a>
                    <ul class=\"submenu\">

                        <li><a href=\"http://localhost:8000/promotion\">lister les promotions</a></li>

                    </ul>
                </li>


            </ul>
        </div>
    </div>
</div>
<div class=\"mobile-menu-overlay\"></div>

<div class=\"main-container\">
    <div class=\"pd-ltr-20\">
        <div class=\"card-box pd-20 height-100-p mb-30\">
            <div class=\"row align-items-center\">
                ";
        // line 191
        $this->displayBlock('body', $context, $blocks);
        // line 192
        echo "

            </div>
        </div>
    </div>
</div>
<!-- js -->
";
        // line 199
        $this->displayBlock('javascripts', $context, $blocks);
        // line 200
        echo "<script src=\"";
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/scripts/core.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 201
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/scripts/script.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 202
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/scripts/process.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 203
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/scripts/layout-settings.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 204
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("src/plugins/apexcharts/apexcharts.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 205
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("src/plugins/datatables/js/jquery.dataTables.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 206
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("src/plugins/datatables/js/dataTables.bootstrap4.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 207
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("src/plugins/datatables/js/dataTables.responsive.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 208
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("src/plugins/datatables/js/responsive.bootstrap4.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 209
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("vendors/scripts/dashboard.js"), "html", null, true);
        echo "\"></script>
</body>
</html>";
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 7
    public function block_content($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "content"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "content"));

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    // line 15
    public function block_stylesheets($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "stylesheets"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "stylesheets"));

        // line 16
        echo "    ";
        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    // line 191
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

    // line 199
    public function block_javascripts($context, array $blocks = [])
    {
        $macros = $this->macros;
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e = $this->extensions["Symfony\\Bundle\\WebProfilerBundle\\Twig\\WebProfilerExtension"];
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "javascripts"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "block", "javascripts"));

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

    }

    public function getTemplateName()
    {
        return "base.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  393 => 199,  375 => 191,  365 => 16,  355 => 15,  337 => 7,  324 => 209,  320 => 208,  316 => 207,  312 => 206,  308 => 205,  304 => 204,  300 => 203,  296 => 202,  292 => 201,  287 => 200,  285 => 199,  276 => 192,  274 => 191,  106 => 26,  101 => 24,  97 => 23,  93 => 22,  89 => 21,  85 => 20,  80 => 18,  77 => 17,  75 => 15,  68 => 11,  64 => 10,  60 => 9,  57 => 8,  55 => 7,  47 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("<!DOCTYPE html>
<html>
<head>
    <!-- Basic Page Info -->
    <meta charset=\"utf-8\">
    <title>DeskApp - Bootstrap Admin Dashboard HTML Template</title>
    {% block content %}{% endblock  %}
    <!-- Site favicon -->
    <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"{{ asset('vendors/images/apple-touch-icon.png') }}\">
    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"{{ asset('vendors/images/favicon-32x32.png')}}\">
    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"{{ asset('vendors/images/favicon-16x16.png')}}\">

    <!-- Mobile Specific Metas -->
    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">
    {% block stylesheets %}
    {% endblock %}
    <!-- Google Font -->
    <link href=\"{{ asset('https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap') }}\" rel=\"stylesheet\">
    <!-- CSS -->
    <link rel=\"stylesheet\" type=\"text/css\" href=\"{{ asset('vendors/styles/core.css') }}\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"{{ asset('vendors/styles/icon-font.min.css') }}\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"{{ asset('src/plugins/datatables/css/dataTables.bootstrap4.min.css') }}\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"{{ asset('src/plugins/datatables/css/responsive.bootstrap4.min.css') }}\">
    <link rel=\"stylesheet\" type=\"text/css\" href=\"{{ asset('vendors/styles/style.css') }}\">
    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script async src=\"{{ asset('https://www.googletagmanager.com/gtag/js?id=UA-119386393-1') }}\"></script>
    <script>
        window.dataLayer = window.dataLayer || [];
        function gtag(){dataLayer.push(arguments);}
        gtag('js', new Date());

        gtag('config', 'UA-119386393-1');
    </script>
</head>

<body>




<div class=\"header\">
    <div class=\"header-left\">
        <div class=\"menu-icon dw dw-menu\"></div>


    </div>
    <div class=\"header-right\">
        <div class=\"dashboard-setting user-notification\">
            <div class=\"dropdown\">
                <a class=\"dropdown-toggle no-arrow\" href=\"javascript:;\" data-toggle=\"right-sidebar\">
                    <i class=\"dw dw-settings2\"></i>
                </a>
            </div>
        </div>



    </div>
</div>

<div class=\"right-sidebar\">
    <div class=\"sidebar-title\">
        <h3 class=\"weight-600 font-16 text-blue\">
            Layout Settings
            <span class=\"btn-block font-weight-400 font-12\">User Interface Settings</span>
        </h3>
        <div class=\"close-sidebar\" data-toggle=\"right-sidebar-close\">
            <i class=\"icon-copy ion-close-round\"></i>
        </div>
    </div>
    <div class=\"right-sidebar-body customscroll\">
        <div class=\"right-sidebar-body-content\">
            <h4 class=\"weight-600 font-18 pb-10\">Header Background</h4>
            <div class=\"sidebar-btn-group pb-30 mb-10\">
                <a href=\"javascript:void(0);\" class=\"btn btn-outline-primary header-white active\">White</a>
                <a href=\"javascript:void(0);\" class=\"btn btn-outline-primary header-dark\">Dark</a>
            </div>

            <h4 class=\"weight-600 font-18 pb-10\">Sidebar Background</h4>
            <div class=\"sidebar-btn-group pb-30 mb-10\">
                <a href=\"javascript:void(0);\" class=\"btn btn-outline-primary sidebar-light \">White</a>
                <a href=\"javascript:void(0);\" class=\"btn btn-outline-primary sidebar-dark active\">Dark</a>
            </div>

            <h4 class=\"weight-600 font-18 pb-10\">Menu Dropdown Icon</h4>
            <div class=\"sidebar-radio-group pb-10 mb-10\">
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebaricon-1\" name=\"menu-dropdown-icon\" class=\"custom-control-input\" value=\"icon-style-1\" checked=\"\">
                    <label class=\"custom-control-label\" for=\"sidebaricon-1\"><i class=\"fa fa-angle-down\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebaricon-2\" name=\"menu-dropdown-icon\" class=\"custom-control-input\" value=\"icon-style-2\">
                    <label class=\"custom-control-label\" for=\"sidebaricon-2\"><i class=\"ion-plus-round\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebaricon-3\" name=\"menu-dropdown-icon\" class=\"custom-control-input\" value=\"icon-style-3\">
                    <label class=\"custom-control-label\" for=\"sidebaricon-3\"><i class=\"fa fa-angle-double-right\"></i></label>
                </div>
            </div>

            <h4 class=\"weight-600 font-18 pb-10\">Menu List Icon</h4>
            <div class=\"sidebar-radio-group pb-30 mb-10\">
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-1\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-1\" checked=\"\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-1\"><i class=\"ion-minus-round\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-2\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-2\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-2\"><i class=\"fa fa-circle-o\" aria-hidden=\"true\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-3\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-3\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-3\"><i class=\"dw dw-check\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-4\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-4\" checked=\"\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-4\"><i class=\"icon-copy dw dw-next-2\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-5\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-5\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-5\"><i class=\"dw dw-fast-forward-1\"></i></label>
                </div>
                <div class=\"custom-control custom-radio custom-control-inline\">
                    <input type=\"radio\" id=\"sidebariconlist-6\" name=\"menu-list-icon\" class=\"custom-control-input\" value=\"icon-list-style-6\">
                    <label class=\"custom-control-label\" for=\"sidebariconlist-6\"><i class=\"dw dw-next\"></i></label>
                </div>
            </div>

            <div class=\"reset-options pt-30 text-center\">
                <button class=\"btn btn-danger\" id=\"reset-settings\">Reset Settings</button>
            </div>
        </div>
    </div>
</div>

<div class=\"left-side-bar\">
    <div class=\"brand-logo\">
        <a href=\"http://localhost:8000/home\">
            <img src=\"vendors/images/deskapp-logo.svg\" alt=\"\" class=\"dark-logo\">
            <h1>JobBook</h1>
        </a>
        <div class=\"close-sidebar\" data-toggle=\"left-sidebar-close\">
            <i class=\"ion-close-round\"></i>
        </div>
    </div>
    <div class=\"menu-block customscroll\">
        <div class=\"sidebar-menu\">
            <ul id=\"accordion-menu\">
                <li class=\"dropdown\">
                    <a href=\"javascript:;\" class=\"dropdown-toggle\">
                        <span class=\"micon dw dw-house-1\"></span><span class=\"mtext\">Home</span>
                    </a>
                    <ul class=\"submenu\">
                        <li><a href=\"http://localhost:8000/stats\">Statistiques</a></li>
                    </ul>
                </li>

                <li class=\"dropdown\">
                    <a href=\"javascript:;\" class=\"dropdown-toggle\">
                        <span class=\"micon dw dw-library\"></span><span class=\"mtext\">Evènement</span>
                    </a>
                    <ul class=\"submenu\">
                        <li><a href=\"http://localhost:8000/ajouterEvenement\">Ajouter un évènement</a></li>
                        <li><a href=\"http://localhost:8000/evenement\">lister les évènements</a></li>


                    </ul>
                </li>
                <li class=\"dropdown\">
                    <a href=\"javascript:;\" class=\"dropdown-toggle\">
                        <span class=\"micon dw dw-library\"></span><span class=\"mtext\">Promotion</span>
                    </a>
                    <ul class=\"submenu\">

                        <li><a href=\"http://localhost:8000/promotion\">lister les promotions</a></li>

                    </ul>
                </li>


            </ul>
        </div>
    </div>
</div>
<div class=\"mobile-menu-overlay\"></div>

<div class=\"main-container\">
    <div class=\"pd-ltr-20\">
        <div class=\"card-box pd-20 height-100-p mb-30\">
            <div class=\"row align-items-center\">
                {% block body %}{% endblock  %}


            </div>
        </div>
    </div>
</div>
<!-- js -->
{% block javascripts %}{% endblock %}
<script src=\"{{ asset('vendors/scripts/core.js') }}\"></script>
<script src=\"{{ asset('vendors/scripts/script.min.js') }}\"></script>
<script src=\"{{ asset('vendors/scripts/process.js') }}\"></script>
<script src=\"{{ asset('vendors/scripts/layout-settings.js') }}\"></script>
<script src=\"{{ asset('src/plugins/apexcharts/apexcharts.min.js') }}\"></script>
<script src=\"{{ asset('src/plugins/datatables/js/jquery.dataTables.min.js') }}\"></script>
<script src=\"{{ asset('src/plugins/datatables/js/dataTables.bootstrap4.min.js') }}\"></script>
<script src=\"{{ asset('src/plugins/datatables/js/dataTables.responsive.min.js') }}\"></script>
<script src=\"{{ asset('src/plugins/datatables/js/responsive.bootstrap4.min.js') }}\"></script>
<script src=\"{{ asset('vendors/scripts/dashboard.js') }}\"></script>
</body>
</html>", "base.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\base.html.twig");
    }
}
