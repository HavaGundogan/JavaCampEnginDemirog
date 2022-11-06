package kodlama.io.softwareLanguages.dataAccess.abstracts;

import java.util.List;

import kodlama.io.softwareLanguages.entities.concretes.Language;


public interface LanguageRepository {

	List<Language> getAll();
	void add(Language language);
	Language getById(int id);
	void update(int id,Language language);
	void delete(int id);
	
	
}
