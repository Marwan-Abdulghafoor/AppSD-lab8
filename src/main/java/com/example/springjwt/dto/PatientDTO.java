package com.example.springjwt.dto;

import com.example.springjwt.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class PatientDTO {
    private Integer id;
    private String patientNo;
    private String name;
    private String phone;
    private String email;
    private Address address;

}
