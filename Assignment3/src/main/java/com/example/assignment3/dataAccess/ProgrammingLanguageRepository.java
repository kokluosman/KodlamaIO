package com.example.assignment3.dataAccess;

import com.example.assignment3.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer>{
}
