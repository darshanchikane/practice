package Week4Day1and2;

public class Enumm {
	
	enum level{
		BEGNNER,LOW,MEDIUM,HIGH,ADVANCED
	}
	
	public static void main(String [] args) {
		
		level l =level.ADVANCED;
		System.out.println(l);
		
		
		// enum in swtich statement 
//		System.out.println();
//		switch (l) {
//		
//		case BEGNNER:
//			System.out.println("This is BEGINNER");
//			break;
//		
//		case LOW:
//			System.out.println("This is LOW");
//			break;
//		
//		case MEDIUM:
//			System.out.println("This is MEDIUM");
//			break;
//		
//		case HIGH:
//			System.out.println("This is HIGH");
//			break;
//	
//		case ADVANCED:
//			System.out.println("This is ADVANCED");
//			break;
//			
//		default :
//			break;
//		
//		}
		
		// enum using for each loop
//		System.out.println();
//		for(level lev: level.values()) {
//			System.out.print(lev + " ");
//		}
		
	}

}
