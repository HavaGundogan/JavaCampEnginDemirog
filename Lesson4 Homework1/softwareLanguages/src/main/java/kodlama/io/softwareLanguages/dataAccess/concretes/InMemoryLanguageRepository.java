package kodlama.io.softwareLanguages.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.softwareLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.softwareLanguages.entities.concretes.Language;

public class InMemoryLanguageRepository implements LanguageRepository {

	private List<Language> languages;
	public InMemoryLanguageRepository() {
		languages=new ArrayList<>();
		languages.add(new Language(1,"c#"));
		languages.add(new Language(2,"java"));
		languages.add(new Language(3,"python"));
	}
	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void add(Language language) {
		this.languages.add(language);
	}

	@Override
	public Language getById(int id){
		for(Language language:languages) {
			if(language.getId()==id) {
				return language;
			}
			
		}
		return null;
	}

	public void update(int id,Language language) {
		for (Language language1:languages) {
			if (language1.getId() == id) {
				language1.setName(language.getName());
			}
		} 	
	}

	@Override
	public void delete(int id) {
		getAll().removeIf(lng -> lng.getId() == id);
		
		
	}
	

	
}
