package JF.co.uk.demo.business;

import com.cultodeportivo.demo65jakartaee2.daos.UsuarioDAO;
import com.cultodeportivo.demo65jakartaee2.models.Usuario;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GestionUsuarios {

    @Inject
    private UsuarioDAO usuarioDAO;

    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioDAO.buscarPorId(id);
    }

    public void crearUsuario(Usuario usuario) {
        usuarioDAO.crearUsuario(usuario);
    }
}
