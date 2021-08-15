package June08_FrequncyOfNumber_TotalNumberOfNotes_SumOfFirst3Numbers;

import java.util.Scanner;

//For loop/while loop is not use here
public class TotalNumberOfNotes {
	
	///amount--2548...take any example while imagination
	
	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount :");
		int amount=sc.nextInt();
		
		int n2000=0,n1000=0,n500=0,n200=0,n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;
		
		if(amount>=2000)
		{
			n2000=amount/2000;        //*********** %  and /
			amount=amount%2000;
		}
		if(amount>=1000)
		{
			n1000=amount/1000;
			amount=amount%1000;
		}
		if(amount>=500)
		{
			n500=amount/500;
			amount=amount%500;
		}
		if(amount>=200)
		{
			n200=amount/200;
			amount=amount%200;
		}
		if(amount>=100)
		{
			n100=amount/100;
			amount=amount%100;
		}
		if(amount>=50)
		{
			n50=amount/50;
			amount=amount%50;
		}
		if(amount>=20)
		{
			n20=amount/20;
			amount=amount%20;
		}
		if(amount>=10)
		{
			n10=amount/10;
			amount=amount%10;
		}
		if(amount>=5)
		{
			n5=amount/5;
			amount=amount%1000;
		}
		if(amount>=2)
		{
			n2=amount/2;
			amount=amount%2;
		}
		if(amount>=1)
		{
			n1=amount/1;
			amount=amount%1;
		}
		System.out.println("Number of 2000 notes :"+n2000);
		System.out.println("Number of 1000 notes :"+n1000);
		System.out.println("Number of 500 notes :"+n500);
		System.out.println("Number of 200 notes :"+n200);
		System.out.println("Number of 100 notes :"+n100);
        System.out.println("Number of 50 notes :"+n50);
		System.out.println("Number of 20 notes :"+n20);
		System.out.println("Number of 10 notes :"+n10);
		System.out.println("Number of 5 notes :"+n5);
		System.out.println("Number of 2 notes :"+n2);
		System.out.println("Number of 1 notes :"+n1);
		
		

		
		
	}
	 

}
