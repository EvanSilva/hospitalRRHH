package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="dni")
@DiscriminatorValue(value="DOCTOR")
@Table(name = "medicos")
public class Medico extends Persona {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "consulta", referencedColumnName = "idConsulta", nullable = false)
    private Consulta consulta;

    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Citas> historicoConsultas;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "medico_dni", referencedColumnName = "dni", nullable = false)
    private List<Enfermero> enfermero;

    public Medico() {
    }

    public Medico(String dni, int socialSecurityNumber, String name, Address address, String phone, Consulta consulta, List<Citas> historicoConsultas) {
        super(dni, socialSecurityNumber, name, address, phone);
        this.consulta = consulta;
        this.historicoConsultas = historicoConsultas;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public List<Citas> getHistoricoConsultas() {
        return historicoConsultas;
    }

    public void setHistoricoConsultas(List<Citas> historicoConsultas) {
        this.historicoConsultas = historicoConsultas;
    }
}