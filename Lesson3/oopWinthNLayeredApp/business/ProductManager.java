package oopWinthNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWinthNLayeredApp.core.logging.Logger;
import oopWinthNLayeredApp.dataAccess.HibernateProductDao;
import oopWinthNLayeredApp.dataAccess.JdbcProductDao;
import oopWinthNLayeredApp.dataAccess.ProductDao;
import oopWinthNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] logger;
	
	public ProductManager(ProductDao productDao,Logger[] logger) {
		this.productDao = productDao;
		this.logger=logger;
	}


	public void add(Product product) throws Exception {// response request yapısına göre yeniden ele alınacak


		
		ProductDao productDao = new JdbcProductDao();
		//iş kuralları
		if (product.getUnitPrice()<10) {
			
			throw new Exception("10 tl den küçük olamaz!!!");
		}
		productDao.add(product);
		for(Logger logger:logger)//db, mail
		{
			Logger.log(product.getName());
		}
	}
	
}//bir katman başka bir katmanın classını kullanıyorsa sadece interfaceden bağ kurmalıdır.

