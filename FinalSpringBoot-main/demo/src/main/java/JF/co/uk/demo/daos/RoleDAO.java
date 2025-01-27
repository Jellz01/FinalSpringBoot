package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {

    // JpaRepository provides findAll() for listing all roles
    List<Role> findAll();

    // JpaRepository provides findById() for searching by id
    Optional<Role> findById(Long id);

    // JpaRepository provides deleteById() for deleting by id
    void deleteById(Long id);

    // JpaRepository's save() method supports both creating and updating a role
    @Override
    <S extends Role> S save(S entity);

    // You can define other custom queries if necessary using @Query annotation
    // @Query("SELECT r FROM Role r WHERE r.someField = :someValue")
    // List<Role> findBySomeCriteria(@Param("someValue") String someValue);
}
