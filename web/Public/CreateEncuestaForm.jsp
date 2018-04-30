<details>
    <summary>
        Crear encuesta
    </summary>

    <form action="FrontServlet">
        <h2>
            Cuestion 1:
        </h2>
        <textarea style="width:100%" name="cuestion1" rows="4" cols="20">
        </textarea>
        <input type="submit" value="Crear encuesta">
        <h3>
            Los alumnos podran votar mediante las siguientes respuestas:
        </h3>
        <div style="display: flex">
            <h4>0</h4><input type="radio" name="encuesta1" value="0" disabled />
            <h4>1</h4><input type="radio" name="encuesta1" value="1" disabled/>
            <h4>2</h4><input type="radio" name="encuesta1" value="2" disabled/>
            <h4>3</h4><input type="radio" name="encuesta1" value="3" disabled/>
            <h4>4</h4><input type="radio" name="encuesta1" value="4" disabled/>
            <h4>5</h4><input type="radio" name="encuesta1" value="5" disabled/>
            <h4>6</h4><input type="radio" name="encuesta1" value="6" disabled/>
            <h4>7</h4><input type="radio" name="encuesta1" value="7" disabled/>
            <h4>8</h4><input type="radio" name="encuesta1" value="8" disabled/>
            <h4>9</h4><input type="radio" name="encuesta1" value="9" disabled/>
            <h4>10</h4><input type="radio" name="encuesta1" value="10" disabled />
            <input type="hidden" name="command" value="EncuestaCommand"/>
        </div>
    </form>
</details>