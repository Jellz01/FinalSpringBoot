package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HorarioDao extends JpaRepository<Horario, Long> {
}
