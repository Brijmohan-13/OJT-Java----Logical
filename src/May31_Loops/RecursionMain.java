package May31_Loops;

import java.io.IOException;
import java.util.Scanner;

public class RecursionMain {
	
		public static void main(String[] args) throws IOException {
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number");
		
		int month=sc.nextInt();
		
				switch(month)
				{
				case 1:
					System.out.println("Number od day in 1st month are : 31");
					break;
				case 2:
					System.out.println("Number od day in 2nd month are : 28/29");
					break;
				case 3:
					System.out.println("Number od day in 3rd month are : 30");
					break;
				case 4:
					System.out.println("Number od day in 4th month are : 31");
					break;
					
				default :
		 			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");      //java.lang.Runtime.gettime.excec();  this method launches the executable .exec apps 
					System.exit(0);         //terminates program/JVM.....java.lang.System.main();
					break;
				}
		main(null);
	}
}
// .exe means executable files