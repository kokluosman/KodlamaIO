package com.example.assignment3.api;

import com.example.assignment3.business.ProgrammingLanguageService;
import com.example.assignment3.entities.ProgrammingLanguage;
import com.example.assignment3.requests.CreateProgrammingLanguageRequest;
import com.example.assignment3.requests.DeleteProgrammingLanguageRequest;
import com.example.assignment3.responses.GetAllProgrammingLanguageResponse;
import com.example.assignment3.responses.GetByIdProgrammingLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pl")
public class ProgrammingLanguagesController {

    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguageResponse> getAll(){
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateProgrammingLanguageRequest language){
        this.programmingLanguageService.add(language);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteProgrammingLanguageRequest languageRequest){
        programmingLanguageService.delete(languageRequest);
    }
    @GetMapping("/getbyid")
    public String getById(GetByIdProgrammingLanguageResponse get){
        return programmingLanguageService.getById(get);
    }

}
