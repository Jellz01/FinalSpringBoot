package JF.co.uk.demo.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;

    public Ticket() {}

    public Ticket(Long id, EspacioOcupado espacioOcupado, LocalDateTime fechaEmision, LocalDateTime fechaPago, Boolean pagado) {
        this.id = id;
        this.espacioOcupado = espacioOcupado;
        this.fechaEmision = fechaEmision;
        this.fechaPago = fechaPago;
        this.pagado = pagado;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación OneToOne con EspacioOcupado
    @OneToOne
    @JoinColumn(name = "espacio_ocupado_id", nullable = false, unique = true)
    private EspacioOcupado espacioOcupado;

    @Column(name = "fecha_emision", nullable = false)
    private LocalDateTime fechaEmision;

    @Column(name = "fecha_pago")
    private LocalDateTime fechaPago;

    @Column(name = "pagado", nullable = false)
    private Boolean pagado = false;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EspacioOcupado getEspacioOcupado() {
        return espacioOcupado;
    }

    public void setEspacioOcupado(EspacioOcupado espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }


}
