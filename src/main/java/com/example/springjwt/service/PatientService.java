package com.example.springjwt.service;

import com.example.springjwt.model.Patient;
import com.example.springjwt.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRepository repository;

    public List<Patient> getAllPatients() {
        List<Patient> patients = repository.findAll();
        return patients;
    }
}
