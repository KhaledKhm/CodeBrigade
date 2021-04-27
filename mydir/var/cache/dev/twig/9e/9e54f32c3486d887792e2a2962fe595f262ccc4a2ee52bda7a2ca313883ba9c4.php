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

/* index.html.twig */
class __TwigTemplate_c76b2e4456a716dd33278bee14fe44712198c44ce5c6cd59810035a2b0ef1405 extends Template
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
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->enter($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "index.html.twig"));

        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02 = $this->extensions["Symfony\\Bridge\\Twig\\Extension\\ProfilerExtension"];
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->enter($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof = new \Twig\Profiler\Profile($this->getTemplateName(), "template", "index.html.twig"));

        // line 1
        echo "<!DOCTYPE html>
<html lang=\"en\">

<head>
  <meta charset=\"utf-8\">
  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
  <meta name=\"description\" content=\"Creative - Bootstrap 3 Responsive Admin Template\">
  <meta name=\"author\" content=\"GeeksLabs\">
  <meta name=\"keyword\" content=\"Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal\">
  <link rel=\"shortcut icon\" href=\"img/favicon.png\">

  <title>Creative - Bootstrap Admin Template</title>

  <!-- Bootstrap CSS -->
  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">
  <!-- bootstrap theme -->
  <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">
  <!--external css-->
  <!-- font icon -->
  <link href=\"";
        // line 20
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/elegant-icons-style.css"), "html", null, true);
        echo "\" rel=\"stylesheet\" />
  <link href=\"";
        // line 21
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/font-awesome.min.css"), "html", null, true);
        echo "\" rel=\"stylesheet\" />
  <!-- full calendar css-->
  <link href=\"";
        // line 23
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css"), "html", null, true);
        echo "\" rel=\"stylesheet\" />
  <link href=\"";
        // line 24
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/fullcalendar/fullcalendar/fullcalendar.css"), "html", null, true);
        echo "\" rel=\"stylesheet\" />
  <!-- easy pie chart-->
  <link href=\"";
        // line 26
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css"), "html", null, true);
        echo "\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />
  <!-- owl carousel -->
  <link rel=\"stylesheet\" href=\"";
        // line 28
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/owl.carousel.css"), "html", null, true);
        echo "\" type=\"text/css\">
  <link href=\"";
        // line 29
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/jquery-jvectormap-1.2.2.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
  <!-- Custom styles -->
  <link rel=\"stylesheet\" href=\"";
        // line 31
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/fullcalendar.css"), "html", null, true);
        echo "\">
  <link href=\"";
        // line 32
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/widgets.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
  <link href=\"";
        // line 33
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/style.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">
  <link href=\"";
        // line 34
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/style-responsive.css"), "html", null, true);
        echo "\" rel=\"stylesheet\" />
  <link href=\"";
        // line 35
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/xcharts.min.css"), "html", null, true);
        echo "\" rel=\" stylesheet\">
  <link href=\"";
        // line 36
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("css/jquery-ui-1.10.4.min.css"), "html", null, true);
        echo "\" rel=\"stylesheet\">

</head>

<body>
<!-- container section start -->
<section id=\"container\" class=\"\">


  <header class=\"header dark-bg\">
    <div class=\"toggle-nav\">
      <div class=\"icon-reorder tooltips\" data-original-title=\"Toggle Navigation\" data-placement=\"bottom\"><i class=\"icon_menu\"></i></div>
    </div>

    <!--logo start-->
    <a href=\"index.html.twig\" class=\"logo\">Job <span class=\"lite\">Book</span></a>
    <!--logo end-->

    <div class=\"nav search-row\" id=\"top_menu\">
      <!--  search form start -->

      <!--  search form end -->
    </div>

    <div class=\"top-nav notification-row\">
      <!-- notificatoin dropdown start-->
      <ul class=\"nav pull-right top-menu\">

        <!-- task notificatoin start -->

        <!-- task notificatoin end -->
        <!-- inbox notificatoin start-->

        <!-- inbox notificatoin end -->
        <!-- alert notification start-->

        <!-- alert notification end-->
        <!-- user login dropdown start-->

        <!-- user login dropdown end -->
      </ul>
      <!-- notificatoin dropdown end-->
    </div>
  </header>
  <!--header end-->

  <!--sidebar start-->
  <aside>
    <div id=\"sidebar\" class=\"nav-collapse \">
      <!-- sidebar menu start-->
      <ul class=\"sidebar-menu\">
        <li class=\"active\">
          <a class=\"\" href=\"index.html.twig\">
            <i class=\"icon_house_alt\"></i>
            <span>Dashboard</span>
          </a>
        </li>
        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_document_alt\"></i>
            <span>Events</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li>
              <a class=\"\" href=\"http://localhost:8000/ajouterEvenement\">Ajouter un évènement</a></li>
            <li><a class=\"\" href=\"http://localhost:8000/evenement\">lister les évènements</a></li>
          </ul>
        </li>
        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_document_alt\"></i>
            <span>Promo</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li>
              <a class=\"\" href=\"http://localhost:8000/ajouterPromotion\">Ajouter une promotion</a></li>
            <li><a class=\"\" href=\"http://localhost:8000/promotion\">lister les promotions</a></li>
          </ul>
        </li>
        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_desktop\"></i>
            <span>UI Fitures</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li><a class=\"\" href=\"general.html\">Elements</a></li>
            <li><a class=\"\" href=\"buttons.html\">Buttons</a></li>
            <li><a class=\"\" href=\"grids.html\">Grids</a></li>
          </ul>
        </li>
        <li>
          <a class=\"\" href=\"widgets.html\">
            <i class=\"icon_genius\"></i>
            <span>Widgets</span>
          </a>
        </li>
        <li>
          <a class=\"\" href=\"chart-chartjs.html\">
            <i class=\"icon_piechart\"></i>
            <span>Charts</span>

          </a>

        </li>

        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_table\"></i>
            <span>Tables</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li><a class=\"\" href=\"basic_table.html\">Basic Table</a></li>
          </ul>
        </li>

        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_documents_alt\"></i>
            <span>Pages</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li><a class=\"\" href=\"profile.html\">Profile</a></li>
            <li><a class=\"\" href=\"login.html\"><span>Login Page</span></a></li>
            <li><a class=\"\" href=\"contact.html\"><span>Contact Page</span></a></li>
            <li><a class=\"\" href=\"blank.html\">Blank Page</a></li>
            <li><a class=\"\" href=\"404.html\">404 Error</a></li>
          </ul>
        </li>

      </ul>
      <!-- sidebar menu end-->
    </div>
  </aside>
  <!--sidebar end-->

  <!--main content start-->
  <section id=\"main-content\">
    <section class=\"wrapper\">


      ";
        // line 181
        $this->displayBlock('body', $context, $blocks);
        // line 182
        echo "
    </section></section>
  <!--main content end-->

</section>
<!-- container section start -->

<!-- javascripts -->
<script src=\"";
        // line 190
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 191
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery-ui-1.10.4.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 192
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery-1.8.3.min.js"), "html", null, true);
        echo "\"></script>
<script type=\"text/javascript\" src=\"";
        // line 193
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery-ui-1.9.2.custom.min.js"), "html", null, true);
        echo "\"></script>
<!-- bootstrap -->
<script src=\"";
        // line 195
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/bootstrap.min.js"), "html", null, true);
        echo "\"></script>
<!-- nice scroll -->
<script src=\"";
        // line 197
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery.scrollTo.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 198
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery.nicescroll.js"), "html", null, true);
        echo "\" type=\"text/javascript\"></script>
<!-- charts scripts -->
<script src=\"";
        // line 200
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/jquery-knob/js/jquery.knob.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 201
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery.sparkline.js"), "html", null, true);
        echo "\" type=\"text/javascript\"></script>
<script src=\"";
        // line 202
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 203
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/owl.carousel.js"), "html", null, true);
        echo "\"></script>
<!-- jQuery full calendar -->
<<script src=\"";
        // line 205
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/fullcalendar.min.js"), "html", null, true);
        echo "\"></script>
<!-- Full Google Calendar - Calendar -->
<script src=\"";
        // line 207
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/fullcalendar/fullcalendar/fullcalendar.js"), "html", null, true);
        echo "\"></script>
<!--script for this page only-->
<script src=\"";
        // line 209
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/calendar-custom.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 210
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery.rateit.min.js"), "html", null, true);
        echo "\"></script>
<!-- custom select -->
<script src=\"";
        // line 212
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery.customSelect.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 213
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("assets/chart-master/Chart.js"), "html", null, true);
        echo "\"></script>

<!--custome script for all page-->
<script src=\"";
        // line 216
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/scripts.js"), "html", null, true);
        echo "\"></script>
<!-- custom script for this page-->
<script src=\"";
        // line 218
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/sparkline-chart.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 219
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/easy-pie-chart.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 220
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery-jvectormap-1.2.2.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 221
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery-jvectormap-world-mill-en.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 222
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/xcharts.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 223
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery.autosize.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 224
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery.placeholder.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 225
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/gdp-data.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 226
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/morris.min.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 227
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/sparklines.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 228
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/charts.js"), "html", null, true);
        echo "\"></script>
<script src=\"";
        // line 229
        echo twig_escape_filter($this->env, $this->extensions['Symfony\Bridge\Twig\Extension\AssetExtension']->getAssetUrl("js/jquery.slimscroll.min.js"), "html", null, true);
        echo "\"></script>
<script>
  //knob
  \$(function() {
    \$(\".knob\").knob({
      'draw': function() {
        \$(this.i).val(this.cv + '%')
      }
    })
  });

  //carousel
  \$(document).ready(function() {
    \$(\"#owl-slider\").owlCarousel({
      navigation: true,
      slideSpeed: 300,
      paginationSpeed: 400,
      singleItem: true

    });
  });

  //custom select box

  \$(function() {
    \$('select.styled').customSelect();
  });

  /* ---------- Map ---------- */
  \$(function() {
    \$('#map').vectorMap({
      map: 'world_mill_en',
      series: {
        regions: [{
          values: gdpData,
          scale: ['#000', '#000'],
          normalizeFunction: 'polynomial'
        }]
      },
      backgroundColor: '#eef3f7',
      onLabelShow: function(e, el, code) {
        el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
      }
    });
  });
</script>

</body>

</html>
";
        
        $__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e->leave($__internal_085b0142806202599c7fe3b329164a92397d8978207a37e79d70b8c52599e33e_prof);

        
        $__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02->leave($__internal_319393461309892924ff6e74d6d6e64287df64b63545b994e100d4ab223aed02_prof);

    }

    // line 181
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
        return "index.html.twig";
    }

    public function isTraitable()
    {
        return false;
    }

    public function getDebugInfo()
    {
        return array (  464 => 181,  403 => 229,  399 => 228,  395 => 227,  391 => 226,  387 => 225,  383 => 224,  379 => 223,  375 => 222,  371 => 221,  367 => 220,  363 => 219,  359 => 218,  354 => 216,  348 => 213,  344 => 212,  339 => 210,  335 => 209,  330 => 207,  325 => 205,  320 => 203,  316 => 202,  312 => 201,  308 => 200,  303 => 198,  299 => 197,  294 => 195,  289 => 193,  285 => 192,  281 => 191,  277 => 190,  267 => 182,  265 => 181,  117 => 36,  113 => 35,  109 => 34,  105 => 33,  101 => 32,  97 => 31,  92 => 29,  88 => 28,  83 => 26,  78 => 24,  74 => 23,  69 => 21,  65 => 20,  44 => 1,);
    }

    public function getSourceContext()
    {
        return new Source("<!DOCTYPE html>
<html lang=\"en\">

<head>
  <meta charset=\"utf-8\">
  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">
  <meta name=\"description\" content=\"Creative - Bootstrap 3 Responsive Admin Template\">
  <meta name=\"author\" content=\"GeeksLabs\">
  <meta name=\"keyword\" content=\"Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal\">
  <link rel=\"shortcut icon\" href=\"img/favicon.png\">

  <title>Creative - Bootstrap Admin Template</title>

  <!-- Bootstrap CSS -->
  <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">
  <!-- bootstrap theme -->
  <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">
  <!--external css-->
  <!-- font icon -->
  <link href=\"{{ asset('css/elegant-icons-style.css') }}\" rel=\"stylesheet\" />
  <link href=\"{{ asset('css/font-awesome.min.css') }}\" rel=\"stylesheet\" />
  <!-- full calendar css-->
  <link href=\"{{ asset('assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css') }}\" rel=\"stylesheet\" />
  <link href=\"{{ asset('assets/fullcalendar/fullcalendar/fullcalendar.css') }}\" rel=\"stylesheet\" />
  <!-- easy pie chart-->
  <link href=\"{{ asset('assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css') }}\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />
  <!-- owl carousel -->
  <link rel=\"stylesheet\" href=\"{{ asset('css/owl.carousel.css') }}\" type=\"text/css\">
  <link href=\"{{ asset('css/jquery-jvectormap-1.2.2.css') }}\" rel=\"stylesheet\">
  <!-- Custom styles -->
  <link rel=\"stylesheet\" href=\"{{ asset('css/fullcalendar.css') }}\">
  <link href=\"{{ asset('css/widgets.css') }}\" rel=\"stylesheet\">
  <link href=\"{{ asset('css/style.css') }}\" rel=\"stylesheet\">
  <link href=\"{{ asset('css/style-responsive.css') }}\" rel=\"stylesheet\" />
  <link href=\"{{ asset('css/xcharts.min.css') }}\" rel=\" stylesheet\">
  <link href=\"{{ asset('css/jquery-ui-1.10.4.min.css') }}\" rel=\"stylesheet\">

</head>

<body>
<!-- container section start -->
<section id=\"container\" class=\"\">


  <header class=\"header dark-bg\">
    <div class=\"toggle-nav\">
      <div class=\"icon-reorder tooltips\" data-original-title=\"Toggle Navigation\" data-placement=\"bottom\"><i class=\"icon_menu\"></i></div>
    </div>

    <!--logo start-->
    <a href=\"index.html.twig\" class=\"logo\">Job <span class=\"lite\">Book</span></a>
    <!--logo end-->

    <div class=\"nav search-row\" id=\"top_menu\">
      <!--  search form start -->

      <!--  search form end -->
    </div>

    <div class=\"top-nav notification-row\">
      <!-- notificatoin dropdown start-->
      <ul class=\"nav pull-right top-menu\">

        <!-- task notificatoin start -->

        <!-- task notificatoin end -->
        <!-- inbox notificatoin start-->

        <!-- inbox notificatoin end -->
        <!-- alert notification start-->

        <!-- alert notification end-->
        <!-- user login dropdown start-->

        <!-- user login dropdown end -->
      </ul>
      <!-- notificatoin dropdown end-->
    </div>
  </header>
  <!--header end-->

  <!--sidebar start-->
  <aside>
    <div id=\"sidebar\" class=\"nav-collapse \">
      <!-- sidebar menu start-->
      <ul class=\"sidebar-menu\">
        <li class=\"active\">
          <a class=\"\" href=\"index.html.twig\">
            <i class=\"icon_house_alt\"></i>
            <span>Dashboard</span>
          </a>
        </li>
        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_document_alt\"></i>
            <span>Events</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li>
              <a class=\"\" href=\"http://localhost:8000/ajouterEvenement\">Ajouter un évènement</a></li>
            <li><a class=\"\" href=\"http://localhost:8000/evenement\">lister les évènements</a></li>
          </ul>
        </li>
        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_document_alt\"></i>
            <span>Promo</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li>
              <a class=\"\" href=\"http://localhost:8000/ajouterPromotion\">Ajouter une promotion</a></li>
            <li><a class=\"\" href=\"http://localhost:8000/promotion\">lister les promotions</a></li>
          </ul>
        </li>
        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_desktop\"></i>
            <span>UI Fitures</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li><a class=\"\" href=\"general.html\">Elements</a></li>
            <li><a class=\"\" href=\"buttons.html\">Buttons</a></li>
            <li><a class=\"\" href=\"grids.html\">Grids</a></li>
          </ul>
        </li>
        <li>
          <a class=\"\" href=\"widgets.html\">
            <i class=\"icon_genius\"></i>
            <span>Widgets</span>
          </a>
        </li>
        <li>
          <a class=\"\" href=\"chart-chartjs.html\">
            <i class=\"icon_piechart\"></i>
            <span>Charts</span>

          </a>

        </li>

        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_table\"></i>
            <span>Tables</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li><a class=\"\" href=\"basic_table.html\">Basic Table</a></li>
          </ul>
        </li>

        <li class=\"sub-menu\">
          <a href=\"javascript:;\" class=\"\">
            <i class=\"icon_documents_alt\"></i>
            <span>Pages</span>
            <span class=\"menu-arrow arrow_carrot-right\"></span>
          </a>
          <ul class=\"sub\">
            <li><a class=\"\" href=\"profile.html\">Profile</a></li>
            <li><a class=\"\" href=\"login.html\"><span>Login Page</span></a></li>
            <li><a class=\"\" href=\"contact.html\"><span>Contact Page</span></a></li>
            <li><a class=\"\" href=\"blank.html\">Blank Page</a></li>
            <li><a class=\"\" href=\"404.html\">404 Error</a></li>
          </ul>
        </li>

      </ul>
      <!-- sidebar menu end-->
    </div>
  </aside>
  <!--sidebar end-->

  <!--main content start-->
  <section id=\"main-content\">
    <section class=\"wrapper\">


      {% block body %}{% endblock %}

    </section></section>
  <!--main content end-->

</section>
<!-- container section start -->

<!-- javascripts -->
<script src=\"{{ asset('js/jquery.js') }}\"></script>
<script src=\"{{ asset('js/jquery-ui-1.10.4.min.js') }}\"></script>
<script src=\"{{ asset('js/jquery-1.8.3.min.js') }}\"></script>
<script type=\"text/javascript\" src=\"{{ asset('js/jquery-ui-1.9.2.custom.min.js') }}\"></script>
<!-- bootstrap -->
<script src=\"{{ asset('js/bootstrap.min.js') }}\"></script>
<!-- nice scroll -->
<script src=\"{{ asset('js/jquery.scrollTo.min.js') }}\"></script>
<script src=\"{{ asset('js/jquery.nicescroll.js') }}\" type=\"text/javascript\"></script>
<!-- charts scripts -->
<script src=\"{{ asset('assets/jquery-knob/js/jquery.knob.js') }}\"></script>
<script src=\"{{ asset('js/jquery.sparkline.js') }}\" type=\"text/javascript\"></script>
<script src=\"{{ asset('assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js') }}\"></script>
<script src=\"{{ asset('js/owl.carousel.js') }}\"></script>
<!-- jQuery full calendar -->
<<script src=\"{{ asset('js/fullcalendar.min.js') }}\"></script>
<!-- Full Google Calendar - Calendar -->
<script src=\"{{ asset('assets/fullcalendar/fullcalendar/fullcalendar.js') }}\"></script>
<!--script for this page only-->
<script src=\"{{ asset('js/calendar-custom.js') }}\"></script>
<script src=\"{{ asset('js/jquery.rateit.min.js') }}\"></script>
<!-- custom select -->
<script src=\"{{ asset('js/jquery.customSelect.min.js') }}\"></script>
<script src=\"{{ asset('assets/chart-master/Chart.js') }}\"></script>

<!--custome script for all page-->
<script src=\"{{ asset('js/scripts.js') }}\"></script>
<!-- custom script for this page-->
<script src=\"{{ asset('js/sparkline-chart.js') }}\"></script>
<script src=\"{{ asset('js/easy-pie-chart.js') }}\"></script>
<script src=\"{{ asset('js/jquery-jvectormap-1.2.2.min.js') }}\"></script>
<script src=\"{{ asset('js/jquery-jvectormap-world-mill-en.js') }}\"></script>
<script src=\"{{ asset('js/xcharts.min.js') }}\"></script>
<script src=\"{{ asset('js/jquery.autosize.min.js') }}\"></script>
<script src=\"{{ asset('js/jquery.placeholder.min.js') }}\"></script>
<script src=\"{{ asset('js/gdp-data.js') }}\"></script>
<script src=\"{{ asset('js/morris.min.js') }}\"></script>
<script src=\"{{ asset('js/sparklines.js') }}\"></script>
<script src=\"{{ asset('js/charts.js') }}\"></script>
<script src=\"{{ asset('js/jquery.slimscroll.min.js') }}\"></script>
<script>
  //knob
  \$(function() {
    \$(\".knob\").knob({
      'draw': function() {
        \$(this.i).val(this.cv + '%')
      }
    })
  });

  //carousel
  \$(document).ready(function() {
    \$(\"#owl-slider\").owlCarousel({
      navigation: true,
      slideSpeed: 300,
      paginationSpeed: 400,
      singleItem: true

    });
  });

  //custom select box

  \$(function() {
    \$('select.styled').customSelect();
  });

  /* ---------- Map ---------- */
  \$(function() {
    \$('#map').vectorMap({
      map: 'world_mill_en',
      series: {
        regions: [{
          values: gdpData,
          scale: ['#000', '#000'],
          normalizeFunction: 'polynomial'
        }]
      },
      backgroundColor: '#eef3f7',
      onLabelShow: function(e, el, code) {
        el.html(el.html() + ' (GDP - ' + gdpData[code] + ')');
      }
    });
  });
</script>

</body>

</html>
", "index.html.twig", "C:\\Users\\21652\\Documents\\GitHub\\CodeBrigade\\mydir\\templates\\index.html.twig");
    }
}
