package bt1;
import java.util.Scanner;
public class HoaDon {
     private String soHD,ngayHD;
     private int soMatHang;
     private KhachHang kh=new KhachHang();
     private Hang dsHang[];
     private int tongtienhang=0;
     Scanner sc = new Scanner(System.in);
    	 public void nhap() {
    	        

    	        System.out.print("Nhập số hóa đơn: ");
    	        soHD = sc.nextLine();
    	        System.out.print("Nhập ngày hóa đơn: ");
    	        ngayHD = sc.nextLine();

    	        
    	        kh.nhap();

    	        System.out.print("Nhập số mặt hàng: ");
    	        soMatHang = sc.nextInt();
    	        dsHang = new Hang[soMatHang];

    	        
    	        for (int i = 0; i < soMatHang; i++) {
    	            System.out.println("Nhập thông tin cho mặt hàng thứ " + (i + 1) + ":");
    	            dsHang[i] = new Hang();
    	            dsHang[i].nhap();
    	            tongtienhang += dsHang[i].tongtien();
    	        }
    	    }

    	    
    	    public void inHD() 
    	    {
    	        System.out.println("\nHÓA ĐƠN BÁN HÀNG");
    	        System.out.println("Số hóa đơn: " + soHD);
    	        System.out.println("Ngày hóa đơn: " + ngayHD);
    	        System.out.println(kh.toString());
    	        System.out.println("\nDanh sách hàng:");
    	        Hang.intieude();
    	        for (Hang hang : dsHang) {
    	            hang.inDL();
    	        }
    	        System.out.printf("\nTổng tiền: %d\n", tongtienhang);
    	    
    	    }
    	        public void sapXep() {
    	        for (int i = 0; i < soMatHang - 1; i++) {
    	            for (int j = i + 1; j < soMatHang; j++) {
    	                if (dsHang[i].tongtien() < dsHang[j].tongtien()) {
    	                    Hang temp = dsHang[i];
    	                    dsHang[i] = dsHang[j];
    	                    dsHang[j] = temp;
    	                
    	                }
    	            }
    	        }
    	    }
    	    
    	}

     

