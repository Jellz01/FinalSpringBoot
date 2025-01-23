package JF.co.uk.demo.services;

import com.cultodeportivo.demo65jakartaee2.daos.RoleDAO;
import com.cultodeportivo.demo65jakartaee2.models.Role;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;

@ApplicationScoped
public class RoleService {

    @Inject
    private RoleDAO roleDAO;

    public void crearRole(Role role) {
        if (role.getNombre() == null || role.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre del rol no puede estar vacío.");
        }
        roleDAO.crearRole(role);
    }

    public Role encontrarRolePorId(Long id) {
        Role role = roleDAO.encontrarRolePorId(id);
        if (role == null) {
            throw new IllegalArgumentException("No se encontró el rol con ID: " + id);
        }
        return role;
    }

    public List<Role> obtenerTodosRoles() {
        return roleDAO.getRoles();
    }

    public Role actualizarRole(Role role) {
        if (role.getId() == null) {
            throw new IllegalArgumentException("El ID del rol no puede ser nulo para actualizar.");
        }
        return roleDAO.actualizarRole(role);
    }

    public void eliminarRole(Long id) {
        Role role = roleDAO.encontrarRolePorId(id);
        if (role == null) {
            throw new IllegalArgumentException("No se puede eliminar un rol inexistente con ID: " + id);
        }
        roleDAO.eliminarRole(id);
    }
}
