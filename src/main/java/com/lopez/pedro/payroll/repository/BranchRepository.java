package com.lopez.pedro.payroll.repository;

import com.lopez.pedro.payroll.entity.Branch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BranchRepository extends CrudRepository<Branch, Integer> {

    List<Branch> findByName (@Param("q")String name);
    List<Branch> findByCountry (@Param("q")String country);

}
