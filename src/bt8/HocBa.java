package bt8;

import java.util.Scanner;
public class HocBa extends HocSinh implements Comparable <HocBa> {
       
       protected String lop;
       protected float diemtk;
	public HocBa(String hoten, String quequan, int tuoi, String lop ,float diemtk) {
		super(hoten, quequan, tuoi);
		this.diemtk = diemtk;
		this.lop = lop;
	}
	
	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public float getDiemtk() {
		return diemtk;
	}

	public void setDiemtk(float diemtk) {
		this.diemtk = diemtk;
	}

	public HocBa() {
		
	}
	Scanner sn= new Scanner(System.in);
	public void nhap()
	{
		super.nhap();
		System.out.print("Nhap ten lop:"); lop=sn.nextLine();
		System.out.print("Nhap diem tk:"); diemtk=sn.nextFloat();
		sn.nextLine();
	}
	public void xuat()
	{
		super.xuat();
		System.out.println("Ten lop:"); 
		System.out.println("Diem tk:"+diemtk); 
		
	}
	public int compareTo(HocBa o) {
        return Float.compare(this.diemtk, o.diemtk);
    }
	
       
}
