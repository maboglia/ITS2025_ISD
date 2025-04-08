<h1>Wordle</h1>

<form action="" method="post">
    <div class="grid">
        <div><input type="text" class="char" placeholder="_" name="char1"></div>
        <div><input type="text" class="char" placeholder="_" name="char2"></div>
        <div><input type="text" class="char" placeholder="_" name="char3"></div>
        <div><input type="text" class="char" placeholder="_" name="char4"></div>
        <div><input type="text" class="char" placeholder="_" name="char5"></div>
    </div>
    <div><input type="submit" class="btn" value="Try"></div>

</form>

<?php
    
include './app/model/wordle.php';
    
    $game = new Wordle();


//    $parolaSegreta = $_SESSION['parola_segreta'] ?? $_SESSION['parola_segreta'] = secretWord();

    $userChar1 = ( $_POST["char1"]  ?? "");
    $userChar2 = ( $_POST["char2"]  ?? "");
    $userChar3 = ( $_POST["char3"]  ?? "");
    $userChar4 = ( $_POST["char4"]  ?? "");
    $userChar5 = ( $_POST["char5"]  ?? "");

//    $parola = array($userChar1,$userChar2,$userChar3,$userChar4,$userChar5);
    $parola = [$userChar1,$userChar2,$userChar3,$userChar4,$userChar5];

    $game->sceltaUtente($parola); 
    
    if (isset($_GET['reset']))
      $game->reset();
    
    echo "<pre>";
    print_r($game);
    echo "</pre>";
    
    

?>