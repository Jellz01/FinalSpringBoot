package JF.co.uk.demo.services;

import com.cultodeportivo.demo65jakartaee2.business.GestionPersona;
import com.cultodeportivo.demo65jakartaee2.models.Persona;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/personas")
public class PersonaService {

    @Inject
    private GestionPersona gestionPersonas;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearPersona(Persona persona) {
        try {
            gestionPersonas.crearPersona(persona);
            return Response.status(Response.Status.CREATED)
                    .entity(persona)
                    .build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Error al crear la persona: " + e.getMessage())
                    .build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerPersona(@PathParam("id") Long id) {
        Persona persona = gestionPersonas.buscarPorId(id);
        if (persona != null) {
            return Response.ok(persona).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Persona no encontrada")
                    .build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarPersonas() {
        List<Persona> personas = gestionPersonas.listarPersonas();
        return Response.ok(personas).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response actualizarPersona(Persona persona) {
        Persona personaActualizada = gestionPersonas.actualizarPersona(persona);
        if (personaActualizada != null) {
            return Response.ok(personaActualizada).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Persona no encontrada")
                    .build();
        }
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response eliminarPersona(@PathParam("id") Long id) {
        try {
            gestionPersonas.eliminarPersona(id);
            return Response.status(Response.Status.NO_CONTENT).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Error al eliminar la persona: " + e.getMessage())
                    .build();
        }
    }
}
