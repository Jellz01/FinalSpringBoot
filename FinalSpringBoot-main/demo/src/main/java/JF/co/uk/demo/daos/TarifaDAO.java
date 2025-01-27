package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Tarifa;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public class TarifaDAO {


    private EntityManager em;


    public void crearTarifa(Tarifa tarifa) {
        em.persist(tarifa);
    }


    public Tarifa actualizarTarifa(Tarifa tarifa) {
        return em.merge(tarifa);
    }

    public Tarifa buscarPorId(Long id) {
        return em.find(Tarifa.class, id);
    }

    public List<Tarifa> listarTarifas() {
        return em.createQuery("SELECT t FROM Tarifa t", Tarifa.class).getResultList();
    }


    public void eliminarTarifa(Long id) {
        Tarifa tarifa = em.find(Tarifa.class, id);
        if (tarifa != null) {
            em.remove(tarifa);
        }
    }
}
