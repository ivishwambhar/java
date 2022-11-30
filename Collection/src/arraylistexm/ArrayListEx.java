package arraylistexm;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		//al.removeAll(al);
		System.out.println(al);
		al.add("M");
		System.out.println(al);
		al.add(2, "N");
		System.out.println(al);
	}

}
