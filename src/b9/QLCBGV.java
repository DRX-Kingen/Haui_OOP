package b9;
import java.util.Scanner;
public class QLCBGV {
     public static void main(String [] args)
     {
    	 Scanner sn=new Scanner(System.in);
    	  DSCBGV dscbgv= new DSCBGV();
    	  while(true)
    	  {
    		  System.out.println("1.Them giang vien.");
    		  System.out.println("2.Xoa giang vien.");
    		  System.out.println("3.Hien thi danh sach.");
    		  System.out.println("4.Thoat chuong trinh.");
    		  int chon=sn.nextInt();
    		  sn.nextLine();
    		  switch (chon)
    		  {
    		  case 1:
    			  CBGV cbgv=new CBGV();
    			  dscbgv.them(cbgv);
    			  break;
    		  case 2:
    			  String magv=sn.nextLine();
    			  dscbgv.xoa(magv);
    			  break;
    		  case 3:
    			  System.out.println("Hien thi danh sach:");
    			  dscbgv.hienthids();
    			  break;
    		  case 4:
    			  System.out.println("Ket thuc chuong trinh.");
    			  System.exit(0);
    		  }
    	  }
     }
}
