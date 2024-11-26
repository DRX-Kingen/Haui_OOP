package b10;
import java.util.Scanner;
public class TheMuon extends SinhVien{
	private String maPM;
	private String ngayMuon;
	private String hanTra;
	private String soHieuSach;
	
	public String getMaPM() {
		return maPM;
	}
	public void setMaPM(String maPM) {
		this.maPM = maPM;
	}
	public String getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(String ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
	public String getHanTra() {
		return hanTra;
	}
	public void setHanTra(String hanTra) {
		this.hanTra = hanTra;
	}
	public String getSoHieuSach() {
		return soHieuSach;
	}
	public void setSoHieuSach(String soHieuSach) {
		this.soHieuSach = soHieuSach;
	}
	public TheMuon(String hoten, String lop, int tuoi, String maPM, String ngayMuon, String hanTra, String soHieuSach) {
		super(hoten, lop, tuoi);
		this.maPM = maPM;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.soHieuSach = soHieuSach;
	}
	public TheMuon() {
		super();
		this.maPM = "NULL";
        this.ngayMuon = "NULL";
		this.hanTra = "NULL";
		this.soHieuSach = "NULL";
		}
	Scanner sn=new Scanner(System.in);
	public void nhap()
	{
		super.nhap();
		System.out.print("Nhap ma phieu muon:"); maPM=sn.nextLine();
		System.out.print("Nhap ngay muon:"); ngayMuon=sn.nextLine();
		System.out.print("Nhap han tra:"); hanTra=sn.nextLine();
		System.out.print("Nhap so hieu sach:"); soHieuSach=sn.nextLine();
		
	}
	public void xuat()
	{
		super.xuat();
		System.out.println("Ma phieu muon:"+maPM);
		System.out.println("Ngay muon:"+ngayMuon);
		System.out.println("Han tra:"+hanTra);
		System.out.println("So hieu sach:"+soHieuSach);
	}
	
	

}
