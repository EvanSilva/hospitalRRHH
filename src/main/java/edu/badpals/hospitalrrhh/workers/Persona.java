package edu.badpals.hospitalrrhh.workers;

import org.hibernate.annotations.Entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@Table(name = "personas")
public class Persona {

    @Id
    @Column(name = "DNI", nullable = false)
    private String dni = "";

    @Column(name = "socialSecurityNumber", nullable = false)
    private int socialSecurityNumber = 0;

    @Column(name = "Name", nullable = false)
    private String name = "";

    @Column(name = "Address", nullable = false)
    private String address = "";

    @Column(name = "Phone", nullable = false)
    private String phone = "";

    public Persona() {
    }

    public Persona(String dni, int socialSecurityNumber, String name, String address, String phone) {
        this.dni = dni;
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
