package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Espacio;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class EspacioDAO {



    private EntityManager em;

    public void crearEspacio(Espacio espacio) {
        em.persist(espacio);
    }

    public Espacio actualizarEspacio(Espacio espacio) {
        return em.merge(espacio);
    }

    public Espacio buscarPorId(Long id) {
        return em.find(Espacio.class, id);
    }

    public List<Espacio> listarEspacios() {
        return em.createQuery("SELECT e FROM Espacio e", Espacio.class).getResultList();
    }

    public List<Espacio> buscarEspaciosDisponibles() {
        return em.createQuery("SELECT e FROM Espacio e WHERE e.ocupado = false AND e.reservado = false", Espacio.class)
                .getResultList();
    }


    public void eliminarEspacio(Long id) {
        Espacio espacio = em.find(Espacio.class, id);
        if (espacio != null) {
            em.remove(espacio);
        }
    }
}
