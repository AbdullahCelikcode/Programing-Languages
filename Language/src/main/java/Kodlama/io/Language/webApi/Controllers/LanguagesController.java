package Kodlama.io.Language.webApi.Controllers;

import Kodlama.io.Language.business.abstracts.LanguageService;
import Kodlama.io.Language.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // annotation
@RequestMapping("/api/languages")
public class LanguagesController {
            private LanguageService languageService;
    @Autowired
    public LanguagesController(LanguageService languageService) {

        this.languageService = languageService;
    }
    @GetMapping("/getall")
    public List<Language>getAll(){
        return languageService.getAll();
    }
   @PostMapping("/add")
    public void add(Language language) throws Exception {
        languageService.add(language);
    }
  @PostMapping("/getByid")
    public Language getById(int id) {
        return languageService.getById(id-1);
    }
    @PostMapping("/delete")
    public void delete(int id){
        languageService.delete(id);
    }
    @PostMapping("/update")
    public void update(int id, String name){
        languageService.update(id,name);
    }
}
