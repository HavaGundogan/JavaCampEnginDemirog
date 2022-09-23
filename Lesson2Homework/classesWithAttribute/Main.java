package classesWithAttribute;

public class Main {

	// attribute or field
	public static void main(String[] args) {
		Product product = new Product();
		product.name = "labtop";
		product.id = 1;
		product.description = "Asus labtop";
		product.price = 5000;
		product.stockAmount = 3;

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
