package bt2;
import java.util.Scanner;
import java.util.ArrayList;
public class QLCanBo {
     ArrayList <CanBo> dscanbo= new ArrayList<>();
     public void themcanbo(CanBo canbo)
     {
    	 dscanbo.add(canbo);
    	 
     }
     public void timkiem(String hoten)
     {
    	 boolean check =false;
    	 for(CanBo canbo: dscanbo)
    	 {
    		 if(canbo.getHoten().equalsIgnoreCase(hoten))
    		 {
    			 canbo.hienthithongtin();
    			 check=true;
    		 } 
    	 }
    	 if(check==false)
    	 {
    		 System.out.println("Khong co thong tin can bo.");
    	 }
    	 
     }
     public void hienthidanhsach()
     {
    	 for(CanBo canbo:dscanbo)
    	 {
    		canbo.hienthithongtin(); 
    	 }
     }
     public void thoatct()
     {
    	 System.out.println("Ket thuc chuong trinh");
    	 System.exit(0);
     }
    public static void main(String [] args)
    {
    	QLCanBo qlcb= new QLCanBo();
    	Scanner sn=new Scanner(System.in);
    	String hoten, gioitinh, diachi;
    	int tuoi;
    	boolean kt =true;
    	while(kt==true)
    	{
    		System.out.println("1.Them can bo");
        	System.out.println("2.Tim kiem can bo");
        	System.out.println("3.Hien thi thong tin danh sach");
        	System.out.println("4.Thoat chuong trinh");
        	
        	int chon;
        	chon=sn.nextInt();
        	sn.nextLine();
    		switch (chon)
    		{
    		case 1:
    			System.out.print("Nhap loai can bo(1.Cong nhan,2.Ky su,3.Nhan vien):");
    			int loai;
    			loai=sn.nextInt();
    			sn.nextLine();
    			System.out.print("Ho ten:"); hoten=sn.nextLine();
    			System.out.print("Tuoi:"); tuoi=sn.nextInt();sn.nextLine();
    			System.out.print("Gioi tinh:"); gioitinh=sn.nextLine();
    			System.out.print("Dia chi:"); diachi=sn.nextLine();
    			if(loai==1)
    			{
    				int bac;
    				System.out.print("Nhap so bac cua cong nhan:");
    				bac=sn.nextInt();
    				qlcb.themcanbo(new CongNhan(hoten,tuoi,gioitinh,diachi,bac));
    				
    			} else
    			     {
    				     if(loai==2)
    				     {
    				    	 String nganhdaotao;
    				    	 System.out.print("Nganh dao tao:"); nganhdaotao=sn.nextLine();
    				    	 qlcb.themcanbo(new KySu(hoten,tuoi,gioitinh,diachi,nganhdaotao));
    				    	 
    				     } else
    				          {
    				    	      String congviec;
    				    	      System.out.print("Cong viec:"); congviec=sn.nextLine();
    	    				    	 qlcb.themcanbo(new NhanVien(hoten,tuoi,gioitinh,diachi,congviec));
    				    	      
    				          }
    			     }
    			break;
    		case 2:
    			String tencanbo;
    			System.out.print("Nhap ten can bo:");
    			tencanbo=sn.nextLine();
    			qlcb.timkiem(tencanbo);
                break;
    		case 3:
    			qlcb.hienthidanhsach();
    			break;
    		case 4:
    			
    			qlcb.thoatct();
    			break;
    		}
    			
    	}
    }
     
}
