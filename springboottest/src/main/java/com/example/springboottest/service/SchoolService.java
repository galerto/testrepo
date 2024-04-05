package com.example.springboottest.service;
import com.example.springboottest.model.School;
import com.example.springboottest.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    public School getSchoolById(Long schoolId) {
        return schoolRepository.findById(schoolId).orElse(null);
    }

    public void deleteSchool(Long schoolId) {
        schoolRepository.deleteById(schoolId);
    }

    // Dodaj inne metody serwisu wg potrzeb
}
