<?php

interface AutomobileDAO {

    const FIND_ALL = 'SELECT * FROM ' . TABLE;

    const ADD = 'INSERT INTO ' . TABLE . ' (marca, modello, cilindrata, posti, prezzo) VALUES (:marca, :modello, :cilindrata, :posti, :prezzo)';

    function getAutomobili();
    function save($automobile);

}


