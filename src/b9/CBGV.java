package b9;

public class CBGV extends Nguoi {
     private int luongcung;
     private int luongthuong;
     private int tienphat;
	public CBGV(String hoten, int tuoi, String quequan, String maGV, int luongcung, int luongthuong, int tienphat) {
		super(hoten, tuoi, quequan, maGV);
		this.luongcung = luongcung;
		this.luongthuong = luongthuong;
		this.tienphat = tienphat;
	}
	public CBGV() {
		super();
		
	}
	public int getLuongcung() {
		return luongcung;
	}
	public void setLuongcung(int luongcung) {
		this.luongcung = luongcung;
	}
	public int getLuongthuong() {
		return luongthuong;
	}
	public void setLuongthuong(int luongthuong) {
		this.luongthuong = luongthuong;
	}
	public int getTienphat() {
		return tienphat;
	}
	public void setTienphat(int tienphat) {
		this.tienphat = tienphat;
	}
	public void nhap()
	{
		super.nhap();
		System.out.print("Nhap luong cung:"); luongcung=sn.nextInt();
		sn.nextLine();
		System.out.print("Nhap luong thuong:"); luongthuong=sn.nextInt();
		sn.nextLine();
		System.out.print("Nhap luong phat:"); tienphat=sn.nextInt();
		sn.nextLine();
	}
	public void xuat()
	{
		super.xuat();
		System.out.println("Luong cung cua giang vien:"+luongcung);
		System.out.println("Luong thuong cua giang vien:"+luongthuong);
		System.out.println("Tien phat cua giang vien:"+tienphat);
	}
	public int luongthuc()
	{
		return luongcung+luongthuong-tienphat;
	}
	
     
}
