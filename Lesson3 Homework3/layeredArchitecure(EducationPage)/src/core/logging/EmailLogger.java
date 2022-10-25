package core.logging;

public class EmailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Logged with Email : " + data);
		
	}

}
