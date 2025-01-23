package JF.co.uk.demo.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "espacios")
public class Espacio implements Serializable {

    private static final long serialVersionUID = 1L;

    public Espacio() {}

    public Espacio(Long id, Boolean ocupado, Boolean reservado) {
        this.id = id;
        this.ocupado = ocupado;
        this.reservado = reservado;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ocupado", nullable = false)
    private Boolean ocupado = false;

    @Column(name = "reservado", nullable = false)
    private Boolean reservado = false;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Boolean getReservado() {
        return reservado;
    }

    public void setReservado(Boolean reservado) {
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        return "Espacio{" +
                "id=" + id +
                ", ocupado=" + ocupado +
                ", reservado=" + reservado +
                '}';
    }
}
