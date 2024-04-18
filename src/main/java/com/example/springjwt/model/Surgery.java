package com.example.springjwt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Surgery {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String surgeryNo;
    @OneToMany(mappedBy = "surgery")
    @JsonManagedReference
    private List<Appointment> appointments;
    @OneToOne
    private Address address;
}
