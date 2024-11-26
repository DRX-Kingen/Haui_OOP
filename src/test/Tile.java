
package test;

public class Tile extends Produce{
	
		private String ngaysx;
		private String diachi;
		
		public Tile(String id, String name, int price, int total, String ngaysx, String diachi) {
		super(id, name, price, total);
		this.ngaysx=ngaysx;
		this.diachi=diachi;
		
	}

      public Tile() {
    	this.id = "NULL";
  		this.name = "NULL";
  		this.price = 0;
  		this.total = 0;
		ngaysx="NULL";
		diachi="NULL";
	}
      public String toString()
      {
    	 
    	  return  super.toString()+"\n"+this.diachi+" "+this.ngaysx;
      }
	

}
