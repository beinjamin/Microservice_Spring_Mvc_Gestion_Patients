package com.jaures.patientsmvc.web;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jaures.patientsmvc.entities.Patient;
import com.jaures.patientsmvc.repositories.PatientRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class PatientController {
	
	@SuppressWarnings("unused")
	private PatientRepository patientRepository;
	
	@GetMapping(path = "/index")
    public String patients(Model model, 
    		@RequestParam(name = "page",defaultValue = "0" )int page ,
    		@RequestParam(name = "size",defaultValue = "0" )int size) {
		Page<Patient> patients=patientRepository.findAll(PageRequest.of(page, size));
		model.addAttribute("listPatients",patients.getContent());
		return "patients";
    	
    }
}
