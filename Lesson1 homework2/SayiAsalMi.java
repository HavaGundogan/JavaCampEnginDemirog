package intro;

public class SayiAsalMi {

	public static void main(String[] args) {
	
		int number=25;//kalan operatörü %
		int remainder= number%2;
		boolean isPrime= true;
		
		for(int i=2; i<number; i++)
		{
			if( number %i==0) {
				isPrime=false;
			}
			
		}
		if(isPrime)
		{

			System.out.println("Sayı Asaldır.");
			
		}else
		{

			System.out.println("Sayı asal değildir.");
		
		}
		
		
		
	}

}
