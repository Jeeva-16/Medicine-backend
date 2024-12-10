package com.example.medicine_project;

import com.example.medicine_project.Model.Patient;
import com.example.medicine_project.Repository.PatientRepository;
import com.example.medicine_project.Service.PatientService;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.given;

@ExtendWith(MockitoExtension.class)

public class PatientServiceTest {
    @Mock
    private PatientRepository patientRepository;
    @InjectMocks
    private PatientService patientService;
    @Test
    void testSavePatient_Success(){
        Patient patient1 = new Patient();
        patient1.setPatientName("Zack");
        patient1.setAge(24L);
        patient1.setEmail("zack@gmail.com");
       given(patientRepository.save(patient1).willReturn(patient1));

       Patient savedPatient = patientService.savePatient(patient1);

       assertThat(savedPatient).isNotNull();
    }





}
