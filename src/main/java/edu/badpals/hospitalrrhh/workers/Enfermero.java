package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;

@Entity
@Table(name = "enfermeros")
@PrimaryKeyJoinColumn(name="dni")
@DiscriminatorValue(value = "NURSE")
public class Enfermero extends Persona{


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "consulta", referencedColumnName = "idConsulta", nullable = false)
    private Consulta consulta = new Consulta();

   @ManyToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "turno", referencedColumnName = "idTurno", nullable = false)
   private Turno turno = new Turno();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medico", referencedColumnName = "dni", nullable = false)
    private Medico medico;


}
