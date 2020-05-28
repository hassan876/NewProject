import java.util.Scanner;
import java.util.Stack;

public class ArrayStack {

	private int size;
	private int arrayStack[];
	private int top;
	public ArrayStack(int size, int[] arrayStack, int top) {
		this.size = size;
		this.arrayStack = new int[size];
		this.top = top;
	};
	
	
	public  boolean isEmpty()
	{
		if(arrayStack.length==0)
		{
			return true;
			
		}
		return false;
	}
	
	int i =0;
	public void push(int element)
	{
		
		if(isEmpty())
		{
			arrayStack[top] = element;
			top++;
		}
		else if(arrayStack.length== size-1)
		{
			System.out.println("Stack over flow");
			return;
		}else
		{
		if(top>size-1)
		{
			return;
		}else
		{
		arrayStack[top] = element;
		top++;
		}
		
		}
	}
	
	public void pop()
	{
		int value =0;
		top = arrayStack.length;
		int newTop = 0;
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			
		}
		top--;
		
		value = arrayStack[top];
		arrayStack[top] = value;
		top = top-1;
		newTop = arrayStack[top];
		arrayStack[top] = newTop;
	}
	
	public void display()
	{
			
	}
	
	public void FifioDisplay()
	{
	
		
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			
		}else {
			System.out.println("First stack Elements in FIFO order : ");
			for(int i =0;i<size/2;i++)
			{
				System.out.println("Stack elemsnt" + i + " is " + arrayStack[i]);
				
			}
			
			System.out.println("Second stack Elements in FIFO order  : ");
			int j =1;
			for(int i = size/2; i<=size-1;i++)
			{
				System.out.println("Stack elemsnt" + j + " is " + arrayStack[i]);
				j++;
				
			}
			
		}

	}
	
	static int evaluatePostfix(String exp) 
    { 
        //create a stack
		Stack<Integer> stack = new Stack<Integer>();
          
        // Scan all characters one by one 
        for(int i=0;i<exp.length();i++) 
        { 
            char c=exp.charAt(i); 
              
            // If the scanned character is an operand (number here), 
            // push it to the stack. 
            if(Character.isDigit(c)) 
            stack.push(c - '0'); 
              
            //  If the scanned character is an operator, pop two 
            // elements from stack apply the operator 
            else
            { 
                int val1 = stack.pop(); 
                int val2 = stack.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    stack.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    stack.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    stack.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    stack.push(val2*val1); 
                    break; 
              } 
            } 
        } 
        return stack.pop();     
    } 
	
	public void fictorial()
	{
		
		Scanner sc = new Scanner(System.in);
		int[] newArray = new int[5];
		System.out.println("Enter five elements for stack : ");
		
		for(int i=0;i<5;i++)
		{
			newArray[i] =  sc.nextInt();
		}
		
		

		  int j=0;
		  int number;//It is the number to calculate factorial  
		  while(j<newArray.length)
		  {
		  int fact = 1;
		  number=newArray[j];
		  for(int i=1;i<=number;i++){    
		      fact=fact*i;   
		  }
		  System.out.println("Factorial of "+number+"! is: "+fact);
		  j++;
		  }
		 
		 }  
	
	public void DecimalToBinary(int num)
	{
	 Stack<Integer> stk = new Stack<Integer>();


     while (num != 0)
     {
         int d = num % 2;
         stk.push(d);
         num /= 2;
     }        
     /* Print Binary equivalent */
     System.out.print("\nBinary equivalent = ");
     while (!(stk.isEmpty() ))
     {
         System.out.print(stk.pop());
     }
     System.out.println();
 }
	
	
	static boolean isOperand(char x) 
	{ 
	    return (x >= 'a' && x <= 'z') || 
	            (x >= 'A' && x <= 'Z'); 
	} 
	  
	// Get Infix for a given postfix 
	// expression 
	static String getInfix(String exp) 
	{ 
	    Stack<String> s = new Stack<String>(); 
	  
	    for (int i = 0; i < exp.length(); i++) 
	    { 
	        // Push operands 
	        if (isOperand(exp.charAt(i))) 
	        { 
	        s.push(exp.charAt(i) + ""); 
	        } 
	  
	        // We assume that input is 
	        // a valid postfix and expect 
	        // an operator. 
	        else
	        { 
	            String op1 = s.peek(); 
	            s.pop(); 
	            String op2 = s.peek(); 
	            s.pop(); 
	            s.push("(" + op2 + exp.charAt(i) + 
	                    op1 + ")"); 
	        } 
	    } 
	  
	    // There must be a single element 
	    // in stack now which is the required 
	    // infix. 
	    return s.peek(); 
	} 
	
	
	 static int Prec(char ch) 
	    { 
	        switch (ch) 
	        { 
	        case '+': 
	        case '-': 
	            return 1; 
	       
	        case '*': 
	        case '/': 
	            return 2; 
	       
	        case '^': 
	            return 3; 
	        } 
	        return -1; 
	    } 
	       
	    // The main method that converts given infix expression 
	    // to postfix expression.  
	    static String infixToPostfix(String exp) 
	    { 
	        // initializing empty String for result 
	        String result = new String(""); 
	          
	        // initializing empty stack 
	        Stack<Character> stack = new Stack<>(); 
	          
	        for (int i = 0; i<exp.length(); ++i) 
	        { 
	            char c = exp.charAt(i); 
	              
	             // If the scanned character is an operand, add it to output. 
	            if (Character.isLetterOrDigit(c)) 
	                result += c; 
	               
	            // If the scanned character is an '(', push it to the stack. 
	            else if (c == '(') 
	                stack.push(c); 
	              
	            //  If the scanned character is an ')', pop and output from the stack  
	            // until an '(' is encountered. 
	            else if (c == ')') 
	            { 
	                while (!stack.isEmpty() && stack.peek() != '(') 
	                    result += stack.pop(); 
	                  
	                if (!stack.isEmpty() && stack.peek() != '(') 
	                    return "Invalid Expression"; // invalid expression                 
	                else
	                    stack.pop(); 
	            } 
	            else // an operator is encountered 
	            { 
	                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
	                    if(stack.peek() == '(') 
	                        return "Invalid Expression"; 
	                    result += stack.pop(); 
	             } 
	                stack.push(c); 
	            } 
	       
	        } 
	       
	        // pop all the operators from the stack 
	        while (!stack.isEmpty()){ 
	            if(stack.peek() == '(') 
	                return "Invalid Expression"; 
	            result += stack.pop(); 
	         } 
	        return result; 
	    } 
	    	
	
	
	
}
