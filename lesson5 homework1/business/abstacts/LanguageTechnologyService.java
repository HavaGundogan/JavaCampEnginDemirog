package kodlama.io.softwareLanguages.business.abstacts;

import java.util.List;

import kodlama.io.softwareLanguages.business.request.CreateLanguageTechnologyRequest;
import kodlama.io.softwareLanguages.business.request.UpdateLanguageTechnologyRequest;
import kodlama.io.softwareLanguages.business.response.FindAllLanguageTechnologyResponse;
import kodlama.io.softwareLanguages.business.response.FindByIdTechnologyResponse;

public interface LanguageTechnologyService {

	List<FindAllLanguageTechnologyResponse> findAll();
	void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest)throws Exception;
	FindByIdTechnologyResponse findById(int id) throws Exception;
	void deleteById(int id);
	void update(UpdateLanguageTechnologyRequest languageTechnologyRequest, int id) throws Exception;
	
}
