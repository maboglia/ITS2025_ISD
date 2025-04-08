<h1>Gallery</h1>

<?php 
    if (!isset($_SESSION['username'])){
        die("Spiacenti! La visualizzazione è riservata agli utenti premium");
    }


?>

<?php foreach ($piazze as $piazza) : ?>        
   
    <figure>
    <img
        src="<?=$piazza['foto']?>"
        alt="Foto di <?=$piazza['nome']?>" />
    <figcaption><?=$piazza['nome']?></figcaption>
    </figure>
        

<?php endforeach;?>