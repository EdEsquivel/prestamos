package com.ps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Genera SET and Get
@NoArgsConstructor // Genera un constructor sin args
@AllArgsConstructor // Genera un constructor con all args
@Entity // Especifica que esta clase representa un model de la BD "Entidad"
@Table(name = "Clientes") // Especifica el nombre de la tabla en la BD que está representada en esta Entidad de Java
public class Cliente {

    @Id // Especifica que este campo es el ID
    @Column(name = "client_id") // Especifica el nombre de La Columna en la BD que será el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera solo el ID con autoincrement
    private Long clientId;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
}
