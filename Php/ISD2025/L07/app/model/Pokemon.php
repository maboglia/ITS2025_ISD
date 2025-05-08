<?php 
class Pokemon{
    private $id;
    private $name;
    private $immagine;

    public function __get($name) {
        if(isset($this->$name)) 
        return $this->$name;
    }
    public function __set($name, $value) {
        $this->$name = $value;
    }
    public function __tostring() {
        return "". $this->id ."". $this->name ;
    }
}