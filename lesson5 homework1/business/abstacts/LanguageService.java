package kodlama.io.softwareLanguages.business.abstacts;

import java.util.List;

import kodlama.io.softwareLanguages.business.request.CreateLanguageRequest;
import kodlama.io.softwareLanguages.business.request.UpdateLanguageRequest;
import kodlama.io.softwareLanguages.business.response.FindAllLanguageResponse;
import kodlama.io.softwareLanguages.business.response.FindByIdLanguageResponse;
import kodlama.io.softwareLanguages.entities.concretes.Language;


public interface LanguageService {
	
	List<FindAllLanguageResponse> findAll();
	void add(CreateLanguageRequest createLanguageRequest)throws Exception;
	FindByIdLanguageResponse findById(int id) throws Exception;
	void deleteById(int id)throws Exception;
	void update(UpdateLanguageRequest languageRequest, int id) throws Exception;
	Language getLanguageById(int id);
	
}
