package June07_Swapping_ProfitLoss_GrossSalary_DecideChar;

import java.util.Scanner;

//Program for Gross Salary of Employee

public class GrossSalary {
	public static void main(String[] args) {
		
		double basic,da,hra;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary :");
		 basic=sc.nextDouble();
		
		if(basic <=10000)
		{
			 da=0.8*basic;
			 hra=0.2*basic;
		}
		
		else if(basic <=20000)
		{
			 da=0.9*basic;
			 hra=0.25*basic;
		}
	
		else 
		{
			 da=0.95*basic;
			 hra=0.35*basic;
		}
		
		double gross=basic+da+hra;
		System.out.println("Gross Salary of Employee :"+gross);
		
	}// main ends here

}
