package bt8;
import java.util.Scanner;
public class HocSinh {
     protected String hoten;
     protected String quequan;
     protected int tuoi;
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public HocSinh(String hoten, String quequan, int tuoi) {
		
		this.hoten = hoten;
		this.quequan = quequan;
		this.tuoi = tuoi;
	}
	public HocSinh() {
		
	}
	Scanner sn=new Scanner (System.in);
	public void nhap()
	{
		System.out.print("Nhap ho ten:"); hoten=sn.nextLine();
		System.out.print("Nhap tuoi:"); tuoi=sn.nextInt();
		sn.nextLine();
		System.out.print("Nhap que quan:"); quequan=sn.nextLine();
		
	}
	public void xuat()
	{
		System.out.println("Ho ten:"+hoten);
		System.out.println("Tuoi hs:"+tuoi);
		System.out.println("Que quan:"+quequan);
	}
	
     
}
