package com.example.medicine_project.Service;

import com.example.medicine_project.Model.Doctor;
import com.example.medicine_project.Model.Medicine;
import com.example.medicine_project.Model.Patient;

import java.util.List;

public interface PatientService {
    void savePatient(Patient patient);
    List<Doctor> getAllDoctors();
    List<Medicine> getAllMedicine();
    void deleteMed(Long id);

}
