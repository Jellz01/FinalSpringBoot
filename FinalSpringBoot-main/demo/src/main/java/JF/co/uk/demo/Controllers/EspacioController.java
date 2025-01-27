package JF.co.uk.demo.Controllers;


import JF.co.uk.demo.models.Espacio;
import JF.co.uk.demo.services.EspacioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/espacios")
public class EspacioController {

    private final EspacioService espacioService;
    public EspacioController(EspacioService espacioService) {
        this.espacioService = espacioService;

    }


}
