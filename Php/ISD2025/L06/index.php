<?php  include './model/prodotto.php'; ?>
<?php  include './controller/prodottiCtrl.php'; ?>


<?php

$ctrl = new ProdottiCtrl();

$p1 = new Prodotto("smartphone IPhone", 1300);
$p2 = new Prodotto("smartphone Samsung", 600);
$p3 = new Prodotto("smartphone Huawey", 300);

$ctrl->addProdotto($p1);
$ctrl->addProdotto($p2);
$ctrl->addProdotto($p3);



// foreach ($ctrl->getProdotti() as $prodotto) {
//     echo '<h1>' . $prodotto . '</h1>';
// }

header('Access-Control-Allow-Origin: *');
header("Content-Type: application/json");

echo json_encode($ctrl->getProdotti());




?>