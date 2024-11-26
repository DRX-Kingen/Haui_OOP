package bt8;
import java.util.ArrayList;
import java.util.Collections;
public class DSHS  {
     ArrayList <HocBa> dshb =new ArrayList<>();
     
     public void them(HocBa hb)
     {
    	 hb.nhap();
    	 dshb.add(hb);
    	 
     }
     public void hienthi20()
     
     {
         for(HocBa hb: dshb)
         {
        	 if(hb.getTuoi()==20)
        	 {
        		 hb.xuat();
        	 }
         }
     }
     public void hienthids()
     {
    	 for(HocBa hb: dshb)
         {
        	 hb.xuat();
         }
     }
     public void sx()
     {
    	 Collections.sort(dshb);
     }
     
}
