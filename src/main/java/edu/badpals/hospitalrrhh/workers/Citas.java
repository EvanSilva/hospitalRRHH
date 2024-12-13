package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;

@Entity
@Table(name = "citas")
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medico_dni", referencedColumnName = "dni", nullable = false)
    private Medico medico;

    // other fields and methods

    public Citas() {
    }

    public Citas(Medico medico) {
        this.medico = medico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    // other getters and setters
}