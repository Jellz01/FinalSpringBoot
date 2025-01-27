package JF.co.uk.demo.services.imp;

import JF.co.uk.demo.daos.PersonaDAO;
import JF.co.uk.demo.models.Persona;
import JF.co.uk.demo.services.PersonaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonaServiceImp implements PersonaService {

    private final PersonaDAO personaDAO;

    public PersonaServiceImp(PersonaDAO personaDAO) {
        this.personaDAO = personaDAO;
    }


    @Override
    public List<Persona> findAll() {
        return List.of();
    }

    @Override
    public Optional<Persona> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Persona save(Persona persona) {
        return null;
    }

    @Override
    public Persona findByCedula(String cedula) {
        return null;
    }
}
