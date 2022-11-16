package kodlama.io.softwareLanguages.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageTechnologyRequest {

	private int technologyId;
	private String technologyName;
}
