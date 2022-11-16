package kodlama.io.softwareLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.softwareLanguages.business.abstacts.LanguageService;
import kodlama.io.softwareLanguages.business.request.CreateLanguageRequest;
import kodlama.io.softwareLanguages.business.request.UpdateLanguageRequest;
import kodlama.io.softwareLanguages.business.response.FindAllLanguageResponse;
import kodlama.io.softwareLanguages.business.response.FindByIdLanguageResponse;
import kodlama.io.softwareLanguages.core.LanguageCheckServis;
import kodlama.io.softwareLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.softwareLanguages.entities.concretes.Language;

@Service
public  class LanguageManager implements LanguageService {

	@Override
	public Language getLanguageById(int id) {
		
		return this.languageRepository.findById(id).orElse(null);
	}

	private LanguageRepository languageRepository;
	private LanguageCheckServis checkServis;
	
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository, LanguageCheckServis checkServis) {
		
		this.languageRepository = languageRepository;
		this.checkServis = checkServis;
	}

	@Override
	public List<FindAllLanguageResponse> findAll() {
		List<Language> languages= languageRepository.findAll();
		List<FindAllLanguageResponse> allLanguageResponses= new ArrayList<FindAllLanguageResponse>();
		for(Language language:languages) {
			FindAllLanguageResponse allLanguageResponse=new FindAllLanguageResponse(language.getId(), language.getName());
			allLanguageResponses.add(allLanguageResponse);
		}
		return allLanguageResponses;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language=new Language();
		language.setName(createLanguageRequest.getName());
		if(checkServis.checkname(language)) {
			languageRepository.save(language);
		}
		else {
			throw new Exception("aynı isimde dil eklenemez veya isim boş girilemez");
		}
		
	}

	@Override
	public FindByIdLanguageResponse findById(int id) throws Exception {
		FindByIdLanguageResponse findByIdLanguageResponse=new FindByIdLanguageResponse();
		
		Language language=languageRepository.findById(id) .orElse(null);//id ile ara bulursan getir bulmazsan boş ata
		if(language==null) {
			throw new Exception("Bu id ile dil  bulunamadı.");
		}
		findByIdLanguageResponse.setName(language.getName());
		findByIdLanguageResponse.setId(language.getId());
		return findByIdLanguageResponse;
	}

	@Override
	public void deleteById(int id) throws Exception {
		languageRepository.deleteById(id);;
		
	}

	@Override
	public void update(UpdateLanguageRequest languageRequest, int id) throws Exception {
		Language language=languageRepository.getReferenceById(id);
		language.setName(languageRequest.getLanguageName());
		languageRepository.save(language);
		
	}




}
