package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Repository //bu sınıf bir dataaccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository{

	List<Brand> brands;
	
	public InMemoryBrandRepository() {
		brands= new ArrayList<Brand>();
	
		brands.add(new Brand(1,"bmw"));
		brands.add(new Brand(2,"mercedes"));
		brands.add(new Brand(3,"audi"));
		brands.add(new Brand(4,"fiat"));
		brands.add(new Brand(5,"renault"));
	}

	@Override
	public List<Brand> gelAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
