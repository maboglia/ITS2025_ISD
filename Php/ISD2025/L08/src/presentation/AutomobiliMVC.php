<?php

class AutomobiliMVC{

    private $service;

    public function __construct(){
        $this->service = new AutomobileServiceImpl();
    }

    public function index() {
        
        include '../src/view/header.php';
        $automobili = $this->service->getAutomobili();
        include '../src/view/content.php';
        include '../src/view/footer.php';
    }

    public function save(){

        $automobile = new Automobile();
        $automobile->marca = $_POST['marca'];
        $automobile->modello = $_POST['modello'];
        $automobile->cilindrata = $_POST['cilindrata'];
        $automobile->posti = $_POST['posti'];
        $automobile->prezzo = $_POST['prezzo'];

        $this->service->save($automobile);

    }



}
