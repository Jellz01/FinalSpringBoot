package JF.co.uk.demo.services;

import JF.co.uk.demo.models.Horario;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface HorarioService {
    List<Horario> findByFechaInicioBetween(LocalDate startDate, LocalDate endDate);
    List<Horario> findActiveSchedules();
    List<Horario> findOverlappingSchedules(LocalDate fechaInicio, LocalDate fechaFin);

}
