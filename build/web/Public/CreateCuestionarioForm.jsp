<details>
    <summary>
        Crear cuestionario
    </summary>
    <form action="FrontServlet">
        <h2 >
            Pregunta 1:
        </h2>
        <textarea style="width:100%" name="pregunta1" rows="4" cols="20">
        </textarea>
        <input  type="submit" value="Crear cuestionario">
        <h3>
            Respuesta 1:
        </h3>
        <input style="width:100%"  type="text" name="respuestaTexto11" value="" />
        <h4>
            ¿Es correcta?:
        </h4>
        <input type="checkbox" name="respuestaVerdad11" value="cierta" />
        <h3>
            Respuesta 2:
        </h3>
        <input style="width:100%" type="text" name="respuestaTexto12" value="" />
        <h4>
            ¿Es correcta?:
        </h4>
        <input type="checkbox" name="respuestaVerdad12" value="cierta" />
        <h3>
            Respuesta 3:
        </h3>
        <input style="width:100%" type="text" name="respuestaTexto13" value="" />
        <h4>
            ¿Es correcta?:
        </h4>
        <input type="hidden" name="command" value="CuestionarioCommand"/>
        <input type="checkbox" name="respuestaVerdad13" value="cierta" />
    </form>
</details>