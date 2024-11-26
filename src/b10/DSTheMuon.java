package b10;
import java.util.ArrayList;
import java.util.Scanner;
public class DSTheMuon {
       ArrayList <TheMuon> arr=new ArrayList <>();
       public void them(TheMuon tm)
       {
    	   tm.nhap();
    	   arr.add(tm);
       }
      
       public void xoa(String maphieumuon)
       {
    	   
    	 for(int i=0;i<arr.size();i++)
    	 {
    		 if(arr.get(i).getMaPM().equalsIgnoreCase(maphieumuon))
    		 {
    			 arr.remove(i);
    		 }
    	 }
       }
       public void hienthids()
       {
    	   for(TheMuon tm: arr)
    	   {
    		   tm.xuat();
    	   }
       }
}
