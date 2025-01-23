package JF.co.uk.demo.services;

import com.cultodeportivo.demo65jakartaee2.business.GestionEspacios;
import com.cultodeportivo.demo65jakartaee2.models.Espacio;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/espacios")
public class EspacioService {

    @Inject
    private GestionEspacios gestionEspacios;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createEspacio(Espacio espacio) {
        try{
            gestionEspacios.crearEspacio(espacio);
            return Response.status(Response.Status.CREATED)
                    .entity(espacio)
                    .build();
        } catch(Exception e){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Error al crear la persona: " + e.getMessage())
                    .build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerEspacio(@PathParam("id") Long id) {
        Espacio espacio = gestionEspacios.buscarPorId(id);
        if (espacio != null) {
            return Response.ok(espacio).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Espacio no encontrado")
                    .build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEspacios() {
        List<Espacio> espacios = gestionEspacios.listarEspacios();
        return Response.ok().entity(espacios).build();
    }
}
