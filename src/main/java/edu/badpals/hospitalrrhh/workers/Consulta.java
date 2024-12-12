package edu.badpals.hospitalrrhh.workers;

import javax.persistence.*;

@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idConsulta")
    private int idConsulta;

    @OneToOne(mappedBy = "consultas", cascade = CascadeType.ALL, orphanRemoval = true)
    private Medico medico;

    @OneToOne(mappedBy = "consultas", cascade = CascadeType.ALL, orphanRemoval = true)
    private Enfermero enfermero;


}
