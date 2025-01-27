package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Contrato;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class ContratoDAO {


    private EntityManager em;

    public void crearContrato(Contrato contrato) {
        em.persist(contrato);
    }

    public Contrato actualizarContrato(Contrato contrato) {
        return em.merge(contrato);
    }

    public Contrato buscarPorId(Long id) {
        return em.find(Contrato.class, id);
    }

    public List<Contrato> listarContratos() {
        return em.createQuery("SELECT c FROM Contrato c", Contrato.class).getResultList();
    }


    public void eliminarContrato(Long id) {
        Contrato contrato = em.find(Contrato.class, id);
        if (contrato != null) {
            em.remove(contrato);
        }
    }
}
