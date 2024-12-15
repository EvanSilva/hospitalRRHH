package edu.badpals.hospitalrrhh.workers;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "personas")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="tipo_persona",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="PERSON")
public class Persona {

    @Id
    @Column(name = "dni")
    private String dni = "";

    @Column(name = "social_security_number", nullable = false)
    private int socialSecurityNumber = 0;

    @Column(name = "name", nullable = false)
    private String name = "";

    @Column(name = "phone", nullable = false)
    private String phone = "";

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Turno> turnos = new ArrayList<>();

    @Embedded
    @AttributeOverride(name="via", column=@Column(name="calle"))
    private Address address;


    /*
    public int calcularCargaDeTrabajo() {
        return turnos.size(); // Devuelve la cantidad de turnos asignados
    }
    */

    public Persona() {
    }

    public Persona(String dni, int socialSecurityNumber, String name,  Address address, String phone) {
        this.dni = dni;
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
