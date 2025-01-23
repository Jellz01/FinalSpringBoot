package JF.co.uk.demo.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "tarifas")
public class Tarifa implements Serializable {

    private static final long serialVersionUID = 1L;

    public Tarifa() {}

    public Tarifa(Long id, BigDecimal valor) {
        this.id = id;
        this.valor = valor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tarifa{" +
                "id=" + id +
                ", valor=" + valor +
                '}';
    }
}
