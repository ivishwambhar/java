
// Java program to convert String to ArrayList
package arraylistexm;

import java.util.ArrayList;
import java.util.Arrays;

public class StrToAl2 {

	public static void main(String[] args) {
		
		 String str = "Vishwa";
		 
	        String[] strSplit = str.split("");// split string by no space
	        System.out.println(str);
	  
	        //convert string into ArrayList
	        ArrayList<String> strList = new ArrayList<String>(
	            Arrays.asList(strSplit));
	        for (String s : strList)
	            System.out.println(s);
	}
}
