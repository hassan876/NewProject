import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size =0;
		System.out.println("Enter the array size  for two Stacks");
		size = sc.nextInt();
		ArrayStack stack = new ArrayStack(size, null, 0);
		
		System.out.println("Enter elements for first Stack");
		for(int i =0; i<size/2; i++)
		{
		System.out.println("Enter " + i +" element");
		stack.push(sc.nextInt());
		}
		
		System.out.println("Enter elements for second Stack");
		for(int i = size/2; i<=size-1; i++)
		{
		System.out.println("Enter " + i +" element");
		stack.push(sc.nextInt());
		}
		
		
		stack.pop();
		
		System.out.println("\n\n\t**** DISPLAY IN FIFO ****\n");
		stack.FifioDisplay();
		System.out.println("\n\n\t**** DISPLAY FACTORIAL ****\n");

		stack.fictorial();
		
		System.out.println("\n\n\t**** EVALUATE POSTFIX EXPRESSION ****");
		System.out.println("Enter the expression to evaluate : ");
		sc.nextLine();
        System.out.println("postfix evaluation: "+ArrayStack.evaluatePostfix(sc.nextLine()));
        
        
        System.out.println("\n\n\t**** DECIMAL TO BINARY  ****\n");
   	    System.out.println("Enter decimal number");
   	    stack.DecimalToBinary(sc.nextInt());
     
   	    
   	 System.out.println("\n\n\t**** EVALUATE POSTFIX EXPRESSION ****"); 
	
	 System.out.println("Expression : ");
	 String exp = "45+36*-32^+82/3*-57*+"; 
	 System.out.println(ArrayStack.getInfix(exp)); 
	 exp = "(-3)96-^62/5*+73%-";
	 System.out.println(ArrayStack.getInfix(exp)); 
	 exp = "51+96*%79+*";
	 System.out.println(ArrayStack.getInfix(exp)); 
	 
	 
   	 System.out.println("\n\n\t**** EVALUATE INFIX TO POSTFIX EXPRESSION ****");
	 String exp1 = " A+((B-C)*(D-E)+F/G)^(R-T)"; 
     System.out.println(ArrayStack.infixToPostfix(exp1)); 
     exp1 = "A*(B+D)/F-E*(G+H/K)"; 
     System.out.println(ArrayStack.infixToPostfix(exp1)); 
     exp1 = "(A+B)/D^(E-F)*G"; 
     System.out.println(ArrayStack.infixToPostfix(exp1)); 
     exp1 = "A*(B+C^D)-E^F*(G/H)"; 
     System.out.println(ArrayStack.infixToPostfix(exp1)); 

		}

}
