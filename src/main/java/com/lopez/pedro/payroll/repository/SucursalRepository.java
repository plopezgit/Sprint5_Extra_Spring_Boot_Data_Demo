package com.lopez.pedro.payroll.repository;

import com.lopez.pedro.payroll.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface SucursalRepository extends CrudRepository<Sucursal, Integer> {

    List<Sucursal> findByName (@Param("q")String name);

}
