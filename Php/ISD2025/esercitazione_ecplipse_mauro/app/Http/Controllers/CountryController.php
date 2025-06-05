<?php

namespace App\Http\Controllers;

use App\Models\Country;
use Illuminate\Http\Request;

class CountryController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $titolo = "Impara la geografia";
        $paesi = Country::all();

        return view('tabella', compact('titolo', 'paesi'));
        // return view('tabella', ['titolo'=>$titolo, 'paesi'=>$paesi]);

    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(Country $country)
    {
        $titolo = "Impara la geografia";
        return view('card', compact('country', 'titolo'));
    }
    
    /**
     * Display the specified resource.
     */
    public function random()
    {
        $titolo = "Impara la geografia";
        $codici = ['afg', 'ita', 'esp'];
        $random = rand(0, count($codici)-1);
        $country = Country::find($codici[$random]);
        return view('card', compact('country', 'titolo'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Country $country)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Country $country)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Country $country)
    {
        //
    }
}
