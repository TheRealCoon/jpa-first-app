package com.codecool.jpa.medicinejpa.controller;

import com.codecool.jpa.medicinejpa.model.Patient;
import com.codecool.jpa.medicinejpa.repository.PatientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao patientDao;

    @GetMapping("/patients")
    public List<Patient> getPatients(){
        return patientDao.findAll();
    }

    @GetMapping(value = "/patients", params = {"name"})
    public List<Patient> findPatientsByName(@RequestParam("name") String name){
        return patientDao.findAllByNameStartsWith(name);
    }

    @GetMapping(value = "/patients", params = {"date"})
    public List<Patient> findPatientsByBirthDate(@RequestParam("date") String date){
        return patientDao.findAllByBirthDay(date);
    }

    @PostMapping("/patients")
    public void addNewPatient(@RequestBody Patient patient){
        patientDao.save(patient);
    }

}
