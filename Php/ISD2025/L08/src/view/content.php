<div class="container">

    <h1><?= TITOLO ?></h1>

    <form action="" method="post">

        <div>
            <label for="marca">Marca</label>
            <input type="text" name="marca" id="marca">
        </div>

        <div>
            <label for="modello">modello</label>
            <input type="text" name="modello" id="modello">
        </div>

        <div>
            <label for="cilindrata">cilindrata</label>
            <input type="number" name="cilindrata" id="cilindrata">
        </div>

        <div>
            <label for="posti">posti</label>
            <input type="number" name="posti" id="posti">
        </div>

        <div>
            <label for="prezzo">prezzo</label>
            <input type="number" step="0.50" name="prezzo" id="prezzo">
        </div>

        <button>Add automobile</button>

    </form>

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
            <!-- Si deve ripetere foreach Automobile -->
            <?php foreach ($automobili as $auto): ?>
                <tr>
                    <td><?= $auto->marca ?></td>
                    <td><?= $auto->modello ?></td>
                    <td><?= $auto->cilindrata ?></td>
                    <td><?= $auto->posti ?></td>
                    <td><?= $auto->prezzo ?></td>
                </tr>
            <?php endforeach; ?>
            <!-- Si deve ripetere foreach Automobile -->
        </tbody>

    </table>

</div>