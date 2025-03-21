<?php

    define('TITOLO', 'SASSO CARTA FORBICI');

    $sceltaUmano =  isset( $_GET['simbolo'] ) ? $_GET['simbolo'] : "" ;
    $sceltaMacchina = sceltaMacchina();

    function valuta($umano, $macchina){

        if ($umano == $macchina){
            return 'Pareggio';
        } else {

            switch ($umano) {
                case 'SASSO':
                    return ($macchina == 'FORBICI') ? "Vince Umano" : "Vince Macchina";
                    break;
                case 'FORBICI':
                    return ($macchina == 'CARTA') ? "Vince Umano" : "Vince Macchina";
                    break;
                case 'CARTA':
                    return ($macchina == 'SASSO') ? "Vince Umano" : "Vince Macchina";
                    break;
                
                default:
                    # code...
                    break;
            }






        }





    }


    function sceltaMacchina() {
        
        $casuale = rand(0,2);

        
        if ($casuale == 0){
            $scelta = "FORBICI";
        } elseif ($casuale == 1) {
            $scelta = "CARTA";
        } else {
            $scelta = "SASSO";
        }

        return $scelta;

    }


?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?= TITOLO ?></title>
    <style>img {width: 100px;}</style>
</head>
<body>
    
    <h1><?= TITOLO ?></h1>

    <ul>
        <li><a href="?simbolo=SASSO"><img src="https://www.galleriailvicolo.it/wp-content/uploads/2021/01/sessione_studio-073.png"></a></li>
        <li><a href="?simbolo=CARTA"><img src="https://cdn11.bigcommerce.com/s-2i5mq6440u/content/theme-images/hero-stock-paper.png" alt=""></a></li>
        <li><a href="?simbolo=FORBICI"><img src="https://m.media-amazon.com/images/I/51QtmdQD-sL.jpg" alt=""></a></li>
    </ul>

    <h2>Umano gioca <?= $sceltaUmano ?></h2>
    <h2>Macchina gioca <?= $sceltaMacchina ?></h2>
    <h2><?= valuta($sceltaUmano, $sceltaMacchina) ?></h2>


</body>
</html>


