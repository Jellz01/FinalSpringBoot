package JF.co.uk.demo.Controllers;


import JF.co.uk.demo.models.Horario;
import JF.co.uk.demo.services.HorarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/horarios")
public class HorarioController {

    private final HorarioService horarioService;
    public HorarioController(HorarioService horarioService) {
        this.horarioService = horarioService;
    }
    @PostMapping
        public List<Horario> list() {

    }
}
