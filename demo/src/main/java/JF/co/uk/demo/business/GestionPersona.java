package JF.co.uk.demo.business;

import com.cultodeportivo.demo65jakartaee2.daos.PersonaDAO;
import com.cultodeportivo.demo65jakartaee2.models.Persona;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

@ApplicationScoped
public class GestionPersona {

    @Inject
    private PersonaDAO personaDAO;

    public void crearPersona(Persona persona) {
        personaDAO.crearPersona(persona);
    }

    public Persona actualizarPersona(Persona persona) {
        return personaDAO.actualizarPersona(persona);
    }

    public Persona buscarPorId(Long id) {
        return personaDAO.buscarPorId(id);
    }

    public Persona buscarPorCedula(String cedula) {
        return personaDAO.buscarPorCedula(cedula);
    }

    public List<Persona> listarPersonas() {
        return personaDAO.listarPersonas();
    }

    public void eliminarPersona(Long id) {
        personaDAO.eliminarPersona(id);
    }
}
