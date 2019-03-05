package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If_else_if {

	public static void main(String[] args) throws  IOException {
		
		 BufferedReader s=new BufferedReader(new InputStreamReader(System.in));

		          System.out.println("Enter the value of a"); 
		          System.out.println("Enter the value of b");
		          System.out.println("Enter the value of c");
		 

		
			 int a;
			a = Integer.parseInt(s.readLine());
		     int b;
		     b = Integer.parseInt(s.readLine());
		     
		     int c;
		     c = Integer.parseInt(s.readLine());
	        if (a>=b&&a>=c)
	            
	        {
	            System.out.println("a is greater");
	        }   
	        else if (b>=c)
	        {
	            System.out.println("b is greater");
	        }
	                else
	        {
	          System.out.println("c is greater");           
	                    

	}

}
}