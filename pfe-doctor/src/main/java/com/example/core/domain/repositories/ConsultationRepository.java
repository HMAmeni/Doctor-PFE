package com.example.core.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.core.domain.entities.Consultation;

import java.io.Serializable;

@Repository
@RepositoryRestResource
public interface ConsultationRepository extends JpaRepository<Consultation, Serializable>  {
	

}
