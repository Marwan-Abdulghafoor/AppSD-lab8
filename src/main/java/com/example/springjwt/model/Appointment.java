package com.example.springjwt.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime time;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "dentist_id")
    private Dentist dentist;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "surgery_id")
    private Surgery surgery;
}
