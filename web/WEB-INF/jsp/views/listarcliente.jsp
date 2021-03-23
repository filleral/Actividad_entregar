<%-- 
    Document   : listarcliente
    Created on : 12/03/2021, 08:37:46 AM
    Author     : fille
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="cabecera.jsp" %>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/dataTables.bootstrap.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<link href="https://cdn.datatables.net/1.10.23/css/dataTables.bootstrap.min.css"/>
<script>
    $(document).ready( function () {
    $('#listadoClientes').DataTable({
        "info": true,
        "paging": true,
        "buttons": true,
        "lengthMenu":[[5,10,25,50,-1],[5,10,25,50,"All"]],
           "language":{"url": "https://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"},
        "paginate": true,
    });
} );
</script>
            <h1>Coneccion a Bases de Datos MYSql</h1>
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a href="agregarCliente.htm" class="btn btn-primary">Agregar cliente</a>
                </div>
                <div class="card-body ">
                    <table class="table table-bordered table-striped table-hover" id="listadoClientes">
                        <thead>
                            <th>id</th>
                            <th>nombre</th>
                            <th>direccion</th>
                            <th>email</th>
                            <th>Telefono</th>
                            <th>salario</th>
                        </thead>
                        <tbody>
                            <c:forEach items="${cliente}" var="dato">
                            <tr>
                                <td><c:out value="${dato.id}"></c:out></td>
                                <td><c:out value="${dato.nombre}"></c:out></td>
                                <td><c:out value="${dato.direccion}"></c:out></td>
                                <td><c:out value="${dato.correo}"></c:out></td>
                                <td><c:out value="${dato.telefono}"></c:out></td>
                                <td><c:out value="${dato.salario}"></c:out></td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>

