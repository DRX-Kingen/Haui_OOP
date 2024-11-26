package b10;
import java.util.Scanner;
public class SinhVien {
      private String hoten;
      private String lop;
      private int tuoi;
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public SinhVien(String hoten, String lop, int tuoi) {
	
		this.hoten = hoten;
		this.lop = lop;
		this.tuoi = tuoi;
	}
	public SinhVien() {
		this.hoten = "NULL";
		this.lop = "NULL";
		this.tuoi = 0;
		
	}
	Scanner sn=new Scanner(System.in);
	public void nhap()
	{
		
		System.out.print("Nhap ho ten:"); hoten=sn.nextLine();
		System.out.print("Nhap ten lop:"); lop=sn.nextLine();
		System.out.print("Nhap tuoi:"); tuoi=sn.nextInt();
		sn.nextLine();
	}
	public void xuat()
	{
		System.out.println("Ho ten:"+hoten);
		System.out.println("Lop:"+lop);
		System.out.println("Tuoi"+tuoi);
	}
	
      
}
