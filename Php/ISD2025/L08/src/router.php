<?php


if (isset($_GET['api'])){
    $ctrl = new AutomobiliREST();
    $ctrl->index();
} else {
    $ctrl = new AutomobiliMVC();
    $ctrl->index();
}







?>