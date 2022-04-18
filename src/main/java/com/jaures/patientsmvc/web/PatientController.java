package com.jaures.patientsmvc.web;

import com.jaures.patientsmvc.repositories.PatientRepository;

public class PatientController {
	
	private PatientRepository patientRepository;
	
	public PatientController(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

}
