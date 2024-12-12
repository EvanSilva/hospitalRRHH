package edu.badpals.hospitalrrhh.workers;

import javax.persistence.*;

@Entity
@Table(name = "citas")
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCita", nullable = false)
    private int idCita = 0;

    @ManyToOne
    @Column(name = "idConsulta", nullable = false)
    private Consulta idConsulta = new Consulta();

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico idMedico = new Medico();

    @Column(name = "fechaConsulta", nullable = false)
    private String fechaConsulta = "00/00/0000";

    @Column(name = "descripcionConsulta")
    private String descripcionConsulta = "";

    public Citas(int idCita, Consulta idConsulta, Medico idMedico, String fechaConsulta, String descripcionConsulta) {
        this.idCita = idCita;
        this.idConsulta = idConsulta;
        this.idMedico = idMedico;
        this.fechaConsulta = fechaConsulta;
        this.descripcionConsulta = descripcionConsulta;
    }

    public Citas() {
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Consulta getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Consulta idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getDescripcionConsulta() {
        return descripcionConsulta;
    }

    public void setDescripcionConsulta(String descripcionConsulta) {
        this.descripcionConsulta = descripcionConsulta;
    }
}
