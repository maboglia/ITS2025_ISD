
const TITOLO = document.querySelector("h1");

TITOLO.textContent = "è ora di andare in pausa";

const URL = 'http://localhost:8000/ITS2025_ISD/Php/ISD2025/L06/';

const LISTA = document.getElementById('listaProdotti');

fetch(URL)
    .then(risposta => risposta.json() )
    .then(prodotti => {
        let output = '';
        for (const prodotto of prodotti) {
            console.log(prodotto);
            output += '<li>' + prodotto.nome + '</li>';
        }

        LISTA.innerHTML = output;
    })