package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "planta")
public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPlanta")
    private int idPlanta = 0;

    @Column(name = "numeroPlanta")
    private int numeroPlanta = 0;

    @OneToMany(mappedBy = "planta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turno> turnos = new ArrayList<>();


}
