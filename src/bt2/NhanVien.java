package bt2;

public class NhanVien extends CanBo{
	private String congviec;
	public NhanVien(String hoten,int tuoi, String gioitinh, String diachi,String congviec)
	{
		super(hoten,tuoi,gioitinh,diachi);
		this.congviec=congviec;
	}
	public void hienthithongtin()
	{
		super.hienthithongtin();
	    System.out.println("Cong viec:"+congviec);
	    
	}
    
}
