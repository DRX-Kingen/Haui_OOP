package bt2;

public  class CanBo 
{
     protected String hoten;
     protected int tuoi;
     protected String gioitinh;
     protected String diachi;
	public CanBo(String hoten, int tuoi, String gioitinh, String diachi) {
		
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}
	
	

	public String getHoten() {
		return hoten;
	}

    public void hienthithongtin()
	{
		System.out.println("Ho ten:"+hoten);
		System.out.println("Tuoi:"+tuoi);
		System.out.println("Gioi tinh:"+gioitinh);
		System.out.println("Dia chi:"+diachi);
		
		
	}
	
}
