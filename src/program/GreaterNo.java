package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GreaterNo {

	public static void main(String[] args) throws  IOException {
		
		 BufferedReader s=new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter the value of a"); 
         System.out.println("Enter the value of b");
         int a;
         a = Integer.parseInt(s.readLine());
	     int b;
	     b = Integer.parseInt(s.readLine());
	     if(a>b)
	     {
	    	 System.out.println("a is greater");
	     }
	     else
	     {
	    	 System.out.println("b is greater");
	     }
         
         
         
	}

}
