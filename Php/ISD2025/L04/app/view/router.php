<?php

$pagina = isset($_GET["page"]) ? $_GET["page"] : 'home';

switch ($pagina) {
    case 'gallery':
        include './app/view/galleria.php';
        break;
    
    case 'contacts':
        include './app/view/contatti.php';
        break;
    
    default:
    include './app/view/home.php';
    break;
}










