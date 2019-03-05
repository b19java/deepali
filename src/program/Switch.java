package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Switch {
	
	
	public static void main(String[]args) throws IOException {
		int weekday ;
		 BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the your choice");
		 weekday = Integer.parseInt(s.readLine());
		
		switch(weekday)
		
		{
		case 1: System.out.println("its monday" );
		break;
		case 2: System.out.println("its tuesday" );
		break;
		case 3: System.out.println("its wednesday" );
		break;
		case 4: System.out.println("its thursday" );
		break;
		case 5: System.out.println("its friday" );
		break;
		case 6: System.out.println("its saturday" );
		break;
		case 7: System.out.println("its sunday" );
		break;

	
		
		
		}
	}
	

}
