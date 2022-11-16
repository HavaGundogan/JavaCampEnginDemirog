package kodlama.io.softwareLanguages.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindByIdTechnologyResponse {

	private int technologyId;
	private String technologyName;
}
