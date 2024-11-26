package b11;
import java.util.ArrayList;
import java.util.Scanner;
public class QLTienDien {
     
     ArrayList <BienLai> qltiendien=new ArrayList<>();
    
     public void them(BienLai bl)
     {
    	 qltiendien.add(bl);
    	
     }
     public void xoasua(String chuho)
     {
    	 boolean check=false;
    	 for(BienLai bl:qltiendien)
    	 {
    		 if(bl.getHoten().equalsIgnoreCase(chuho))
    		 {
    			 bl.nhap();
    			 check=true;
    		 }
    	 }
    	 if(check==false)
    	 {
    		 System.out.println("Khong co ten chu ho nay.");
    	 }
     }
     public void hienthids()
     {
    	 for(BienLai bl: qltiendien)
    	 {
    		 bl.xuat();
    		 System.out.println("Tien dien phai tra:"+bl.tienDien());
    	 }
     }
     public static void main(String[] args)
     {
    	 QLTienDien qltd=new QLTienDien();
    	 Scanner sn=new Scanner(System.in);
    	 String soNha, hoten, msCTD;
    	 int soDienCu,soDienMoi;
    	while(true)
    	{
    		System.out.println("Chon cac phuong thuc:");
    		System.out.println("1.Them bien lai");
    		System.out.println("2.Xoa, sua bien lai");
    		System.out.println("3.Hien thi danh sach");
    		System.out.println("4.Thoat chuong trinh");
    		int chon=sn.nextInt();
    		sn.nextLine();
    		switch (chon)
    		{
    		case 1:
    			System.out.print("Ho ten chu ho:");
    	    	hoten=sn.nextLine();
    	    	System.out.print("So nha:"); soNha=sn.nextLine();
    	    	System.out.print("Ma so cong to dien:"); msCTD=sn.nextLine();
    	    	System.out.print("So dien cu:"); soDienCu=sn.nextInt();
    			sn.nextLine();
    			System.out.print("So dien moi:");soDienMoi=sn.nextInt();
    			sn.nextLine();
    			qltd.them(new BienLai(hoten,soNha,msCTD,soDienCu,soDienMoi));
    	    	break;
    		
    		case 2:
    			String tenchuho=sn.nextLine();
    			qltd.xoasua(tenchuho);
    			break;
    		case 3:
    			qltd.hienthids();
    			break;
    		case 4:
    			System.out.println("Thoat chuong trinh.");
    			System.exit(0);
    			break;
    			
    			
    	}
    	 
     }
     
	
}
}
