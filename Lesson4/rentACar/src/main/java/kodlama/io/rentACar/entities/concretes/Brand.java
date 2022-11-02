package kodlama.io.rentACar.entities.concretes;

public class Brand {

	private String name;
	private int id;
	public Brand() {
		
	}
	public Brand( int id,String name) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//veritabanında tutulacak verilere ulaşmamız lazım 
	//bunu getirmek ya da eklemek için bu işlemleri dataAccess de yapacağız.
	
	
}
