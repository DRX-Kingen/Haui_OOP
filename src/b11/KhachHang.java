package b11;
import java.util.Scanner;
public class KhachHang {
      protected String hoten;
      protected String soNha;
      protected String msCTD;
      Scanner sn= new Scanner(System.in);
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getSoNha() {
		return soNha;
	}
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	public String getMsCTD() {
		return msCTD;
	}
	public void setMsCTD(String msCTD) {
		this.msCTD = msCTD;
	}
	
    public KhachHang(String hoten, String soNha, String msCTD) {
		
		this.hoten = hoten;
		this.soNha = soNha;
		this.msCTD = msCTD;
		
	}
	public void nhap()
    {
    	System.out.print("Ho ten chu ho:");
    	hoten=sn.nextLine();
    	System.out.print("So nha:"); soNha=sn.nextLine();
    	System.out.print("Ma so cong to dien:"); msCTD=sn.nextLine();
    	
    }
    public void xuat()
    {
    	System.out.println("Ho ten chu ho:"+hoten);
    	System.out.println("So nha:"+soNha);
    	System.out.println("Ma so cong to dien:"+msCTD);
    }
      
}
