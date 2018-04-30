<details>
    <summary>Crear curso</summary>
    <form action="FrontServlet" method="POST">
        <h2 style="font-weight: 700">Titulo:</h2>
        <input style="width:100%" type="text" name="titulo" required/>
        <h2 style="font-weight: 700">Autor:</h2>
        <input style="width:100%" type="text" name="autor" required/>
        <h2 style="font-weight: 700">Asignatura:</h2>
        <select  style="width:100%" name="asignatura">
            <option>Matematicas</option>
            <option>Ingles</option>
            <option>Lengua</option>
            <option>Literatura</option>
            <option>Biologia</option>
            <option>Quimica</option>
            <option>Fisica</option>
            <option>Programacion</option>
            <option>Frances</option>
            <option>Chino</option>
        </select>
        <h2 style="font-weight:700"> Duracion (en horas):</h2>
        <input style="width:100%" type="number" name="duracion"/>
        <h2 style="font-weight:700">Enlace al curso en video:</h2>
        <input style="width:100%" type="url" name="video" pattern="https?://.+" title="video">
        <h2 style="font-weight:700">Enlace a la imagen del curso:</h2>
        <input style="width:100%" type="url" name="imagen" pattern="https?://.+" title="imagen">

        <input type="hidden" name="command" value="CreateCourseCommand">
        <input type="submit" value="Crear curso" onclick="alert('El curso se ha creado');">
    </form>
</details>
