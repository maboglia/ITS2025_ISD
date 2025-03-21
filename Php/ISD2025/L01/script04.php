<?php

$gira = true;

while ($gira) {
    echo "Oggi mi girano :) \n";
    
     if  (rand(1,100) > 95) {
         $gira = false;
         echo 'non girano più!!!!!!!!!!!!!!!';
         
     }
}
