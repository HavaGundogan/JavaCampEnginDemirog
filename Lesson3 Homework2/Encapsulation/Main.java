package Encapsulation;

public class Main {

	// attribute or field
	public static void main(String[] args) {
		/*Product product = new Product();
		product.setName("Labtop"); 
		product.setId(6);
		product.setDescription("Asus Labtop"); 
		product.setPrice(5000);
		product.setStockAmount(3);*/
		

	Product product = new Product(1,"labtop","asus labtop",3000,2);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		product.getId();
		System.out.println(product.getKod());

	}

}
