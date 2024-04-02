package com.ps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data // Genera SET and Get
@NoArgsConstructor // Genera un constructor sin args
@AllArgsConstructor // Genera un constructor con all args
@Entity // Especifica que esta clase representa un model de la BD "Entidad"
@Table(name = "Prestamos") // Especifica el nombre de la tabla en la BD que está representada en esta Entidad de Java
public class Prestamo {

    @Id // Especifica que este campo es el ID
    @Column(name = "loan_id") // Especifica el nombre de La Columna en la BD que será el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera solo el ID con autoincrement
    private Long loanId;

    @ManyToOne
    @JoinColumn(name= "cliente_id", referencedColumnName = "client_id", nullable = false)
    private Cliente cliente;

    private BigDecimal monto;
    private BigDecimal tasaInteres;
    private Integer plazo;
    private LocalDate fechaInicio;
    private String estado;
}
