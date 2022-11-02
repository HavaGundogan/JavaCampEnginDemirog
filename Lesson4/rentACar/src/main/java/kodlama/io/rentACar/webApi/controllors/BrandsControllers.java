package kodlama.io.rentACar.webApi.controllors;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsControllers {

	private BrandService brandService;

	@Autowired //git parametrelerine bak,uygulamayı tara
	public BrandsControllers(BrandService brandService) {
		
		this.brandService = brandService;
	}

	@GetMapping("/getAll")
	public List<Brand> getAll() {
		return brandService.getAll();
	}

	
	
}
