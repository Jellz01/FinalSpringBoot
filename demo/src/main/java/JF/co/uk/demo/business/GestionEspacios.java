package JF.co.uk.demo.business;

import com.cultodeportivo.demo65jakartaee2.daos.EspacioDAO;
import com.cultodeportivo.demo65jakartaee2.models.Espacio;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class GestionEspacios {

    @Inject
    private EspacioDAO espacioDAO;

    public void crearEspacio(Espacio espacio) {
        espacioDAO.crearEspacio(espacio);
    }

    public Espacio actualizarEspacio(Espacio espacio) {
        return espacioDAO.actualizarEspacio(espacio);
    }

    public Espacio buscarPorId(Long id) {
        return espacioDAO.buscarPorId(id);
    }

    public List<Espacio> listarEspacios() {
        return espacioDAO.listarEspacios();
    }

    public void eliminarEspacio(Long id) {
        espacioDAO.eliminarEspacio(id);
    }

    public List<Espacio> buscarEspaciosDisponibles() {
        return espacioDAO.buscarEspaciosDisponibles();
    }

}
