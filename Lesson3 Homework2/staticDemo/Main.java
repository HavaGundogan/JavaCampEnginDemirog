package staticDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.id = 123;
		product.name = "Mouse";
		manager.add(product);
		
		DatabaseHelper.Crud.Delete();
		DatabaseHelper.Connection.createConnection();
		//bu tip yapılar önerilmiyor
		//birbirine benzer operasyonlar single responsibly prensibine ters düşmesin
		
	}

}
