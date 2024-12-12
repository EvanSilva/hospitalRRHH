package edu.badpals.hospitalrrhh.workers;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "medicos")
public class Medico extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idMedico", nullable = false)
    private int idMedico;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "consulta", referencedColumnName = "idConsulta", nullable = false)
    private Consulta consulta;


    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Citas> historicoConsultas;

    public Medico() {
    }

    public Medico(String dni, int socialSecurityNumber, String name, String address, String phone, int idMedico, Consulta consulta, List<Citas> historicoConsultas) {
        super(dni, socialSecurityNumber, name, address, phone);
        this.idMedico = idMedico;
        this.consulta = consulta;
        this.historicoConsultas = historicoConsultas;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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
