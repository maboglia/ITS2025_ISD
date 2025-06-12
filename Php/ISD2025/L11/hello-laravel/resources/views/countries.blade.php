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
                    <th>name</th>
                    <th>region</th>
                    <th>capital</th>
                    <th>flag</th>
                </tr>
            </thead>
            <tbody>
                <!-- ripetere for each country in countries -->
                 @foreach ($countries as $country)
                    <tr>
                        <td><a href="countries/{{ $country->alpha3Code }}">{{ $country->name }}</a>  </td>
                        <td>{{ $country->region }}</td>
                        <td>{{ $country->capital }}</td>
                        <td><img src="flags/{{ strtolower($country->alpha2Code) }}.png"></td>
                        
                    </tr>
                 @endforeach
            </tbody>
        </table>
    </div>
</body>
</html>