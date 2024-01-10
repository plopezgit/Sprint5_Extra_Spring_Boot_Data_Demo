package com.lopez.pedro.payroll.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Manager {
    @Id
    @GeneratedValue
    Integer pk_ManagerID;
    String name;
    @OneToMany(mappedBy = "manager")
    List<Branch> branches;

    private Manager() {
    }

    public Manager(String name) {
        this.name = name;
    }
}
