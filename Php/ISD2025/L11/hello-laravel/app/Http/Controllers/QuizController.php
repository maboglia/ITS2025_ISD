<?php

namespace App\Http\Controllers;

use App\Models\Country;
use Illuminate\Http\Request;

class QuizController extends Controller
{
    
    function quiz(Request $request){
        
        if (!$request->session()->has('punteggio')){
            $request->session()->put('punteggio',0);
        }

        $rispostaprecedente = $request->input('corretta') ?? null;
        $messaggio = $request->input('msg') ?? null;

        $titolo = "Chi ha mangiato il kilimangiaro?";
        $countries = Country::all()->random(3);
        $score = $request->session()->get('punteggio');

        $paese = $countries[0];

        $request->session()->put('paese',$paese);

        $alternative = [...$countries];

        shuffle($alternative);

        return view('quiz', compact('titolo', 'paese', 'alternative', 'score', 'rispostaprecedente', 'messaggio'));


    }

    function checkAnswer(Request $request){
        
        

        $paese = $request->session()->get('paese');
        $risposta = $request->input('risposta');
        $messaggio = "Errore, la risposta corretta era ";
        
        var_dump($paese->capital);
        var_dump($risposta);
        
        if ($paese->capital == $risposta){
            $point = $request->session()->get('punteggio') + 1;
            $request->session()->put('punteggio',$point);
            $messaggio = "Esatto la capitale era ";
        }

        return redirect()->route('quiz-capitali',['corretta'=>$paese->capital, 'msg'=>$messaggio]);

    }


}
