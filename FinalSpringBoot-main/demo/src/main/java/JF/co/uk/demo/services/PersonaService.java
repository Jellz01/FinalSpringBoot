package JF.co.uk.demo.services;

import JF.co.uk.demo.models.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {


    // JpaRepository provides findAll() for listing all personas
    List<Persona> findAll();

    // JpaRepository provides findById() for searching by id
    Optional<Persona> findById(Long id);

    // JpaRepository provides deleteById() for deleting by id
    void deleteById(Long id);

    // JpaRepository's save() method supports both creating and updating a persona
    Persona save(Persona persona);

    // Custom query for finding persona by cedula
    Persona findByCedula(String cedula);

    // You can define other custom queries if necessary using @Query annotation
    // @Query("SELECT p FROM Persona p WHERE p.someField = :someValue")
    // List<Persona> findBySomeCriteria(@Param("someValue") String someValue);
}
