package com.example.core.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.core.domain.entities.Doctor;
import com.example.core.domain.repositories.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository doctorRepository;  
	
	public void saveDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
	}

}
