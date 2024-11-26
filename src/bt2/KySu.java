package bt2;

public class KySu extends CanBo{
	private String nganhdaotao;
	public KySu(String hoten,int tuoi,String gioitinh,String diachi, String nganhdaotao)
	{
		super(hoten,tuoi,gioitinh,diachi);
		this.nganhdaotao=nganhdaotao;
	}
	public void hienthithongtin()
	{
		super.hienthithongtin();
	    System.out.println("Nganh dao tao:"+nganhdaotao);
	    
	}

}
