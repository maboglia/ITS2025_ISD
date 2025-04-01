<?php

//costanti
define("TITOLO","Città di Torino");

//array associativo
$etichette = [
    "home"=> "?",
    "gallery"=> "?page=gallery",
    "contacts"=> "?page=contacts",
];

$monumenti = [
    'Mole Antonelliana',
    'Palazzo Madama',
    'Palazzo Reale',
];

$piazze = [
    ['nome'=> 'Piazza San Carlo','foto'=> 'https://www.italia.it/content/dam/tdh/it/interests/piemonte/torino/torino-in-48-ore/media/20220223132855-piazza-san-carlo-torino-piemonte-shutterstock-2102981095-rid.jpg'],//0
    ['nome'=> 'Piazza Vittorio','foto'=> 'https://t4.ftcdn.net/jpg/05/25/41/97/360_F_525419739_G03goNiOnEGQYFbvUzbDbGcAy6iz01iB.jpg'],//1
    ['nome'=> 'Piazza Statuto','foto'=> 'https://fromturinwithlove.com/wp-content/uploads/2019/05/torino-sottosopra-e1558283173254-1024x678.jpg'],//2
    ['nome'=> 'Piazza Bengasi','foto'=> 'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSrmdPigaiJ_eIWy55Q32pNhacuofB4LppExs-YeVytBIGekx6FsKFWrVvNBNV7JpafZUo3Wleq0h4SAn6cJwO-S6Wq9KWdzCxJHEYwyQ'],//3
];

//avvio la sessione per memorizzare info
session_start();







