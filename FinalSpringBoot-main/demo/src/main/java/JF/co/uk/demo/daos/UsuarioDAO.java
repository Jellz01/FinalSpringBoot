package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

    // Custom query to find a user by email
    Optional<Usuario> findByEmail(String email);

    // Listing all users
    List<Usuario> findAll();

    // Delete user by ID, JpaRepository provides deleteById
    void deleteById(Long id);

    // Update user: Spring Data JPA supports save() for both insert and update
    @Override
    <S extends Usuario> S save(S entity);
}
