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
        <table>
            <thead>
                <tr>
                    <th>Marca</th>
                    <th>Modello</th>
                    <th>Cilindrata</th>
                    <th>Posti</th>
                    <th>Prezzo</th>
                </tr>
            </thead>
            <tbody>
                <!-- ripetere for each auto in automobili -->
                 @foreach ($automobili as $auto)
                    <tr>
                        <td>{{ $auto->marca }}</td>
                        <td>{{ $auto->modello }}</td>
                        <td>{{ $auto->cilindrata }}</td>
                        <td>{{ $auto->posti }}</td>
                        <td>{{ $auto->prezzo }}</td>
                    </tr>
                 @endforeach
            </tbody>
        </table>
    </div>
</body>
</html>