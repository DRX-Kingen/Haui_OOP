package b10;
import java.util.Scanner;
public class QLTheMuon {
	public static void main(String [] args)
	{
		 DSTheMuon dstm= new DSTheMuon();
	      Scanner sn=new Scanner(System.in);
	      while(true)
	      {
	    	  System.out.println("1.Them the muon.");
	    	  System.out.println("2.Xoa the muon.");
	    	  System.out.println("3.Hien thi danh sach the muon.");
	    	  System.out.println("4.Thoat chuong trinh.");
	    	  int chon=sn.nextInt();
	    	  sn.nextLine();
	    	  switch (chon) 
	    	  {
	    	    case 1:
	    	    	TheMuon tm=new TheMuon();
	    	    	dstm.them(tm);
	    	    	break;
	    	    case 2:
	    	    	String mathemuon=sn.nextLine();
	    	    	dstm.xoa(mathemuon);
	    	    	break;
	    	    case 3:
	    	    	dstm.hienthids();
	    	    	break;
	    	    case 4:
	    	    	System.out.println("Ket thuc chuong trinh.");
	    	    	System.exit(0);
	    	    	
	    	  } 
	    		  
	    			  
	    	  
	      }
	}
     
}
