package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "turnos")
public class Turno {

    @Id
    @Column(name = "idTurno")
    private int idTurno = 0;

    @OneToMany(mappedBy = "turno", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Enfermero> enfermeros;

    @Column(name = "horario")
    private String horario = "";

    @ManyToOne
    @JoinColumn(name = "idPlanta", nullable = false)
    private Planta planta = new Planta();

    public Turno(int idTurno, List<Enfermero> enfermeros, String horario, Planta planta) {
        this.idTurno = idTurno;
        this.enfermeros = enfermeros;
        this.horario = horario;
        this.planta = planta;
    }

    public Turno() {
    }

    public List<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(List<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
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

}
