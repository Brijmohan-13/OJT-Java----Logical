package June07_Swapping_ProfitLoss_GrossSalary_DecideChar;

import java.util.Scanner;

public class Profit_Loss {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Cost Price");
		int cprice=sc.nextInt();
		
		System.out.println("Enter Selling Price");
		int sprice=sc.nextInt();
		
		if(cprice<sprice)
		{
			int status=sprice-cprice;
			System.out.println("Your Profit is "+status);
		}
		
		else if(cprice>sprice)
		{
			int status=cprice-sprice;
			System.out.println("Your Loss is "+status);
		}
			else 
		{
				System.out.println("No Profit No Loss");
		}
		}// main ends here
		
	}
