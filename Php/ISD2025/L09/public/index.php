<?php require '../vendor/autoload.php';  // Include l'autoload di Composer?>

<?php

use App\model\Libro;

$libro1 = new Libro(1, 'Io robot', 10);
$libro2 = new Libro(2, 'I malavoglia', 5);

$libri = [$libro1, $libro2];

foreach ($libri as $libro) {
    echo $libro->titolo . '<br>';
}


?>