<?php

namespace App\Http\Controllers;


use App\Models\Automobile;
use Illuminate\Http\Request;

class AutomobiliController extends Controller
{
    
    public function index() {
        
        $auto = new Automobile();

        $auto->marca = "BMW";
        $auto->modello = "X4";
        $auto->cilindrata = 3000;
        $auto->posti = 5;
        $auto->prezzo = 50000;

        $automobili = Automobile::all();

        return view(
            'automobili', 
            ['titolo'=>'Le automobili disponibili', 'automobili'=>$automobili]);

    }


}