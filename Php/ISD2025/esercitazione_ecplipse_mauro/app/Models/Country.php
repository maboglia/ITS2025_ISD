<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Country extends Model
{
    protected $primaryKey = 'alpha3Code';

    protected $image;

    public function getImage(){
        return  'flags/' . strtolower($this->alpha2Code) . '.png';
    }
}
