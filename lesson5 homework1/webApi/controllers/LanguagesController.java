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
import kodlama.io.softwareLanguages.business.request.CreateLanguageRequest;
import kodlama.io.softwareLanguages.business.request.UpdateLanguageRequest;
import kodlama.io.softwareLanguages.business.response.FindAllLanguageResponse;
import kodlama.io.softwareLanguages.business.response.FindByIdLanguageResponse;

@RestController // annotation(bilgilendirme)
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired //parametrelerine bak uygulamayı tara burayı kim implement ediyo bul newli ver
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<FindAllLanguageResponse> findAll(){
		return languageService.findAll();
	}
	
	@PostMapping("/addLanguage")
	public void add (@RequestBody CreateLanguageRequest createLanguageRequest) throws Exception {
		languageService.add(createLanguageRequest);
	}
	
	
	@DeleteMapping("/deleteLanguage/{id}")
	public void delete (@PathVariable(name = "id") int id) throws Exception{
		languageService.deleteById(id);
	}
	
	
	@PutMapping("/{id}")
	public void update ( @PathVariable(name="id") int id,@RequestBody UpdateLanguageRequest updateLanguageRequest) throws Exception{
		languageService.update(updateLanguageRequest,id);
	}
	
	@GetMapping("/getbyidLanguage/ {id}")
	public FindByIdLanguageResponse getByIdLanguage (@PathVariable(name =  "id") int id) throws Exception {
		return languageService.findById(id);
	}
	
}
