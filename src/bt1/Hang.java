package bt1;
import java.util.Scanner;
public class Hang {
	Scanner sn=new Scanner(System.in);
     private String tenhang;
     private int soluong, dongia;
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getDongia() {
		return dongia;
	}
	public void setDongia(int dongia) {
		this.dongia = dongia;
	}
	public Hang()
	{
		this.tenhang = "NULL";
		this.soluong = 0;
		this.dongia = 0;
	}
	public Hang(String tenhang, int soluong, int dongia) {
		
		this.tenhang = tenhang;
		this.soluong = soluong;
		this.dongia = dongia;
	}
	public void nhap()
	{
		System.out.print("Nhap ten hang:");this.tenhang=sn.nextLine();
		System.out.print("Nhap so luong:");this.soluong=sn.nextInt();
		System.out.print("Nhap don gia:"); this.dongia=sn.nextInt();
		
	}
	public int tongtien()
	{
		return soluong*dongia;
	}
	
	public void inDL()
	{
		System.out.printf("%-15s%-10d%-10d%-10d\n",tenhang,soluong,dongia,tongtien());
		
	}
	public static void intieude()
	{
		System.out.printf("%-15s%-10s%-10s%-10s\n","Ten hang","So luong","Don gia","Tong tien");
		
	}
     
}
