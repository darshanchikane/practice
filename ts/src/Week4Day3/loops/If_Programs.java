package Week4Day3.loops;

public class If_Programs {

	public static void main(String[] args) {
		
// 		To find greater number using if 
//		int x=5;
//		int y=10;
//		
//		if(x>y)
//		{
//			System.out.println("X is greater");
//		}
//		else
//		{
//			System.out.println("Y is greater");
//		}
		
		// Greatest of 3 numbers using else if
		int x = 5;
		int y = 10;
		int z = 15;
		
		if(x>y && x>z)
		{
			System.out.println("x is greater");
		}
		else if(y>x && y>z) {
			System.out.println("y is greater");
		}
		else {
			System.out.println("z is greater");
		}
		

	}

}
