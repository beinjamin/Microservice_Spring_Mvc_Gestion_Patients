package com.jaures.patientsmvc.web;

import org.springframework.stereotype.Controller;

import com.jaures.patientsmvc.repositories.PatientRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PatientController {
	
	private PatientRepository patientRepository;
	
	

}
