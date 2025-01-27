package JF.co.uk.demo.services.imp;

import JF.co.uk.demo.daos.HorarioDao;
import JF.co.uk.demo.models.Horario;
import JF.co.uk.demo.services.HorarioService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class HorarioServiceImp implements HorarioService {

    private final HorarioDao horarioDao;

    public HorarioServiceImp(HorarioDao horarioDao) {
        this.horarioDao = horarioDao;
    }

    @Override
    public List<Horario> findByFechaInicioBetween(LocalDate startDate, LocalDate endDate) {
        return List.of();
    }

    @Override
    public List<Horario> findActiveSchedules() {
        return List.of();
    }

    @Override
    public List<Horario> findOverlappingSchedules(LocalDate fechaInicio, LocalDate fechaFin) {
        return List.of();
    }
}
