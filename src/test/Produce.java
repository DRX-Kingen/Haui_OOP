package test;

public class Produce {
	protected String id;
	protected String name;
	protected int price;
	protected int total;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	public Produce(String id, String name, int price, int total) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.total = total;
	}
	
	public Produce() {
		this.id = "NULL";
		this.name = "NULL";
		this.price = 0;
		this.total = 0;
	}
	public String toString()
	{
		return this.id+" "+this.name+" "+this.price+" "+this.total;
	}
}
