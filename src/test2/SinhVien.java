package test2;

public class SinhVien implements Comparable<SinhVien>{
      private String maSv;
      private String hoten;
      private String lop;
      private double diem;
	public String getMaSv() {
		return maSv;
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
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
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	public SinhVien(String maSv, String hoten, String lop, double diem) {
		super();
		this.maSv = maSv;
		this.hoten = hoten;
		this.lop = lop;
		this.diem = diem;
	}
	public int compareTo(SinhVien o)
	{
		return Double.compare(this.diem, o.diem);
	}
      
}
