<?php

if (isset($_POST['marca'])){

    $ctrl = new AutomobiliMVC();
    $ctrl->save();

}


if (isset($_GET['api'])){
    $ctrl = new AutomobiliREST();
    $ctrl->index();
} else {
    $ctrl = new AutomobiliMVC();
    $ctrl->index();
}







?>