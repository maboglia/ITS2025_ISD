<?php

class AutomobileServiceImpl implements AutomobileService {

    private $dao;

    public function __construct(){
        $this->dao = new AutomobileDAOImpl();
    }

    public function getAutomobili() {
        return $this->dao->getAutomobili();
    }

    public function save($automobile){
        $this->dao->save($automobile);
    }

}
