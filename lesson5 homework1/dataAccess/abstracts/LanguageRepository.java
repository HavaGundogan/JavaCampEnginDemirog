package kodlama.io.softwareLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.softwareLanguages.entities.concretes.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Integer> {

	

}
