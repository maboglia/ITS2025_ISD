@extends('app')


@section('contenuto')
    <article>

        <header>
            <h2>{{$country->name}}</h2>
        </header>

        <p>{{$country->capital}}</p>
        <p>{{$country->population}}</p>
        <p>{{$country->region}}</p>





    </article>
@endsection
