package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		int sayı = topla(15, 77);
		System.out.println(sayı);

		int toplam = topla2(2, 3, 4, 5, 6);
		System.out.println("sayılar toplamı: " + toplam);
		// void operasyonları değişken tiplerine atayamayız.

	}
	// void operasyonlar emir kipi gibi emir verir.

	public static void ekle() {
		System.out.println("eklendi.");
	}

	public static void sil() {
		System.out.println("silindi.");
	}

	public static void güncelle() {
		System.out.println("güncellendi.");
	}

	public static int topla(int sayı1, int sayı2) {

		return sayı1 + sayı2;
	}

	// variable argüments
	public static int topla2(int... sayılar) {

		int toplam = 0;
		for (int sayı : sayılar) {
			toplam += sayı;
		}
		return toplam;
	}

}
