package kodlama.io.softwareLanguages.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor//parametresiz concructor
public class CreateLanguageRequest {

	private int id;
	private String name;
	
}
