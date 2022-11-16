package kodlama.io.softwareLanguages.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.softwareLanguages.business.abstacts.LanguageTechnologyService;
import kodlama.io.softwareLanguages.business.request.UpdateLanguageTechnologyRequest;
import kodlama.io.softwareLanguages.business.response.FindAllLanguageTechnologyResponse;
import kodlama.io.softwareLanguages.business.response.FindByIdTechnologyResponse;

@RestController
@RequestMapping("/api/controllers")
public class TechnologiesController {

	private LanguageTechnologyService languageTechnologyService;
	@Autowired
	public TechnologiesController(LanguageTechnologyService languageTechnologyService) {
		
		this.languageTechnologyService = languageTechnologyService;
	}

	@GetMapping("/getLanguageTechnology")
	public List<FindAllLanguageTechnologyResponse> findAll(){
		return languageTechnologyService.findAll();
	}
	
	@GetMapping("/findByIdLanguageTechnology")
	public FindByIdTechnologyResponse findByIdTechnologyResponse(@PathVariable int id)throws Exception{

		return languageTechnologyService.findById(id);
	}
	
	@GetMapping("/deleteLanguageTechnology/{id}")
	public void deleteLanguageTechnology(@PathVariable int id) {
		languageTechnologyService.deleteById(id);
	}
	
	@GetMapping("/updateLanguageTechnology/{id}")
	 public void updateLanguageTechnology(@RequestBody UpdateLanguageTechnologyRequest updateLanguageTechnologyRequest,@PathVariable int id)throws Exception {
		 languageTechnologyService.update(updateLanguageTechnologyRequest, id);
	 }
}
