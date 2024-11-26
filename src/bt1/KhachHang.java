package bt1;
import java.util.Scanner;
public class KhachHang {
	Scanner sn=new Scanner(System.in);
	private String diachi, hoten;

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	
	public KhachHang(String diachi, String hoten) {
		
		this.diachi = diachi;
		this.hoten = hoten;
	}
	

	public KhachHang() {
		this.diachi = "NULL";
		this.hoten = "NULL";
	}

	public void nhap()
	{
		System.out.print("Nhap ho ten khach hang:");
		this.hoten=sn.nextLine();
		System.out.print("Nhap dia chi khach hang:");
		this.diachi=sn.nextLine();
		
	}
	public String toString()
	{
		return "Ho ten:"+this.hoten+"\n"+"Dia chi:"+this.diachi;
	}
	

}
