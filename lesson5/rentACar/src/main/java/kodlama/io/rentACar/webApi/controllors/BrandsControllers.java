package kodlama.io.rentACar.webApi.controllors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

@RestController // annotation
@RequestMapping("/api/brands")
public class BrandsControllers {

	private BrandService brandService;

	@Autowired // git parametrelerine bak,uygulamayı tara
	public BrandsControllers(BrandService brandService) {

		this.brandService = brandService;
	}

	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll() {
		return brandService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}

}
