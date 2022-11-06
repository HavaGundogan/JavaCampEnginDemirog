package kodlama.io.softwareLanguages.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.softwareLanguages.business.abstacts.LanguageService;
import kodlama.io.softwareLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.softwareLanguages.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		// iş kuralları

		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		if (isNameExist(language)) {
			throw new Exception("İsim tekrar edemez.");
		}
		if (isIdExist(language.getId())) {
			throw new Exception("İd tekrar edemez.");
		}
		languageRepository.add(language);

		
	}

	@Override
	public Language getById(int id) throws Exception {
		return languageRepository.getById(id);

	}

	@Override
	public void delete(int id) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("Kimlik bulanamadı.");
		}
		languageRepository.delete(id);
		
	}

	@Override
	public void update( int id,Language language) throws Exception {
		if (!isIdExist(id)) {
			throw new Exception("İd bulunamadı.");
		}
		if (isNameExist(language)) {
			throw new Exception("İsim zaten mevcut.");
		}
		languageRepository.update(id,language);

		
	}
	
	public boolean isNameExist (Language language) throws Exception{
		for (Language lang:languageRepository.getAll()) {
			if (lang.getName().equals(language.getName())) {
				return true;
			}
			
			if (lang.getName().isEmpty()) {
				return true;
			}
		}
		
		return false;
		
	
	
	}	
	
	public boolean isIdExist (int id) {
		for (Language lng:getAll()) {
			if (lng.getId() == id ) {
				return true;
			}
		}
		return false;
	}
	
	
}
