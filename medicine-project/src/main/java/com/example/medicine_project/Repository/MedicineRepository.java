package com.example.medicine_project.Repository;

import com.example.medicine_project.Model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine,Long> {

}
