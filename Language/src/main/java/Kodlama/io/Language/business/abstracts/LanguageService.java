package Kodlama.io.Language.business.abstracts;

import Kodlama.io.Language.entities.concretes.Language;

import java.util.List;


public interface LanguageService {
    List<Language>getAll();
    Language getById(int id);

    void add(Language language) throws Exception;

    void delete(int id);

    void update(Language language);
}
