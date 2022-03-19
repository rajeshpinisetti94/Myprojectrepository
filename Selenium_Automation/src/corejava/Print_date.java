package corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Print_date {
	
	
 public static void main(String[] args) {
	
	 Date d= new Date();
	 
	 System.out.println(d);
	 
	 DateFormat m= new SimpleDateFormat("dd MM yyyy_ HH mm");
     
	 
	 String time=m.format(d);
	 System.out.println(time);
			 
}
}
