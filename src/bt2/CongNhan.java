package bt2;

public class CongNhan extends CanBo
{
	private int bac;
    public CongNhan(String hoten,int tuoi,String gioitinh,String diachi,int bac)
    {
    	super(hoten,tuoi,gioitinh,diachi);
    	this.bac=bac;
    }
    public void hienthithongtin()
    {
    	 super.hienthithongtin();
    	    System.out.println("Bac cua cong nhan:"+bac);
    }
   
    
}
