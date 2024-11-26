package b9;
import java.util.Scanner;
public class Nguoi {
       private String hoten;
       private int tuoi;
       private String quequan;
       private String maGV;
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getQuequan() {
		return quequan;
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public String getMaGV() {
		return maGV;
	}
	public void setMaGV(String maGV) {
		this.maGV = maGV;
	}
	public Nguoi(String hoten, int tuoi, String quequan, String maGV) {
		
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.quequan = quequan;
		this.maGV = maGV;
	}
	public Nguoi() {
		this.hoten = "NULL";
		this.tuoi =0;
		this.quequan = "NULL";
		this.maGV = "NULL";
		
		}
	Scanner sn=new Scanner(System.in );
	public void nhap()
	{
		System.out.print("Nhap ho ten:"); hoten=sn.nextLine();
		System.out.print("Nhap tuoi:"); tuoi=sn.nextInt();
		sn.nextLine();
		System.out.print("Nhap que quan:"); quequan=sn.nextLine();
		System.out.print("Nhap ma giang vien:");maGV=sn.nextLine();
	}
	public void xuat()
	{
		System.out.println("Ho ten:"+hoten);
		System.out.println("Tuoi:"+tuoi);
		System.out.println("Que quan:"+quequan);
		System.out.println("Ma giang vien:"+maGV);
	}
	
    
}
