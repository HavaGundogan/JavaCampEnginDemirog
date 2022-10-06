package interfaceWithPolimorfizm;

public class MySqlCustomerDal implements ICustomerDal,IRepository {
//Dal= dateAccesslayer
	
	//abstract ile farkı? :interface onu implemente eden sınıfın referansını tutabilir
	@Override
	public void Add() {
		
		System.out.println("My sql e eklendi");
	}
}
//interfaceler newlenmez ve imza tasır
//bir class birden fazla interfaceyi implemente edebilir 
//bir class yalnızca bir sınıfı extend edebilir.
//interfaceler implemente edilir.
