package com.codecool.jpa.medicinejpa.controller;

import com.codecool.jpa.medicinejpa.model.Doctor;
import com.codecool.jpa.medicinejpa.repository.DoctorDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class DoctorController {
    private final DoctorDao doctorDao;

    public DoctorController(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }
    @ResponseBody
    @GetMapping("/doctors")
    public List<Doctor> findAll() {
        return doctorDao.findAll();
    }

    @GetMapping("/doctor")
    public String index(Model model) {
        model.addAttribute("doctors", doctorDao.findAll());
        return "index";
    }
}
