package JF.co.uk.demo.services;

import JF.co.uk.demo.models.Contrato;

import java.util.List;
import java.util.Optional;

public interface ContratoService {


    // JpaRepository provides findAll() for listing all contratos
    List<Contrato> findAll();

    // JpaRepository provides findById() for searching by id
    Optional<Contrato> findById(Long id);

    // JpaRepository provides deleteById() for deleting by id
    void deleteById(Long id);

    // JpaRepository's save() method supports both creating and updating a contrato

    Contrato save( Contrato contrato);
}
