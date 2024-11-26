package bt8;
import java.util.Scanner;
public class QLHB {
    public static void main(String [] args)
    {
    	Scanner sn=new Scanner(System.in);
    	DSHS dshs=new DSHS();
    	while(true)
    	{
    		System.out.println("1.Them hoc sinh.");
    		System.out.println("2.Hien thi danh sach hoc sinh 20 tuoi.");
    		System.out.println("3.Hien thi danh sach da sap xep theo diem tk.");
    		System.out.println("4.Thoat chuong trinh.");
    		int chon=sn.nextInt();
    		sn.nextLine();
    		switch(chon)
    		{
    		case 1:
    			HocBa hb =new HocBa();
    			dshs.them(hb);
    			break;
    		case 2:
    			dshs.hienthi20();
    			break;
    		case 3:
    			dshs.sx();
    			dshs.hienthids();
    			break;
    		case 4: 
    			System.out.println("Thoat chuong trinh.");
    			System.exit(0);
    		}
    	}
    }
    	
    }

    	

