package kodlama.io.softwareLanguages.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindByIdLanguageResponse {
private int id;
private String name;
}
