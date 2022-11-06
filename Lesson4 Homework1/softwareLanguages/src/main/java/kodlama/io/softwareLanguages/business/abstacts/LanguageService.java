package kodlama.io.softwareLanguages.business.abstacts;

import java.util.List;

import kodlama.io.softwareLanguages.entities.concretes.Language;

public interface LanguageService {
	
	List<Language> getAll();

	void add(Language language)throws Exception;
	Language getById(int id)throws Exception;
	void delete(int id)throws Exception;
	void update(int id,Language language)throws Exception;
}
