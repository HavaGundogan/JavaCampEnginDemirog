package oopWinthNLayeredApp;

import oopWinthNLayeredApp.business.ProductManager;
import oopWinthNLayeredApp.core.logging.Logger;
import oopWinthNLayeredApp.dataAccess.HibernateProductDao;
import oopWinthNLayeredApp.dataAccess.JdbcProductDao;
import oopWinthNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Product product= new Product(1,"iphone",90000);
		
		Logger[] loggers={};
		ProductManager manager=new ProductManager(new JdbcProductDao(),loggers);
		manager.add(product);
	}}//23.05
