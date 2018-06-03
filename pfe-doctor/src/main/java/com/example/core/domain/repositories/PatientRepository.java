package com.example.core.domain.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.core.domain.entities.Patient;

@Repository
@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient, Serializable>  {

}
