package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla() ;//herkes override etmek zorunda
	
	public final void gameOver() {//kimse override edemez
		System.out.println("oyun bitti.");
	}
}
