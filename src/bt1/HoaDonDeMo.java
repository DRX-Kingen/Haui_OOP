package bt1;

public class HoaDonDeMo {
	  public static void main(String[] args) {
	        HoaDon hoaDon = new HoaDon();

	        // Nhập thông tin hóa đơn
	        hoaDon.nhap();

	        // Hiển thị hóa đơn trước khi sắp xếp
	        System.out.println("\nHóa đơn trước khi sắp xếp:");
	        hoaDon.inHD();

	        // Sắp xếp danh sách hàng hóa theo thành tiền giảm dần
	        hoaDon.sapXep();

	        // Hiển thị hóa đơn sau khi sắp xếp
	        System.out.println("\nHóa đơn sau khi sắp xếp:");
	        hoaDon.inHD();
	    }
}
