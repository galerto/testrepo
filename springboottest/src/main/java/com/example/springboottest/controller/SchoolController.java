package com.example.springboottest.controller;
import com.example.springboottest.model.School;
import com.example.springboottest.repository.SchoolRepository;
import com.example.springboottest.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/")
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @PostMapping("/")
    public School createSchool(@RequestBody School school) {
        return schoolService.createSchool(school);
    }

    @GetMapping("/{schoolId}")
    public School getSchoolById(@PathVariable Long schoolId) {
        return schoolService.getSchoolById(schoolId);
    }

    @DeleteMapping("/{schoolId}")
    public void deleteSchool(@PathVariable Long schoolId) {
        schoolService.deleteSchool(schoolId);
    }

    // Dodaj inne metody kontrolera wg potrzeb
}