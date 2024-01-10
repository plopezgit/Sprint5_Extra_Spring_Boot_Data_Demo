package com.lopez.pedro.payroll.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Sucursal {
    @Id
    @GeneratedValue
    Integer pk_SucursalID;
    String name;
    String country;

    private Sucursal() {

    }

    public Sucursal(String name, String country) {
        this.name = name;
        this.country = country;
    }


}
