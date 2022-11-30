package arraylistexm;

import java.util.ArrayList;
import java.util.Arrays;

public class StringAL {

	public static void main(String[] args) {
		ArrayList<String> ename= new ArrayList<>();
		ename.add("Rahul");
		ename.add("Rinku");
		ename.add("Sayama");
		ename.add("xyz");
		System.out.println("Employee NAme:"+ ename);
		System.out.println(ename.add("rajni")); //true
		System.out.println(ename);
		
		Object arr= ename.toArray();
		 System.out.println("Elements of ArrayList"
                 + " as Array: "
                 + Arrays.toString(args));
		//System.out.println(ename.toString());
		System.out.println(ename.size());
		System.out.println(ename.remove(0));
		System.out.println(ename);
	}

}
