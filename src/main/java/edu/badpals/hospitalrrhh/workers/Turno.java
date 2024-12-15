package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idTurno")
    private int idTurno;

    @Column(name = "horario")
    private String horario;

    @ManyToOne
    @JoinColumn(name = "idPlanta", nullable = false)
    private Planta planta;

    @ManyToOne
    @JoinColumn(name = "persona_id") // Asegúrate de que el nombre de la columna sea correcto
    private Persona persona;

    // Constructor, Getters y Setters
    public Turno() {
    }

    public Turno(String horario, Planta planta) {
        this.horario = horario;
        this.planta = planta;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

}