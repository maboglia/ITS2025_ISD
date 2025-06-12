<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>{{ $titolo }}</title>
    <link
  rel="stylesheet"
  href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
>
<style>
    #risposte {
        display: flex;
        column-gap: 10px;
    }

</style>
</head>
<body>
    <div class="container">
        <h1>{{ $titolo }}</h1>
        @if ($rispostaprecedente)
            <h3>Tentativo precedente: {{$messaggio}} {{$rispostaprecedente}}</h3>
        @endif
        <h2>Punteggio: {{ $score }}</h2>
<article>
    <h2>{{ $paese->name }}</h2>
    <h3>{{ $paese->region }}</h3>
                        
    <figure><img src="/flags/{{ strtolower($paese->alpha2Code) }}.png"></figure>

    <h2>Qual è la capitale dello stato {{ $paese->name }}? </h2>
    <div id="risposte">
        @foreach ($alternative as $alt)
            <form method="post" action="/quiz/capitali">
            @csrf
            <input type="hidden" name="risposta" value="{{$alt->capital}}">
            <button>{{$alt->capital}}</button>
            </form>    
        @endforeach
    </div>

</article>
                 
                        
                 
    </div>
</body>
</html>