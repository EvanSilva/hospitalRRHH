package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "limpiador")
@PrimaryKeyJoinColumn(name="dni")
@DiscriminatorValue(value = "CLEANER")
public class Limpiador extends Persona {

    @OneToMany
    @JoinColumn(name = "idPlanta", nullable = false)
    private List<Planta> plantas = new ArrayList<>();


}
