import java.util.Scanner;

public class AssertionExample {
	public static void main( String args[] ){  

		Scanner scanner = new Scanner( System.in );  
		System.out.print("Enter ur age ");  

		int value = scanner.nextInt();  
		assert value>=13:" Not valid";  

		System.out.println("value is "+value); 
		scanner.close();
	}   
}
