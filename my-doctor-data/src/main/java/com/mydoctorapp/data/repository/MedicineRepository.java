package com.mydoctorapp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydoctorapp.data.bean.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine,Integer>{

}
