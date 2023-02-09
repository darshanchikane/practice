package Week4Day1and2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Array {

	public static void main(String[] args) {
	
	// Array using array initializer
	String [] s1 = {"michael","john","mark","david"};
	System.out.println(s1[0]);
	
	System.out.println(s1.length);
	
	// Array using new keyword
//		String s2[] = new String[3];
//		s2[0]="elon";
//		s2[1]="drew";
//		s2[2]="ray";
//		for(String i:s2) {
//			System.out.print(i + " ");
//		}
	
	ArrayList<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	
	
	System.out.println(list.get(1));
	
   List<Integer> newlist = list.stream().filter(i->i==20).collect(Collectors.toList());
	System.out.print(newlist);
	
	
	}

}
