package JF.co.uk.demo.daos;

import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public class HorarioDAO {


    private EntityManager em;


    public void crearHorario(Horario horario) {
        for (ExcepcionHorario excepcion : horario.getExcepciones()) {
            excepcion.setHorario(horario);
        }
        em.persist(horario);
    }



    public Horario actualizarHorario(Horario horario) {
        return em.merge(horario);
    }

    public Horario buscarPorId(Long id) {
        return em.find(Horario.class, id);
    }

    public List<Horario> listarHorarios() {
        return em.createQuery("SELECT h FROM Horario h", Horario.class).getResultList();
    }


    public void eliminarHorario(Long id) {
        Horario horario = em.find(Horario.class, id);
        if (horario != null) {
            em.remove(horario);
        }
    }
}
