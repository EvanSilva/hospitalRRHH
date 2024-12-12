package edu.badpals.hospitalrrhh.workers;

import javax.persistence.*;

@Entity
@Table(name = "enfermero")
public class Enfermero extends Persona{

    @Id
    @Column(name = "enfermero")
    private int idEnfermero;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "consulta", referencedColumnName = "idConsulta", nullable = false)
    private Consulta consulta = new Consulta();

   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "turno", referencedColumnName = "idTurno", nullable = false)
    private Turno turno = new Turno();


}
