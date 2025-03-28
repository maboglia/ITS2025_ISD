<table>
    <thead>
        <tr>
            <th>Nome</th>
            <th>Tipo 1</th>
            <th>Tipo 2</th>
        </tr>
    </thead>

    <tbody>

        <?php foreach($listaPokemon as $singlePokemon) : ?>

            <?php include './app/view/righe_tabella.php'; ?>

        <?php endforeach; ?>

    </tbody>



</table>