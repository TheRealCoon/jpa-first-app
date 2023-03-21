package com.codecool.jpa.medicinejpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Doctor {
    @Id
    private Long id;
    private String Name;
    @OneToMany(mappedBy = "doctor")
    private List<Patient> patients;
}
