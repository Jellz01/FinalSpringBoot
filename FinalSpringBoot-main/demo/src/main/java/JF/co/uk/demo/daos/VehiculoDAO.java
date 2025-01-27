package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehiculoDAO extends JpaRepository<Vehiculo, Long> {

    // Custom query to find a vehicle by its ID (JpaRepository provides findById method)
    Optional<Vehiculo> findById(Long id);

    // List all vehicles, JpaRepository provides findAll method
    List<Vehiculo> findAll();

    // Delete vehicle by ID, JpaRepository provides deleteById method
    void deleteById(Long id);

    // Update vehicle: JpaRepository's save method supports both insert and update
    @Override
    <S extends Vehiculo> S save(S entity);
}
