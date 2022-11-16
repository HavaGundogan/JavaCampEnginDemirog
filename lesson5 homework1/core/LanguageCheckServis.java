package kodlama.io.softwareLanguages.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.softwareLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.softwareLanguages.entities.concretes.Language;

@Service
public class LanguageCheckServis {

	private LanguageRepository languageRepository;

	@Autowired //otomatik olarak nesneyi hayata geçirir. new ler.
	public LanguageCheckServis(LanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}
	
	public boolean checkname(Language language) {
		List<Language> languages= languageRepository.findAll();
		for(Language language2:languages) {
			if(language2.getName().equalsIgnoreCase(language.getName())){
				return false;
			}
		}
		if(language.getName()=="") {
			return false;
		}
		return true;
		
	}
	
}
