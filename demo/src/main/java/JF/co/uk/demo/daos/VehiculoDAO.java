package JF.co.uk.demo.daos;


import JF.co.uk.demo.models.Vehiculo;
import jakarta.persistence.EntityManager;

import java.util.List;





public class VehiculoDAO {

    private EntityManager em;


    public void crearVehiculo(Vehiculo vehiculo) {
        em.persist(vehiculo);
    }

    public Vehiculo buscarPorId(Long id) {
        return em.find(Vehiculo.class, id);
    }

    public List<Vehiculo> listarVehiculos() {
        return em.createQuery("SELECT v FROM Vehiculo v", Vehiculo.class).getResultList();
    }


    public Vehiculo actualizarVehiculo(Vehiculo vehiculo) {
        return em.merge(vehiculo);
    }


    public void eliminarVehiculo(Long id) {
        Vehiculo vehiculo = em.find(Vehiculo.class, id);
        if (vehiculo != null) {
            em.remove(vehiculo);
        }
    }
}
