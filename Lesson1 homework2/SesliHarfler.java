package intro;

public class SesliHarfler {
//kalın ve ince sesli harfler
	public static void main(String[] args) {
		
		char harf='a';
		
		switch(harf)
		{
		case 'a':
		case'ı':
		case'o':
		case'u':
			System.out.println("kalın sesli harf");
			break;
		default:
			System.out.println("ince sesli harf");
		}
		
		
	}

}
