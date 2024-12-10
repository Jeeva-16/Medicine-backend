package com.example.medicine_project.Service;

import com.example.medicine_project.Model.Doctor;
import com.example.medicine_project.Model.Medicine;
import com.example.medicine_project.Model.Patient;
import com.example.medicine_project.Repository.DoctorRepository;
import com.example.medicine_project.Repository.MedicineRepository;
import com.example.medicine_project.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private MedicineRepository medicineRepository;
    @Override
    public void savePatient(Patient patient) {
         patientRepository.save(patient);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public List<Medicine> getAllMedicine() {
        return medicineRepository.findAll();
    }

    @Override
    public void deleteMed(Long id) {
         medicineRepository.deleteById(id);
    }
}
