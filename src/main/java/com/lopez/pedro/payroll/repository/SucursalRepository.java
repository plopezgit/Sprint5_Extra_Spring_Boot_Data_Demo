package com.lopez.pedro.payroll.repository;

import com.lopez.pedro.payroll.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SucursalRepository extends CrudRepository<Sucursal, Integer> {
}
