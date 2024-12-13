package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idConsulta")
    private int idConsulta;

    @OneToOne(mappedBy = "consulta", cascade = CascadeType.ALL, orphanRemoval = true)
    private Medico medico;

    @OneToOne(mappedBy = "consulta", cascade = CascadeType.ALL, orphanRemoval = true)
    private Enfermero enfermero;

    @OneToOne
    @JoinColumn(name = "idPlanta", nullable = false)
    private Planta planta = new Planta();



}
