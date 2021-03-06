package com.mydoctorapp.data.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
public class Symptom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Symptom_ID")
	private int id;
	
	private String symptomName;
	private String symptomDescription;
	private Long durationOfSymptom;
	
	public String getSymptomName() {
		return symptomName;
	}
	public void setSymptomName(String symptomName) {
		this.symptomName = symptomName;
	}
	public String getSymptomDescription() {
		return symptomDescription;
	}
	public void setSymptomDescription(String symptomDescription) {
		this.symptomDescription = symptomDescription;
	}
	public Long getDurationOfSympton() {
		return durationOfSymptom;
	}
	public void setDurationOfSympton(Long durationOfSympton) {
		this.durationOfSymptom = durationOfSymptom;
	}
	public int getId() {
		return id;
	}
	
	public Symptom(String symptomName, String symptomDescription, Long durationOfSympton) {
		super();
		this.symptomName = symptomName;
		this.symptomDescription = symptomDescription;
		this.durationOfSymptom = durationOfSymptom;
	}
	
	
	

}
