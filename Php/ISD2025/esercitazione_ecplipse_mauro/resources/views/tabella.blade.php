@extends('app')


@section('contenuto')

    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Region</th>
                <th>Capital</th>
                <th>Flag</th>
            </tr>
        </thead>
        <tbody>
            @foreach ($paesi as $paese)
            <tr>
                <td>{{$paese->name}}</td>
                <td>{{$paese->region}}</td>
                <td>{{$paese->capital}}</td>
                <td>
                    <img src="{{$paese->getImage()}}" alt="">
                </td>
            </tr>
            @endforeach
        </tbody>
    </table>

@endsection
