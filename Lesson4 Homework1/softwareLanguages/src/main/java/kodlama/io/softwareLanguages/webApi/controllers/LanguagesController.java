package kodlama.io.softwareLanguages.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.softwareLanguages.business.abstacts.LanguageService;
import kodlama.io.softwareLanguages.entities.concretes.Language;

@RestController // annotation(bilgilendirme)
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired //parametrelerine bak uygulamayı tara burayı kim implement ediyo bul newli ver
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping
	public void add (@RequestBody Language language) throws Exception {
		languageService.add(language);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable(name = "id") int id) throws Exception{
		languageService.delete(id);
	}
	
	
	@PutMapping("/{id}")
	public void update (@RequestBody Language language, @PathVariable int id) throws Exception{
		languageService.update(id,language);
	}
	
	@GetMapping("/ {id}")
	public Language getById (@PathVariable(name =  "id") int id) throws Exception {
		return languageService.getById(id);
	}
	
}
