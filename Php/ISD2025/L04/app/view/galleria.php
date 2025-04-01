<h1>Gallery</h1>

<?php foreach ($piazze as $piazza) : ?>        

    <figure>
    <img
        src="<?=$piazza['foto']?>"
        alt="Foto di <?=$piazza['nome']?>" />
    <figcaption><?=$piazza['nome']?></figcaption>
    </figure>
        

<?php endforeach;?>