package com.mydoctorapp.data.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mydoctorapp.data.bean.Disease;
import com.mydoctorapp.data.repository.DiseaseRepository;

@RestController
public class DiseaseRestController {
	
	
	@Autowired
	DiseaseRepository diseaseRepo;
	
	
	@GetMapping("/list-diseases")
	public List<Disease> getAllDiseases(){
		return diseaseRepo.findAll();
	}
	
	@GetMapping("/query-disease")
	public Disease getDisease() {
		return null;
	}
	
	@GetMapping("/list-disease/{id}")
	public Optional<Disease> getDiseaseById(@PathVariable("id") Integer id) {
		return diseaseRepo.findById(id);
	}

}
