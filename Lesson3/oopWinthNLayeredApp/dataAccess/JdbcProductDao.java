package oopWinthNLayeredApp.dataAccess;

import oopWinthNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	//dao data access object
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır....SQL bilmek gerekir
		System.out.println("JDBS ile veritabanına eklendi.");
		
	}

}
//22.00 mola
//hibernate