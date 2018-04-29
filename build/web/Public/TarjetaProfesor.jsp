<div class="col-md-4">
    <div class="card" style="width: 18rem;">
        <h5 class="card-title"><%= profesor.getNombre()%></h5>
        <h6 class="card-subtitle mb-2 text-muted"><%= profesor.getAsignatura()%></h6>
        <i class="fas fa-user fa-8x card-img-top ml-5"></i>
        <div class="card-body">
            <ul class="card-text">
                <li class="card-text">
                    <i class="fas fa-envelope-square"></i> Correo: <%= profesor.getCorreo()%>
                </li>
                <li class="card-text">
                    <i class="fas fa-phone"></i> Telefono: <%= profesor.getTelefono()%>
                </li>
                <li class="card-text">
                    <i class="fas fa-folder-open"></i> Despacho: <%= profesor.getDespacho()%>
                </li>
            </ul>
        </div>
    </div>
</div>