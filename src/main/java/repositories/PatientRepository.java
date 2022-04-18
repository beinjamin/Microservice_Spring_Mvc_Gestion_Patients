package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
