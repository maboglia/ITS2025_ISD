<?php include 'header.php';  ?>

<?php include 'menu.php';  ?>

<?php

$pagina = 'home';
//routing
if ( isset($_GET['page']) ){

    if ($_GET['page'] == 'pagina1'){
        //istruzioni per includere la pagina 1
        include 'pagina1.php';
    }

    if ($_GET['page'] == 'pagina2'){
        //istruzioni per includere la pagina 2
        include 'pagina2.php';
    }


} else {
          //sei in home page

    echo "La variabile page NON è settata e ti trovi in: " . $pagina;
}



//echo 'funziona';


?>


<?php include 'footer.php';  ?>