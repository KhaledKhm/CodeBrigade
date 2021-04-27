<?php

/**
 * This file has been auto-generated
 * by the Symfony Routing Component.
 */

return [
    false, // $matchHost
    [ // $staticRoutes
        '/_profiler' => [[['_route' => '_profiler_home', '_controller' => 'web_profiler.controller.profiler::homeAction'], null, null, null, true, false, null]],
        '/_profiler/search' => [[['_route' => '_profiler_search', '_controller' => 'web_profiler.controller.profiler::searchAction'], null, null, null, false, false, null]],
        '/_profiler/search_bar' => [[['_route' => '_profiler_search_bar', '_controller' => 'web_profiler.controller.profiler::searchBarAction'], null, null, null, false, false, null]],
        '/_profiler/phpinfo' => [[['_route' => '_profiler_phpinfo', '_controller' => 'web_profiler.controller.profiler::phpinfoAction'], null, null, null, false, false, null]],
        '/_profiler/open' => [[['_route' => '_profiler_open_file', '_controller' => 'web_profiler.controller.profiler::openAction'], null, null, null, false, false, null]],
        '/offre' => [[['_route' => 'offre', '_controller' => 'App\\Controller\\OffreController::index'], null, null, null, false, false, null]],
        '/Ajouteroffre' => [[['_route' => 'Ajouteroffre', '_controller' => 'App\\Controller\\OffreController::AjouterOffre'], null, null, null, false, false, null]],
        '/postulant' => [[['_route' => 'postulant', '_controller' => 'App\\Controller\\PostulantController::index'], null, null, null, false, false, null]],
    ],
    [ // $regexpList
        0 => '{^(?'
                .'|/_(?'
                    .'|error/(\\d+)(?:\\.([^/]++))?(*:38)'
                    .'|wdt/([^/]++)(*:57)'
                    .'|profiler/([^/]++)(?'
                        .'|/(?'
                            .'|search/results(*:102)'
                            .'|router(*:116)'
                            .'|exception(?'
                                .'|(*:136)'
                                .'|\\.css(*:149)'
                            .')'
                        .')'
                        .'|(*:159)'
                    .')'
                .')'
                .'|/supp(?'
                    .'|rimerOffre/([^/]++)(*:196)'
                    .'|Post/([^/]++)(*:217)'
                .')'
                .'|/modifierOffre/([^/]++)(*:249)'
                .'|/listPost/([^/]++)(*:275)'
                .'|/ajout(?'
                    .'|Fav/([^/]++)(*:304)'
                    .'|Post/([^/]++)(*:325)'
                .')'
                .'|/rendezvous/([^/]++)(*:354)'
            .')/?$}sD',
    ],
    [ // $dynamicRoutes
        38 => [[['_route' => '_preview_error', '_controller' => 'error_controller::preview', '_format' => 'html'], ['code', '_format'], null, null, false, true, null]],
        57 => [[['_route' => '_wdt', '_controller' => 'web_profiler.controller.profiler::toolbarAction'], ['token'], null, null, false, true, null]],
        102 => [[['_route' => '_profiler_search_results', '_controller' => 'web_profiler.controller.profiler::searchResultsAction'], ['token'], null, null, false, false, null]],
        116 => [[['_route' => '_profiler_router', '_controller' => 'web_profiler.controller.router::panelAction'], ['token'], null, null, false, false, null]],
        136 => [[['_route' => '_profiler_exception', '_controller' => 'web_profiler.controller.exception_panel::body'], ['token'], null, null, false, false, null]],
        149 => [[['_route' => '_profiler_exception_css', '_controller' => 'web_profiler.controller.exception_panel::stylesheet'], ['token'], null, null, false, false, null]],
        159 => [[['_route' => '_profiler', '_controller' => 'web_profiler.controller.profiler::panelAction'], ['token'], null, null, false, true, null]],
        196 => [[['_route' => 'supprimerOffre', '_controller' => 'App\\Controller\\OffreController::SupprimerOffre'], ['id'], null, null, false, true, null]],
        217 => [[['_route' => 'suppPost', '_controller' => 'App\\Controller\\PostulantController::suppPost'], ['id'], null, null, false, true, null]],
        249 => [[['_route' => 'modifierOffre', '_controller' => 'App\\Controller\\OffreController::modifierOffre'], ['id'], null, null, false, true, null]],
        275 => [[['_route' => 'listPost', '_controller' => 'App\\Controller\\OffreController::ListPost'], ['id'], null, null, false, true, null]],
        304 => [[['_route' => 'ajoutFav', '_controller' => 'App\\Controller\\OffreController::AjoutFavoris'], ['id'], null, null, false, true, null]],
        325 => [[['_route' => 'ajoutPost', '_controller' => 'App\\Controller\\PostulantController::AjouterPostul'], ['id'], null, null, false, true, null]],
        354 => [
            [['_route' => 'rendezvous', '_controller' => 'App\\Controller\\RendezvousController::index'], ['id'], null, null, false, true, null],
            [null, null, null, null, false, false, 0],
        ],
    ],
    null, // $checkCondition
];
