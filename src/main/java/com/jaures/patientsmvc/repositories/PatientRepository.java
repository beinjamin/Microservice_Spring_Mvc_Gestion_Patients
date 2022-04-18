package com.jaures.patientsmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaures.patientsmvc.entities.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long>{

}