package kodlama.io.softwareLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.softwareLanguages.business.abstacts.LanguageService;
import kodlama.io.softwareLanguages.business.abstacts.LanguageTechnologyService;
import kodlama.io.softwareLanguages.business.request.CreateLanguageTechnologyRequest;
import kodlama.io.softwareLanguages.business.request.UpdateLanguageTechnologyRequest;
import kodlama.io.softwareLanguages.business.response.FindAllLanguageTechnologyResponse;
import kodlama.io.softwareLanguages.business.response.FindByIdTechnologyResponse;
import kodlama.io.softwareLanguages.dataAccess.abstracts.LanguageTechnologyRepository;
import kodlama.io.softwareLanguages.entities.concretes.LanguageTechnology;

@Service
public class LanguageTechnologyManager implements LanguageTechnologyService {

	private LanguageTechnologyRepository languageTechnologyRepository;
	private LanguageService languageService;
	
	@Autowired
	public LanguageTechnologyManager(LanguageTechnologyRepository languageTechnologyRepository,
			LanguageService languageService) {
	
		this.languageTechnologyRepository = languageTechnologyRepository;
		this.languageService = languageService;
	}

	@Override
	public List<FindAllLanguageTechnologyResponse> findAll() {
		List<LanguageTechnology> languageTechnologies= languageTechnologyRepository.findAll();
		List<FindAllLanguageTechnologyResponse> findAllLanguageTechnologyResponses= new ArrayList<>();
		for(LanguageTechnology languageTechnology:languageTechnologies) {
			FindAllLanguageTechnologyResponse findAllLanguageTechnologyResponse=new FindAllLanguageTechnologyResponse();
			findAllLanguageTechnologyResponse.setName(languageTechnology.getName());
			findAllLanguageTechnologyResponse.setId(languageTechnology.getId());
			findAllLanguageTechnologyResponses.add(findAllLanguageTechnologyResponse);
			
		}
		return findAllLanguageTechnologyResponses;
	}

	@Override
	public void add(CreateLanguageTechnologyRequest createLanguageTechnologyRequest) throws Exception {
		LanguageTechnology languageTechnology=new LanguageTechnology();
		languageTechnology.setName(createLanguageTechnologyRequest.getTechnologyName());
		languageTechnology.setLanguage(this.languageService.getLanguageById(createLanguageTechnologyRequest.getTechnologyId()));
		languageTechnologyRepository.save(languageTechnology);
	}

	@Override
	public FindByIdTechnologyResponse findById(int id) throws Exception {
		List<LanguageTechnology> languageTechnologies= languageTechnologyRepository.findAll();
		FindByIdTechnologyResponse findByIdTechnologyResponse=null;
		
		for(LanguageTechnology languageTechnology:languageTechnologies) {
			if(languageTechnology.getId()==id) {
				findByIdTechnologyResponse=new FindByIdTechnologyResponse();
				findByIdTechnologyResponse.setTechnologyId(languageTechnology.getId());
				findByIdTechnologyResponse.setTechnologyName(languageTechnology.getName());
				
				
			
			}
		}
		if(findByIdTechnologyResponse==null)
		{
			throw new Exception("bu id ye ait dil teknolojisi bulunamadı");
		}
		
		return findByIdTechnologyResponse;
	}


	@Override
	public void deleteById(int id)  {
		languageTechnologyRepository.deleteById(id);
		
	}

	@Override
	public void update(UpdateLanguageTechnologyRequest languageTechnologyRequest, int id) throws Exception {
		LanguageTechnology languageTechnology=languageTechnologyRepository.getReferenceById(id);
		languageTechnology.setId(languageTechnologyRequest.getTechnologyId());
		languageTechnology.setName(languageTechnologyRequest.getTechnologyName());
		languageTechnologyRepository.save(languageTechnology);
		
	}



	
}
