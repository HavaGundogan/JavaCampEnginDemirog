package staticDemo;

public class ProductValidator {
	public ProductValidator() {
		System.out.println("bu concructer çalışıyor ?");
	}
	static {
		System.out.println("yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product) {
		
		
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;// isempty değilse
		} else {
			return false;
		}
	}
	public void bisey() {
		//bunu çağırmak için managerde newle
	}
	
	public static class BaskaBirClass{
		public static void sil() {
			//inner class
		}//gruplama amaçlı kullanılır. Bölümlendirme gibi
		
	}
}
//arac yapıları bir kez kullanılacağı için static yapmak mantıklı
//static tanımlayınca bellekten uygulama sıfırlanmadıkça atılmaz
