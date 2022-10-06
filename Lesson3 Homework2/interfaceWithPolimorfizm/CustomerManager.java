package interfaceWithPolimorfizm;

public class CustomerManager {
	
	public ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		//iş kodları yazılır.
	customerDal.Add();	
	}

}
