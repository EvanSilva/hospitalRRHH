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
    private int idPlanta;

    @Column(name = "numeroPlanta")
    private int numeroPlanta;

    @OneToMany(mappedBy = "planta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turno> turnos = new ArrayList<>();

    @ManyToOne // Relación con Limpiador
    @JoinColumn(name = "dniLimpiador", nullable = false) // Clave foránea
    private Limpiador limpiador;

    // Getters y Setters
    public int getIdPlanta() {
        return idPlanta;
    }

    public void setIdPlanta(int idPlanta) {
        this.idPlanta = idPlanta;
    }

    public int getNumeroPlanta() {
        return numeroPlanta;
    }

    public void setNumeroPlanta(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public Limpiador getLimpiador() {
        return limpiador;
    }

    public void setLimpiador(Limpiador limpiador) {
        this.limpiador = limpiador;
    }
}