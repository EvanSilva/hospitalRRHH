package edu.badpals.hospitalrrhh.workers;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico extends Persona {


    private int consulta = 0;

    private String historico = "";

    private String descripcion = "";

    private String fecha = "00/00/0000";




}
