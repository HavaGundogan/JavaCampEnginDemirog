package Lesson2homework2;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();// fonksiyon metdhodda çalışmaya başlar
		// istediğimiz kadar çağırırız

	}

	/*
	 * programcılık mantığı anladığınız zaman anlamlı olur.
	 */
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 7;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer("sayı mevcuttur: " + aranacak);

		} else {

			mesajVer("sayı mevcut değildir: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {// camelCasing
		System.out.println(mesaj);
	}
}
