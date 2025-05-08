<?php

class AutomobiliREST{

    private $service;

    public function __construct(){
        $this->service = new AutomobileServiceImpl();
    }



    public function index() {
        
        header('Content-Type: application/json');
        echo json_encode($this->service->getAutomobili());

    }





}












