<%@page import="entities.Automobile"%>
<%@page import="java.util.List"%>
<div class="container">

    <h1><%= request.getAttribute("TITOLO") %></h1>

    <form action="http://localhost:8000/ITS2025_ISD/Php/ISD2025/L08/public/" method="post">

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
        	<% List<Automobile> automobili = (List<Automobile>) request.getAttribute("automobili"); %>
            <!-- Si deve ripetere foreach Automobile -->
            <% for (var auto : automobili) { %>
                <tr>
                    <td><%= auto.getMarca() %></td>
                    <td><%= auto.getModello() %></td>
                    <td><%= auto.getCilindrata() %></td>
                    <td><%= auto.getPosti() %></td>
                    <td><%= auto.getPrezzo() %></td>
                </tr>
            <% } %>
            <!-- Si deve ripetere foreach Automobile -->
        </tbody>

    </table>

</div>