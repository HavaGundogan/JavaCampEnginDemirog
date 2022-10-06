package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//müşterinin zamanla gelişen taleplerine karşılık veren programlar yazmalıyız.
		//daha düzenli ve temiz kod yazmalıyız.
	
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());

	}

}
