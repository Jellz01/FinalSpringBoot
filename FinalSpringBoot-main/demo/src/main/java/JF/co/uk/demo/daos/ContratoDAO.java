package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContratoDAO extends JpaRepository<Contrato, Long> {
}
