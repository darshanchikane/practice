package Week4Day3.loops;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
	
//		 we can create a stream using 2 methods 
//		 Stream s1 = Stream.of(1,2,3,4);
		
//		 ArrayList<Integer> a = new ArrayList<>();
//       a.add(10); a.add(20);
//		 Stream s2 = a.Stream();
		
//		List<String> list = Arrays.asList("abcd","ef","pqr","xyz","ghijk");
//		long empty = list.stream().filter(e->e.isEmpty()).count();
//		System.out.printf("list %s has %d empty strings %n",list,empty);
//		
//		long length = list.stream().filter(e->e.length()>3).count();
//		System.out.printf("list %s has %d string of length more than 3 %n",list,length);
//		
//		long start = list.stream().filter(e->e.startsWith("a")).count();
//		System.out.printf("list %s has %d string starting with a %n",list,start);
//		
//		String upper = list.stream().map(e->e.toUpperCase()).collect(Collectors.joining(", "));
//		System.out.println("list is converted to upper case : " + upper);
		
		List<Integer> list = Arrays.asList(2,3,5,7,9,3);
		List<Integer> distinct = list.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
		IntSummaryStatistics stats = list.stream().mapToInt(x->x).summaryStatistics();
		System.out.println("Summary statistics are : " + stats);
		
	}

}
