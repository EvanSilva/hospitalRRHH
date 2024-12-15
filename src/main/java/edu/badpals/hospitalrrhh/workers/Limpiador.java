package edu.badpals.hospitalrrhh.workers;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "limpiador")
@PrimaryKeyJoinColumn(name="dni")
@DiscriminatorValue(value = "CLEANER")
public class Limpiador extends Persona {

    @OneToMany(mappedBy = "limpiador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Planta> plantas = new ArrayList<>();

    // Getters y Setters
    public List<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(List<Planta> plantas) {
        this.plantas = plantas;
    }
}