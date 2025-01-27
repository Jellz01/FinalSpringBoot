package JF.co.uk.demo.daos;

import com.cultodeportivo.demo65jakartaee2.models.Role;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;


public class RoleDAO {


    private EntityManager em;


    public void crearRole(Role role) {
        em.persist(role);
    }

    public Role encontrarRolePorId(Long id) {
        return em.find(Role.class, id);
    }

    public List<Role> getRoles() {
        return em.createQuery("SELECT r FROM Role r", Role.class).getResultList();
    }

    public Role actualizarRole(Role role) {
        return em.merge(role);
    }

    public void eliminarRole(Long id) {
        Role role = em.find(Role.class, id);
        if (role != null) {
            em.remove(role);
        }
    }
}
