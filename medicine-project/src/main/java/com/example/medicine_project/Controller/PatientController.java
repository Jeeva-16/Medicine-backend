package com.example.medicine_project.Controller;

import com.example.medicine_project.Model.Doctor;
import com.example.medicine_project.Model.Medicine;
import com.example.medicine_project.Model.Patient;
import com.example.medicine_project.Service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
@Autowired
    private PatientService patientService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/register/{id}")
    public String register(Model model){
        Patient patient = new Patient();
        model.addAttribute(patient);
        return "register";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("patient") Patient patient){
        patientService.savePatient(patient);
        return "redirect:/index";
    }
    @GetMapping("/home")
    private String showDoctors(Model model){
       List<Doctor> doctor = patientService.getAllDoctors();
       model.addAttribute("doctor",doctor);
       return "home";
    }
    @GetMapping("/prescription")
      public String prescription(Model model){
        List<Medicine> medicine = patientService.getAllMedicine();
        model.addAttribute("medicine",medicine);
        return "prescription";
    }
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id, Model model) {
        patientService.deleteMed(id);
        return "redirect:/index";
    }


}
