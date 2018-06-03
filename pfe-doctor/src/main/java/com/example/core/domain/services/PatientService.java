package com.example.core.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.core.domain.entities.Patient;
import com.example.core.domain.repositories.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	private void savePatient(Patient patient) {
		patientRepository.save(patient);
	}
}
