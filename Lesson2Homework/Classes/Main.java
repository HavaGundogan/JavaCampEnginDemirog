package Classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		CustomerManager customerManager3 = new CustomerManager();
		customerManager = customerManager2;// stakte tutulan iki customermanager de heapte aynı nesneye gidiyor.
		// Herhangi bir referansı tutan kimse kalmadığında ise garbage collector(çöpçü)
		// bellekten onu siler.
		// bellekte bir nesneyi ihtiyaç duymadıkça newlememeliyiz.

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		// claslar referans tiptir.Bellekte referans tanımladığımızca onu oluşturmuş
		// oluyoruz.
		// stack ve heap olarak bellekte iki alan var
		// customerManager oluştuğu zaman bellekte yer ayırır.
		// new dediğimiz zaman customerManager için heapte bir adet nesne oluşuyor.
		// nesne heapte çalışır.
		
		//değer tipli (value type)
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		/*değer tiplerde her şey stackde oluşur*/
		
		int[] sayilar1= new int[] {1,2,3};
		int[] sayilar2= new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		
		/*diziler referans tiptir. heapte artık aynı alanı kullandığı için cevap 10 oldu
		 * 
		 * burda dikkat edilmesi gereken referans tipidir.*/
		
	}

	/*
	 * clasların ilk ve temel özelliği gruplama yapmasıdır.
	 */

}
