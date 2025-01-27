package JF.co.uk.demo.services.imp;

import JF.co.uk.demo.daos.ContratoDAO;
import JF.co.uk.demo.models.Contrato;
import JF.co.uk.demo.services.ContratoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratoServiceImp implements ContratoService {
    private final ContratoDAO contratoDAO;

    public ContratoServiceImp(ContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO;
    }

    @Override
    public List<Contrato> findAll() {
        return contratoDAO.findAll();
    }

    @Override
    public Optional<Contrato> findById(Long id) {
        return contratoDAO.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        contratoDAO.deleteById(id);
    }

    @Override
    public Contrato save(Contrato contrato) {
        return contratoDAO.save(contrato);
    }
}
