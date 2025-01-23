package JF.co.uk.demo.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "horarios")
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apertura", nullable = false)
    private LocalTime apertura;

    @Column(name = "cierre", nullable = false)
    private LocalTime cierre;

    @Column(name = "tipo", nullable = false, length = 20)
    private String tipo;

    @OneToMany(mappedBy = "horario", cascade = CascadeType.ALL)
    private List<ExcepcionHorario> excepciones = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getApertura() {
        return apertura;
    }

    public void setApertura(LocalTime apertura) {
        this.apertura = apertura;
    }

    public LocalTime getCierre() {
        return cierre;
    }

    public void setCierre(LocalTime cierre) {
        this.cierre = cierre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<ExcepcionHorario> getExcepciones() {
        return excepciones;
    }

    public void setExcepciones(List<ExcepcionHorario> excepciones) {
        this.excepciones = excepciones;
        for (ExcepcionHorario excepcion : excepciones) {
            excepcion.setHorario(this); // Vincular la relación inversa
        }
    }

    public void addExcepcion(ExcepcionHorario excepcion) {
        excepciones.add(excepcion);
        excepcion.setHorario(this); // Vincular la relación inversa
    }

    public void removeExcepcion(ExcepcionHorario excepcion) {
        excepciones.remove(excepcion);
        excepcion.setHorario(null); // Romper la relación inversa
    }

    @Override
    public String toString() {
        return "Horario{" +
                "id=" + id +
                ", apertura=" + apertura +
                ", cierre=" + cierre +
                ", tipo='" + tipo + '\'' +
                ", excepciones=" + excepciones +
                '}';
    }
}
