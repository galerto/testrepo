package com.example.springboottest.repository;

import com.example.springboottest.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    // Dodaj metody dostępu do danych, jeśli potrzebujesz
}
