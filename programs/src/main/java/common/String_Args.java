package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * function(String firstName, String lastName, String DOB, String id) {

}
 */
public class String_Args {
 void str(String fname,String lname,String DOB,String id) throws ParseException {
	 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD");
	 	int id1=Integer.parseInt(id);
		 Date date = format.parse(DOB);
		 if(date==null) {
			 System.out.println(fname+" "+lname+" "+"not valid"+" "+id);
	 }
		 else
	 System.out.println(fname+" "+lname+" "+date+" "+ id1);
	 
 }
 
 public static void main(String[] args) throws ParseException {
	String_Args obj= new String_Args();
	obj.str("fini", "francis", "12-12-2010", "12");
	obj.str("anu","bonu","32-01-2020","12");
}
}
