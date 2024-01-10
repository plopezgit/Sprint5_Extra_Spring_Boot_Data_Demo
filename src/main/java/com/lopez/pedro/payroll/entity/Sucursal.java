package com.lopez.pedro.payroll.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Sucursal {
    @Id
    @GeneratedValue
    Integer pk_SucursalID;
    String name;
    String country;
    @ManyToOne
    Manager manager;

    private Sucursal() {

    }

    public Sucursal(String name, String country, Manager manager) {
        this.name = name;
        this.country = country;
        this.manager = manager;
    }


}
