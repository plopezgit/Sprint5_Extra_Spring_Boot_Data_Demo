package com.lopez.pedro.payroll.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Branch {
    @Id
    @GeneratedValue
    Integer pk_BranchID;
    String name;
    String country;
    @ManyToOne
    Manager manager;

    private Branch() {

    }

    public Branch(String name, String country, Manager manager) {
        this.name = name;
        this.country = country;
        this.manager = manager;
    }


}
