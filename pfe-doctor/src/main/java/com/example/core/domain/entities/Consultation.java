package com.example.core.domain.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Consultation {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int idConsultation;
	private int numConsultation;
	private int numFolder;
	
	private String firstName;
	private String lastName;
	private String oeil;
	
	@Temporal(TemporalType.DATE)
	private Date date;

	public int getIdConsultation() {
		return idConsultation;
	}

	public void setIdConsultation(int idConsultation) {
		this.idConsultation = idConsultation;
	}

	public int getNumConsultation() {
		return numConsultation;
	}

	public void setNumConsultation(int numConsultation) {
		this.numConsultation = numConsultation;
	}

	public int getNumFolder() {
		return numFolder;
	}

	public void setNumFolder(int numFolder) {
		this.numFolder = numFolder;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOeil() {
		return oeil;
	}

	public void setOeil(String oeil) {
		this.oeil = oeil;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
