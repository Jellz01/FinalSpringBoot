package JF.co.uk.demo.services.imp;


import JF.co.uk.demo.daos.EspacioDao;
import JF.co.uk.demo.models.Espacio;
import JF.co.uk.demo.services.EspacioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspacioServiceImp implements EspacioService {
    private final EspacioDao espacioDao;

    public EspacioServiceImp(EspacioDao espacioDao) {
        this.espacioDao = espacioDao;
    }


    @Override
    public List<Espacio> findEspaciosDisponibles() {
        return List.of();
    }

    @Override
    public List<Espacio> findEspaciosDisponiblesNative() {
        return List.of();
    }
}
