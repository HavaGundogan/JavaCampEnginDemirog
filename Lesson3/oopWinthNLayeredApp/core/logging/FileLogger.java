package oopWinthNLayeredApp.core.logging;

public class FileLogger implements Logger {

	public void log(String data) {
		// bir base sınıftan vs geliyo
		System.out.println("Dosyaya loglandı: "+data);
	}

}
