<?php

namespace App\Http\Controllers;

use App\Models\Automobile;
use Illuminate\Http\Request;

class AutomobiliCtrl extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
         $automobili = Automobile::all();

        return view(
            'automobili', 
            ['titolo'=>'Le automobili disponibili', 'automobili'=>$automobili]);

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
    public function show(string $id)
    {
        $automobile = Automobile::find($id);
        return view(
            'automobile', 
            ['titolo'=>'Dettaglio automobile: ' . $automobile->modello, 'automobile'=>$automobile]);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }
}
