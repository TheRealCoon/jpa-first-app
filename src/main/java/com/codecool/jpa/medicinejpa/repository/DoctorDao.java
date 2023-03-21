package com.codecool.jpa.medicinejpa.repository;

import com.codecool.jpa.medicinejpa.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long> {
}
