package com.mydoctorapp.data.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Disease {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Disease_ID")
	private Integer id;

	private String diseaseName;
	private String symptom;
	private String diseaseDescription;
	private Long durationOfDisease;
	
	
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	public String getDiseaseDescription() {
		return diseaseDescription;
	}
	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}
	public Long getDurationOfDisease() {
		return durationOfDisease;
	}
	public void setDurationOfDisease(Long durationOfDisease) {
		this.durationOfDisease = durationOfDisease;
	}
	public long getId() {
		return id;
	}
	public Disease(String diseaseName, String symptom, String diseaseDescription, Long durationOfDisease) {
		super();
		this.diseaseName = diseaseName;
		this.symptom = symptom;
		this.diseaseDescription = diseaseDescription;
		this.durationOfDisease = durationOfDisease;
	}
	
	
	
	

	

}
