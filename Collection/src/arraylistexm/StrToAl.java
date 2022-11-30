
// Java program to convert String to ArrayList
package arraylistexm;

import java.util.ArrayList;
import java.util.Arrays;

public class StrToAl {

	public static void main(String[] args) {
		
		 String arr[] = {"Vishwa", "rama", "sama"};
	  
	        // convert string into ArrayList
	        ArrayList<String> arrList = new ArrayList<String>(
	            Arrays.asList(arr));
	        
	            System.out.println(arrList);
	            arrList.add("abc");
	            System.out.println(arrList);
	            System.out.println(arrList.get(2));
	            arrList.remove(0);
	            System.out.println(arrList);
	            arrList.add(2,"nrajani");
	            System.out.println(arrList);
	            arrList.remove("abc");
	            System.out.println(arrList);
	            arrList.remove(0);
	            System.out.println(arrList);
	            System.out.println(arrList.size());
	            arrList.clear();
	            System.out.println(arrList);
	}
}
