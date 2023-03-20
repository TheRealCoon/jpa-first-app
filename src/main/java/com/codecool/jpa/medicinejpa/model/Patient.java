package com.codecool.jpa.medicinejpa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Patient {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @JsonProperty("date_of_birth")
    private LocalDate dateOfBirth;

}
