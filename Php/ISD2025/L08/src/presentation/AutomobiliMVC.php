<?php

class AutomobiliMVC{

    private $service;

    public function __construct(){
        $this->service = new AutomobileServiceImpl();
    }

    public function index() {
        
        // request.getRequestDispatcher("header.jsp").include(request, response);
        include '../src/view/header.php';

        // request.setAttribute("automobili", this.service.getAutomobili());
        $automobili = $this->service->getAutomobili();
        
        // request.getRequestDispatcher("content.jsp").include(request, response);
        include '../src/view/content.php';
        
        // request.getRequestDispatcher("footer.jsp").include(request, response);
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
