package program;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EvenOdd {

	public static void main(String[] args) {
		
		 BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the value of a");
		 

		try {
			 int a;
			a = Integer.parseInt(s.readLine());
		
		   
        if (a%2==0)
        {
          System.out.print("Number is even");
          
        }
        else
        {
            System.out.print("Number is odd");
        }
        
		}
        
        catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
        

	}

}

