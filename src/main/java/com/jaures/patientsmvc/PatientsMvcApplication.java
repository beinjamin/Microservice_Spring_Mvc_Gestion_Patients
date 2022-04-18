package com.jaures.patientsmvc;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import entities.Patient;
import repositories.PatientRepository;

@SpringBootApplication
public class PatientsMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientsMvcApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository)
	{
		return args -> {
			
			patientRepository.save(
					new Patient(null,"jaures",new Date(),false,12));
			patientRepository.save(
					new Patient(null,"Hugo",new Date(),true,12));
			patientRepository.save(
					new Patient(null,"sebatient",new Date(),true,85));
			patientRepository.findAll().forEach(p->{
				System.out.println(p.getNom());
				
			});
		};
	}
}
