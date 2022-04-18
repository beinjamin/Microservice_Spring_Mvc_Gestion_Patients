package com.jaures.patientsmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jaures.patientsmvc.repositories.PatientRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PatientController {
	
	@SuppressWarnings("unused")
	private PatientRepository patientRepository;
	
	@GetMapping(path = "/index")
    public String patients() {
		return "patients";
    	
    }
}
