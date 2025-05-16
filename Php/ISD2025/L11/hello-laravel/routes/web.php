<?php

use App\Http\Controllers\AutomobiliController;
use App\Http\Controllers\AutomobiliCtrl;
use App\Models\Automobile;
use Database\Factories\AutomobileFactory;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
});

Route::get('/creaAuto', function () {
    AutomobileFactory::factory()->count(5)->make();
});

Route::get('/automobili', [AutomobiliCtrl::class, 'index']);
Route::get('/automobili/{id}', [AutomobiliCtrl::class, 'show']);


