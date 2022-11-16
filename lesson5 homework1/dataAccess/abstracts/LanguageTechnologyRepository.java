package kodlama.io.softwareLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.softwareLanguages.entities.concretes.LanguageTechnology;

@Repository
public interface LanguageTechnologyRepository extends JpaRepository<LanguageTechnology, Integer>{
//class-class veya interface-interface extend edilir, class-interface implemente eder
	
	
}
