package core.logging;

public class ConsoleLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Logged With Console : " + data);
		
	}

}
