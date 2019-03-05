package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {

	public static void main(String[] args) throws  IOException {
		 BufferedReader s=new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter the value of num"); 
        
		


		        int num ;
		        num = Integer.parseInt(s.readLine());
		        boolean flag = false;
		        for(int i = 2; i <= num/2; ++i)
		        {
		            
		            if(num % i == 0)
		            {
		                flag = true;
		                break;
		            }
		        }

		        if (!flag)
		            System.out.println(num + " is a prime number.");
		        else
		            System.out.println(num + " is not a prime number.");
		    }
		
	

}
