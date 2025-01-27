package JF.co.uk.demo.services;

import JF.co.uk.demo.models.Espacio;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EspacioService {



    List<Espacio> findEspaciosDisponibles();

    // Optional: Native query version if needed
   List<Espacio> findEspaciosDisponiblesNative();
}
