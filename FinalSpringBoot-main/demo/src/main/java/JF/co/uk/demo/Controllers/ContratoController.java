package JF.co.uk.demo.Controllers;


import JF.co.uk.demo.models.Contrato;
import JF.co.uk.demo.services.ContratoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    private final ContratoService contratoService;

    public ContratoController(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    @GetMapping
    public List<Contrato> getContratos() {
        return contratoService.findAll();
    }
    @PostMapping
    public Contrato createContrato(@RequestBody Contrato contrato) {
        return contratoService.save(contrato);
    }

    @DeleteMapping ("/{id}")
    public void deleteContrato(@PathVariable Long id) {
        contratoService.deleteById(id);

    }
}
