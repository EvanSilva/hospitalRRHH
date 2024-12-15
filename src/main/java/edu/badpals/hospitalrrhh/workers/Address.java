package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class Address {
    private String via;
    private String codigoPostal;

}
