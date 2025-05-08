<?php  

$pagina = $_GET["page"] ?? "home";
switch ($pagina) {  
    case "home":
        include VIEWS. "home.php";
        break;
    case "gallery":
        include VIEWS. "gallery.php";
        break;
    case "api":
        include VIEWS. "api.php";
        break;
    default:
        include VIEWS. "home.php";
        break;

        
}
