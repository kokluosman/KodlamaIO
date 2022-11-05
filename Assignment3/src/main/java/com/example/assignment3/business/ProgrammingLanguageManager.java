package com.example.assignment3.business;

import com.example.assignment3.dataAccess.ProgrammingLanguageRepository;
import com.example.assignment3.entities.ProgrammingLanguage;
import com.example.assignment3.requests.CreateProgrammingLanguageRequest;
import com.example.assignment3.requests.DeleteProgrammingLanguageRequest;
import com.example.assignment3.responses.GetAllProgrammingLanguageResponse;
import com.example.assignment3.responses.GetByIdProgrammingLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<GetAllProgrammingLanguageResponse> getAll() {
        List<ProgrammingLanguage> languages = programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguageResponse> response = new ArrayList<>();
        for (ProgrammingLanguage language : languages){
            GetAllProgrammingLanguageResponse languageResponse = new GetAllProgrammingLanguageResponse();
            languageResponse.setId(language.getId());
            languageResponse.setName(language.getName());
            response.add(languageResponse);
        }
        return response;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest languageRequest) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(languageRequest.getName());
        List<ProgrammingLanguage> languages = programmingLanguageRepository.findAll();
        for (ProgrammingLanguage language : languages){
            if (language.getName().equalsIgnoreCase(languageRequest.getName())){
                throw new RuntimeException(languageRequest.getName()+ "Programlama dili veritabanında kayıtlıdır!!");
            } else if (languages.isEmpty()) {
                throw new RuntimeException("Programlama dili boş geçilemez!!");
            }else {
                programmingLanguageRepository.save(programmingLanguage);
            }
        }
    }

    @Override
    public void delete(DeleteProgrammingLanguageRequest languageRequest) {
        programmingLanguageRepository.deleteById(languageRequest.getId());
    }

    @SuppressWarnings("deprecation")
    @Override
    public String getById(GetByIdProgrammingLanguageResponse get) {
        return programmingLanguageRepository.getById(get.getId()).getName();
    }
}
