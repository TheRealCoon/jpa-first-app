package com.codecool.jpa.medicinejpa.repository;

import com.codecool.jpa.medicinejpa.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientDao extends JpaRepository<Patient, Integer> {
    List<Patient> findAllByNameStartsWith(String nameStart);

    @Query(value = "select id, name, date_Of_birth from patient where date_of_birth = :date", nativeQuery = true)
    List<Patient> findAllByBirthDay(@Param("date") String date);
}

