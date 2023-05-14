package Kodlama.io.Language.business.concretes;

import Kodlama.io.Language.business.abstracts.LanguageService;
import Kodlama.io.Language.dataAccsess.abstracts.LanguageRepository;
import Kodlama.io.Language.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
// iş kuralları
@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id);
    }

    @Override
    public void add(Language language) throws Exception {
        List<Language>existingLanguage;
        existingLanguage=languageRepository.getAll();
    for (Language forLanguage:existingLanguage){
        if(forLanguage.getName().equalsIgnoreCase(language.getName())){
            throw new Exception(" Lütfen sistemde mevcut olmayan bir dil giriniz !!! ");
        }
    if (language.getName().isEmpty())  throw new Exception(" Lütfen programlama dili giriniz !!! ");
    }
        languageRepository.add(language);
    }

    @Override
    public void delete(int id) {
      languageRepository.delete(id);
    }

    @Override
    public void update(int id, String name) {
        languageRepository.update(id,name);
    }

}
