package com.example.core.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.core.domain.entities.Images;
import com.example.core.domain.repositories.ImageRepository;

@Service
public class ImageService {
	
	@Autowired
	ImageRepository imageRepository;
	
	public void saveImage(Images image) {
		imageRepository.save(image);
	}
}
