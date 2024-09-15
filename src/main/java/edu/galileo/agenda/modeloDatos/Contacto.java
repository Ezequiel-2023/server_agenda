package edu.galileo.agenda.modeloDatos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "contacto")
@Data

public class Contacto {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String telefono;
}
