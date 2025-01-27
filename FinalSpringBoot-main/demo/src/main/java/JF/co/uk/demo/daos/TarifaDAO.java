package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TarifaDAO extends JpaRepository<Tarifa, Long> {

    // List all tarifas, JpaRepository provides findAll method
    List<Tarifa> findAll();

    // Find tarifa by ID, JpaRepository provides findById method
    Optional<Tarifa> findById(Long id);

    // Delete tarifa by ID, JpaRepository provides deleteById method
    void deleteById(Long id);

    // Update tarifa: JpaRepository's save method supports both insert and update
    @Override
    <S extends Tarifa> S save(S entity);

    // Custom query to list tarifas with a specific attribute (Example)
    @Query("SELECT t FROM Tarifa t WHERE t.attribute = :value")
    List<Tarifa> findTarifasByAttribute(@Param("value") String value);

    // Example of native SQL query for tarifas
    @Query(value = "SELECT * FROM tarifa t WHERE t.attribute = :value", nativeQuery = true)
    List<Tarifa> findTarifasByAttributeNative(@Param("value") String value);
}
