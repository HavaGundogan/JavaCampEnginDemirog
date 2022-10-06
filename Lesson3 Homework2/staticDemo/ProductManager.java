package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		if (validator.isValid(product)) {
			System.out.println("eklendi.");
		} else {
			System.out.println("ürün bilgileri geçersiz");
		}
		ProductValidator validator2=new ProductValidator();
		validator2.bisey();
		//staticler direk class adıyla çağrılır ve çağrıldığı anda da bellekte oluşur
		
	}
}
//yapıcı bloklar newleyince çalışır
//c# da staticde de newleyince çalışır fark budur.
