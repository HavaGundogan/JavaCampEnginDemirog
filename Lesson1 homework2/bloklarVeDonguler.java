package intro;

public class bloklarVeDonguler {

	public static void main(String[] args) {
		//karar yapıları (conditionals)
		/*int sayi=20;
		if(sayi<20)
		{
			System.out.println("sayi 20 den küçüktür.");
			
		}
		else if(sayi==20)
		{
			System.out.println("sayi 20 ye eşittir.");
		}
		else
		{
			System.out.println("sayi 20 den küçük değildir.");
		}*/
		
		System.out.println("-----------------------------------");
		
		// en büyük sayi hangisi if uygulaması
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;
		
		int enbüyük = sayi1;
		if(enbüyük<sayi2)
		{
			enbüyük=sayi2;
		}
		if(enbüyük<sayi3)
		{
			enbüyük=sayi3;
		}
		System.out.println("en büyük="+enbüyük);
		
		System.out.println("-------------------------------------");
		
		//switch blokları
		char grade = 'B';
		switch(grade)
		{
		case 'A':
			System.out.println("Mühemmel geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("iyi geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef kaldınız.");
			break;
			default:
				System.out.println("geçersiz  not girdiniz");
		}
		
		System.out.println("--------------------------------------------------------");	
		
		//For döngüsüyle çalışmak
		
		for(int i=1; i<10; i++)
		{
		System.out.println(i);	
			
		}
		
		System.out.println("döngü bitti");	

		System.out.println("---------------------------------------------------------");	
		
		//while döngüsüyle çalışmak
		/*int i=1;
		while(i<10)
		{
			i+=2;
			System.out.println(i);	
			
		}
		System.out.println("döngü bitti");	*/
		System.out.println("-------------------------------------");
		int i=2;
		//do while döngüsü
		do {
			System.out.println(i);
			i+=2;
			
		}while(i<10);
		System.out.println("döngü bitti");
		
	}

}
