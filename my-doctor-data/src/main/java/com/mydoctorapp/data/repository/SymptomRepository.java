package com.mydoctorapp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydoctorapp.data.bean.Medicine;
import com.mydoctorapp.data.bean.Symptom;

public interface SymptomRepository extends JpaRepository<Symptom,Long>{

}
