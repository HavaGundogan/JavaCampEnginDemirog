package oop1;

public class Main {

	public static void main(String[] args) {
		/*oop object orianted programming
		nesne yönelimli programlama diyebiliriz.Dilleri kullanırken nesnel yazmaya dikkat etmeliyiz.
		Nesne yönelimli yapılar bize sürdürülebilirlik sağlar. Gerçek hayatla ilişkilendirdiğimizde anlayabiliriz ama karışıklığa da sebebiyet verebilir.
		#Sektörün tamamına yakını otomasyon olduğu için biz veriyi yönetiyoruz.
		Nesneleri nesne yapan şey tüm özellikleridir.(Onu tanımlayan ve tamamlayan özellikler)
		Nesnelerin özelliklerini tutan yapılar classlardır.Classlar ikiye ayrılır.Özellik tutucu ve operasyon tutucu.
		
		*/
		Product product1= new Product();//nesneyi canlandırmak için new operatörü ile örnekleriz.
		
		//set value (değer atamak)
		product1.setName ("Delonghi Kahve Makinesi");//Product clasının özelliklerini yeni nesne ile çağırarak kullanırız.
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		//get value (değer okumak)
		//System.out.println(product1.name);
		
		
		//22.10 Dersteyiz :)
		Product product2= new Product();
		product2.setName ("Sweg Kahve Makinesi");//Product clasının özelliklerini yeni nesne ile çağırarak kullanırız.
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
		
		
		Product product3= new Product();
		product3.setName ("Kitchen Kahve Makinesi");//Product clasının özelliklerini yeni nesne ile çağırarak kullanırız.
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
		
		
		Product[] products= { product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");
		
		//23.15 3. bölüm başlangıcı
		
		IndividualCustomer individualcustomer = new IndividualCustomer();
		individualcustomer.setId(1);
		individualcustomer.setCustomerNumber("2562");
		individualcustomer.setPhone("12354");
		individualcustomer.setFirstName("Engin");
		individualcustomer.setLastName("Demirog");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("5655");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setCustomerNumber("444444");
		corporateCustomer.setTaxNumber("7789865");
		
		Customer[] customers= {individualcustomer,corporateCustomer};
		
		
	}

}
