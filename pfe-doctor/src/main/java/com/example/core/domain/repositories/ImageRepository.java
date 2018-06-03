package com.example.core.domain.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.core.domain.entities.Images;

@Repository
@RepositoryRestResource
public interface ImageRepository extends JpaRepository<Images, Serializable>  {

}
