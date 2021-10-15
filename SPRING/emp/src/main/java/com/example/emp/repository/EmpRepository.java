package com.example.emp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.emp.model.EmpDto;

//@Repository
@RepositoryRestResource(collectionResourceRel = "empdto" ,path = "empdto" )
public interface EmpRepository extends PagingAndSortingRepository<EmpDto, Long> {

}
