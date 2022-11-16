package kodlama.io.softwareLanguages.entities.concretes;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //getter setterler oluşturuldu.
@NoArgsConstructor //parametresiz concructur oluşturuldu.
@Entity //kullanacağımız özellikler burdan alınır.Bu en alt katman.
@AllArgsConstructor
public class Language {
	@Id //bu bir id 
	@Column(name= "id") //bu bir kolon kolon adı id.
	@GeneratedValue //identificty özelliği verilir.
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "language")
	private Set<LanguageTechnology> technologies;

}
