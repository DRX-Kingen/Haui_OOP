package b9;
import java.util.ArrayList;
public class DSCBGV {
     ArrayList <CBGV> cbgv=new ArrayList<>();
     public void them(CBGV gv)
     {
    	 gv.nhap();
    	 cbgv.add(gv);
     }
     public void xoa(String magv)
     {
    	 for(int i=0;i<cbgv.size();i++)
    	 {
    		 if(cbgv.get(i).getMaGV().equalsIgnoreCase(magv))
    		 {
    			 cbgv.remove(i);
    		 }
    	 }
     }
     public void hienthids()
     {
    	 for(CBGV gv: cbgv)
    	 {
    		 gv.xuat();
    		 System.out.println(gv.luongthuc());
    	 }
     }
     
}
