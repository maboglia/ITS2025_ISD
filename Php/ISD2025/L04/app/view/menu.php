<ul>
    <?php

        foreach ($etichette as $chiave => $valore) {
            echo "<li>" . "<a href='$valore'>$chiave</a>" . "</li>";            
        }
    ?>
</ul>

