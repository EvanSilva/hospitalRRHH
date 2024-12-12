package edu.badpals.hospitalrrhh.workers;

import javax.persistence.*;
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

    @Column(name = "planta")
    private int planta = 0;

    public Turno(int idTurno, String horario, int planta) {
        this.idTurno = idTurno;
        this.horario = horario;
        this.planta = planta;
    }

    public Turno() {
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

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
}
