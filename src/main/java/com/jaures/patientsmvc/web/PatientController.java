package com.jaures.patientsmvc.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jaures.patientsmvc.entities.Patient;
import com.jaures.patientsmvc.repositories.PatientRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PatientController {
	
	@SuppressWarnings("unused")
	private PatientRepository patientRepository;
	
	@GetMapping(path = "/index")
    public String patients(Model model, int page , int size) {
		List<Patient> patients=patientRepository.findAll();
		model.addAttribute("listPatients",patients);
		return "patients";
    	
    }
}
