<?php

define('HOST', 'localhost:3306');
define('USER', 'ITS_2025');
define('PASS', 'ITS_2025');

define('DB_NAME', 'esercitazioni');

define('TABLE', 'automobili');

//model
require_once '../src/entities/Automobile.php';
//DAO
require_once '../src/dal/Connessione.php';
require_once '../src/dal/AutomobileDAO.php';
require_once '../src/dal/AutomobileDAOImpl.php';
//service
require_once '../src/services/AutomobileService.php';
require_once '../src/services/AutomobileServiceImpl.php';
//controller
require_once '../src/presentation/AutomobiliMVC.php';
require_once '../src/integration/AutomobiliREST.php';

//deve essere invocata PRIMA di qualsiasi OUTPUT
session_start();//spazio di memoria server-side











