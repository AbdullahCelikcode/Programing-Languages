package Kodlama.io.Language.dataAccsess.concretes;

import Kodlama.io.Language.dataAccsess.abstracts.LanguageRepository;
import Kodlama.io.Language.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguagesRepository implements LanguageRepository {
   List<Language> languages;


    public InMemoryLanguagesRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"c#"));
        languages.add(new Language(2,"java"));
        languages.add(new Language(3,"Python"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public Language getById(int id) {
        return  languages.get(id);
    }

    @Override
    public void delete(int id) {
        languages.remove(id-1);
    }

    @Override
    public void update(Language language1) {
      Language language= new Language();
      language.setId(language1.getId());
      language.setName(language1.getName());
    }
}
