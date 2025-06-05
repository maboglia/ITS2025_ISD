<?php

use App\Http\Controllers\CountryController;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
});

Route::get('/random', [CountryController::class, 'random'])->name('random');

Route::resource('/countries', CountryController::class);