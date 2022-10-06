package Encapsulation;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("yapıcı blok çalıştı.");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
		//Concructer ilk çalışan bloktur.yazmasak bile kendiliğinden var olur
	}
	
    //bir class aynı zamanda özellik barındırır.(atribute)
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private int id;
	private String kod;
	// encapsulationun en önemli konusu getter ve setter yazmak.

	public int getId() {// id yi yazamaz ama okuyabilir
		// burada db den gelen değeri değiştirerek de verebiliriz.

		return id;

	}

	public void setId(int id) {
		this.id = id;// hangi id hangi alan? this karışıklığı önler. this bu class demektir.

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getKod() {
		
		return this.name.substring(0,1)+this.id;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	

}
