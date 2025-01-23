package JF.co.uk.demo.services;

import com.cultodeportivo.demo65jakartaee2.models.Usuario;
import com.cultodeportivo.demo65jakartaee2.business.GestionUsuarios;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/usuarios") // Define el endpoint raíz para esta clase
public class UsuarioService {

    @Inject
    private GestionUsuarios gestionUsuarios;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON) // Especifica que la respuesta es JSON
    public Response obtenerUsuarioPorId(@PathParam("id") Long id) {
        Usuario usuario = gestionUsuarios.obtenerUsuarioPorId(id);
        if (usuario != null) {
            return Response.ok(usuario).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Usuario no encontrado").build();
        }
    }

}
