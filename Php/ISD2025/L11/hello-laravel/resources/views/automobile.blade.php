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
</head>
<body>
    <div class="container">
        <h1>{{ $titolo }}</h1>

    <ul>
                        <li>{{ $automobile->marca }}</li>
                        <li>{{ $automobile->modello }}</li>
                        <li>{{ $automobile->cilindrata }}</li>
                        <li>{{ $automobile->posti }}</li>
                        <li>{{ $automobile->prezzo }}</li>
    </ul>


    </div>
</body>
</html>