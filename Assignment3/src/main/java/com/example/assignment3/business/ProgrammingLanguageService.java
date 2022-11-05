package com.example.assignment3.business;

import com.example.assignment3.requests.CreateProgrammingLanguageRequest;
import com.example.assignment3.requests.DeleteProgrammingLanguageRequest;
import com.example.assignment3.responses.GetAllProgrammingLanguageResponse;
import com.example.assignment3.responses.GetByIdProgrammingLanguageResponse;

import java.util.List;

public interface ProgrammingLanguageService {

    List<GetAllProgrammingLanguageResponse> getAll();

    void add(CreateProgrammingLanguageRequest languageRequest);

    void delete(DeleteProgrammingLanguageRequest languageRequest);

    String getById(GetByIdProgrammingLanguageResponse get);



}
