package com.mydoctorapp.data.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mydoctorapp.data.bean.Disease;

@Configuration
public interface DiseaseRepository extends JpaRepository<Disease,Integer>{
	
	Disease findByDiseaseName(String diseaseName);

}
