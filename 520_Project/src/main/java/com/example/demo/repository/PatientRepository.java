package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
	List<Patient> findByCondition(String condition);

	List<Patient> findByDoctor(Doctor doctor);

	
}
