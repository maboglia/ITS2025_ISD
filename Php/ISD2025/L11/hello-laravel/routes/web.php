<?php

use App\Http\Controllers\AutomobiliController;
use App\Http\Controllers\AutomobiliCtrl;
use App\Http\Controllers\CountryController;
use App\Http\Controllers\QuizController;
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

Route::resource('/countries', CountryController::class);

Route::get('/quiz/capitali', [QuizController::class, 'quiz'])->name('quiz-capitali');
Route::post('/quiz/capitali', [QuizController::class, 'checkAnswer'])->name('quiz-capitali-answer');