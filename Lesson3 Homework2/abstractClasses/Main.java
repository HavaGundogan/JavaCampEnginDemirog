package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		//abstract sınıflar newlenemez. bir yöntemi var ama çok doğru değil. bilme daha hayırlı:D
		GameCalculator gameCalculator=new WomanGameCalculator();//operasyona gamecalculator verip ...

	}

}
