
public class CustomerManager {
	
	//Son kısımın main i dir.

	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager ;
	}

	public void Save() {
		System.out.println("Müşteri kaydedildi : ");
	}

	public void Delete() {
		System.out.println("Müşteri silindi : ");
	}
	
	public void GiveCredit(){
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
	}
	

}
