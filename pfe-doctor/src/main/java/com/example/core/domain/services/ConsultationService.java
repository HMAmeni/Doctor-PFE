package com.example.core.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.core.domain.entities.Consultation;
import com.example.core.domain.repositories.ConsultationRepository;

@Service
public class ConsultationService {
	
	@Autowired
	ConsultationRepository consultationRepository;
	
	public void saveConsultatoin(Consultation consultation) {
		consultationRepository.save(consultation);
	}

}
