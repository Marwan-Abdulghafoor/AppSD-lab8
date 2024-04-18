package com.example.springjwt.controller;


import com.example.springjwt.model.Patient;
import com.example.springjwt.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/adsweb/api/v1/patient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/list")
    public ResponseEntity<List<Patient>> getAllPatients(){
        List<Patient> patients = patientService.getAllPatients();
        return ResponseEntity.ok(patients);
    }
}
