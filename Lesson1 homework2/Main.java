package intro;

public class Main {

	//ilk ders
    public static void main(String[] args) {

        
        System.out.println("Hello World!");//Konsola yazdırma işlemini yapan metod

        System.out.println("-----------------------");

        //String, metinsel bir veriyi tanımlama
        //değişken ismi küçük harfle başlar.
        String ortaMetin = "İlginizi çekebilir.";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);

        System.out.println("------------------------");

        //Tamsayı tanımlamak için int kullanılır
        int vade = 12;

        //Ondalık sayı tanımlamak için double kullanılır.
        double dolarDunkiDegeri = 18.14;
        double dolarBugun = 18.20;

        //boolean veri tipi türlerini true ya da false değerleriyle tanımlarız
        //true ifadesi web elementini gösterirken, false ifadesi göstermez.
        boolean dolarDustuMu = false;

        String okYonu = "";

        //if (eğer) ifadeleri boolean veri tiplerini kabul eder.
        //Aşağıdaki if ifadesinde "bugünki dolar değeri dünkü dolar değerinden düşükse" ifadesi işlenmiştir.
        
        //dolarBugun < dolarDunkiDegeri --> false dönecek
        //if, else bloklarından sadece biri çalışır ama mutlaka çalışır.

        if (dolarBugun < dolarDunkiDegeri) { 
            okYonu = "down.svg"; //true dönerse okYonu aşağıyı göster demek ister
            System.out.println(okYonu); 

        } else if (dolarBugun > dolarDunkiDegeri) { 
            System.out.println(okYonu); 

        } else { 
            okYonu = "equal.svg"; 
            System.out.println(okYonu); 
        }

        System.out.println("----------------------------");

       
        //Gerçek bir projede bu veriler bize Db'den yani veri kaynağından gelir.
        String[] krediler = {"Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli"};

        //Kodlamada ilk eleman 0'dan başlar.
        System.out.println(krediler[0]); //Krediler Array'inin ilk elemanı
        System.out.println(krediler[1]); //2. eleman
        System.out.println(krediler[2]); //3. eleman

        System.out.println("---------------------------");

        //Dinamik sistemler yapmak için döngüler kullanılırız.
        //for --> Bir şeyi bir şarta göre tekrarla demek.
        //int i = 0; --> Saymaya 0'dan başla
        //i < krediler.lenght; kredilerin uzunluğu kadar döner
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
            		}

    }
}