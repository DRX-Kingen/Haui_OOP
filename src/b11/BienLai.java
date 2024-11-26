package b11;
import java.util.Scanner;
public class BienLai extends KhachHang{
	Scanner sn= new Scanner(System.in);
	private int soDienCu;
	private int soDienMoi;
	
	public BienLai(String hoten, String soNha, String msCTD, int soDienCu, int soDienMoi) {
		super(hoten, soNha, msCTD);
		this.soDienCu = soDienCu;
		this.soDienMoi = soDienMoi;
		
	}
	
	public int getSoDienCu() {
		return soDienCu;
	}

	public void setSoDienCu(int soDienCu) {
		this.soDienCu = soDienCu;
	}

	public int getSoDienMoi() {
		return soDienMoi;
	}

	public void setSoDienMoi(int soDienMoi) {
		this.soDienMoi = soDienMoi;
	}

	public void nhap()
	{
		super.nhap();
		System.out.print("So dien cu:"); soDienCu=sn.nextInt();
		sn.nextLine();
		System.out.print("So dien moi:");soDienMoi=sn.nextInt();
		sn.nextLine();
		
	}
	public void xuat()
	{
		super.xuat();
		System.out.println("So dien cu:"+soDienCu);
		System.out.println("So dien moi:"+soDienMoi);
	}
	public int tienDien()
	{
		return (soDienMoi-soDienCu)*5;
	}
	

}
