package com.example.medicine_project.Repository;

import com.example.medicine_project.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
