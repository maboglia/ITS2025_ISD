<ul>
    <?php

        foreach ($etichette as $chiave => $valore) {
            echo "<li>" . "<a href='$valore'>$chiave</a>" . "</li>";            
        }

        if (isset($_SESSION['username'])){
            echo "<li>" . "<a href='?page=logout'>Logout</a>" . "</li>";
        }

    ?>
</ul>

