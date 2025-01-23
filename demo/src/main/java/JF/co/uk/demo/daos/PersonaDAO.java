package JF.co.uk.demo.daos;
import JF.co.uk.demo.models.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class PersonaDAO {

    private EntityManager em;


    public void crearPersona(Persona persona) {
        em.persist(persona);
    }


    public Persona actualizarPersona(Persona persona) {
        return em.merge(persona);
    }

    public Persona buscarPorId(Long id) {
        return em.find(Persona.class, id);
    }

    public Persona buscarPorCedula(String cedula) {
        return em.createQuery("SELECT p FROM Persona p WHERE p.cedula = :cedula", Persona.class)
                .setParameter("cedula", cedula)
                .getSingleResult();
    }

    public List<Persona> listarPersonas() {
        return em.createQuery("SELECT p FROM Persona p", Persona.class).getResultList();
    }


    public void eliminarPersona(Long id) {
        Persona persona = em.find(Persona.class, id);
        if (persona != null) {
            em.remove(persona);
        }
    }
}
