package polymorphism;

public class CustomerManager {

	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}
	public void add() {
		System.out.println("müşteri eklendi.");
		DatabaseLogger logger=new DatabaseLogger();
		logger.log("Log mesaji");
		this.baseLogger.log("log mesaji");
	}
}
