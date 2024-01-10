package com.lopez.pedro.payroll.repository;

import com.lopez.pedro.payroll.entity.Manager;
import com.lopez.pedro.payroll.entity.Sucursal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ManagerRepository extends CrudRepository<Manager, Integer> {

    List<Manager> findBySucursalCountryContains (@Param("q")String country);

}
