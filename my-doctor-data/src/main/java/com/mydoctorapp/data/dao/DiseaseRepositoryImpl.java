package com.mydoctorapp.data.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.mydoctorapp.data.bean.Disease;
import com.mydoctorapp.data.repository.DiseaseRepository;

public class DiseaseRepositoryImpl{
	
	@Autowired
	DiseaseRepository diseaserepo;
	
	
	public Disease findDiseaseName() {
		return diseaserepo.findByDiseaseName("");
	}

}
