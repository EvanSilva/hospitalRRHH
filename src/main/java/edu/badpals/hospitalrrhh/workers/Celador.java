package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "celadores")
@PrimaryKeyJoinColumn(name="dni")
@DiscriminatorValue(value = "ATTENDANT")
public class Celador extends Persona {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "turno", referencedColumnName = "idTurno", nullable = false)
    private Turno turno = new Turno();


}