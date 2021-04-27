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
        '/evenement' => [[['_route' => 'evenement', '_controller' => 'App\\Controller\\EvenementController::index'], null, null, null, false, false, null]],
        '/evenementf' => [[['_route' => 'evenementf', '_controller' => 'App\\Controller\\EvenementController::ind'], null, null, null, false, false, null]],
        '/home' => [[['_route' => 'home', '_controller' => 'App\\Controller\\EvenementController::in'], null, null, null, false, false, null]],
        '/stats' => [[['_route' => 'stats', '_controller' => 'App\\Controller\\EvenementController::statistiques'], null, null, null, false, false, null]],
        '/ajouterEvenement' => [[['_route' => 'ajouterEvenement', '_controller' => 'App\\Controller\\EvenementController::createEvenement'], null, null, null, false, false, null]],
        '/postulant' => [[['_route' => 'postulant', '_controller' => 'App\\Controller\\PostulantController::index'], null, null, null, false, false, null]],
        '/inscriptions' => [[['_route' => 'inscriptions', '_controller' => 'App\\Controller\\PostulantController::inde'], null, null, null, false, false, null]],
        '/promotion' => [[['_route' => 'promotion', '_controller' => 'App\\Controller\\PromotionController::index'], null, null, null, false, false, null]],
        '/ajouterPromotion' => [[['_route' => 'ajouterPromotion', '_controller' => 'App\\Controller\\PromotionController::createPromotion'], null, null, null, false, false, null]],
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
                .'|/listPost(?'
                    .'|/([^/]++)(*:190)'
                    .'|1/([^/]++)(*:208)'
                .')'
                .'|/modifier(?'
                    .'|Evenement/([^/]++)(*:247)'
                    .'|Promotion/([^/]++)(*:273)'
                .')'
                .'|/supprimer(?'
                    .'|Evenement/([^/]++)(*:313)'
                    .'|Promotion/([^/]++)(*:339)'
                .')'
                .'|/ajoutP(?'
                    .'|art(?'
                        .'|/([^/]++)(*:373)'
                        .'|1/([^/]++)(*:391)'
                    .')'
                    .'|romo/([^/]++)(*:413)'
                .')'
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
        190 => [[['_route' => 'listPost', '_controller' => 'App\\Controller\\EvenementController::ListPost'], ['id'], null, null, false, true, null]],
        208 => [[['_route' => 'listPost1', '_controller' => 'App\\Controller\\EvenementController::ListPost1'], ['id'], null, null, false, true, null]],
        247 => [[['_route' => 'modifierEvenement', '_controller' => 'App\\Controller\\EvenementController::updateEvenement'], ['id'], null, null, false, true, null]],
        273 => [[['_route' => 'modifierPromotion', '_controller' => 'App\\Controller\\PromotionController::updatePromotion'], ['id'], null, null, false, true, null]],
        313 => [[['_route' => 'supprimerEvenement', '_controller' => 'App\\Controller\\EvenementController::deleteEvenement'], ['id'], null, null, false, true, null]],
        339 => [[['_route' => 'supprimerPromotion', '_controller' => 'App\\Controller\\PromotionController::deletePromotion'], ['id'], null, null, false, true, null]],
        373 => [[['_route' => 'ajoutPart', '_controller' => 'App\\Controller\\PostulantController::AjouterPart'], ['id'], null, null, false, true, null]],
        391 => [[['_route' => 'ajoutPart1', '_controller' => 'App\\Controller\\PostulantController::AjouterPart1'], ['id'], null, null, false, true, null]],
        413 => [
            [['_route' => 'ajoutPromo', '_controller' => 'App\\Controller\\PromotionController::AjouterPromo'], ['id'], null, null, false, true, null],
            [null, null, null, null, false, false, 0],
        ],
    ],
    null, // $checkCondition
];
