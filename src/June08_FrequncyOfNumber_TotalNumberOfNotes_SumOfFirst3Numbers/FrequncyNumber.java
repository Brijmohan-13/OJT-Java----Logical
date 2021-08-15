package June08_FrequncyOfNumber_TotalNumberOfNotes_SumOfFirst3Numbers;

import java.util.Scanner;

//Program to find Frequency of Number
public class FrequncyNumber {
	
	public static void main(String[] args) {
		// 12145876
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Entr the Number");
		int number=sc.nextInt();
		
		int r0,r1,r2,r3,r4,r5,r6,r7,r8,r9;
		r0=r1=r2=r3=r4=r5=r6=r7=r8=r9=0;

	while(number!=0)
	{
		int r=number%10;       //*********** %  and /
		number=number/10;      //***********
				
		if(r==0)
		{
			r0=r0+1;
		}
		if(r==1)
		{
			r1=r1+1;
		}
		if(r==2)
		{
			r2=r2+1;
		}
		if(r==3)
		{
			r3=r3+1;
		}
		if(r==4)
		{
			r4=r4+1;
		}
		if(r==5)
		{
			r5=r5+1;
		}
		if(r==6)
		{
			r6=r6+1;
		}
		if(r==7)
		{
			r7=r7+1;
		}
		if(r==8)
		{
			r8=r8+1;
		}
		if(r==9)
		{
			r9=r9+1;
		}
	}	
	System.out.println("Frequency of 0 is :"+r0);
	System.out.println("Frequency of 1 is :"+r1);
	System.out.println("Frequency of 2 is :"+r2);
	System.out.println("Frequency of 3 is :"+r3);
	System.out.println("Frequency of 4 is :"+r4);
	System.out.println("Frequency of 5 is :"+r5);
	System.out.println("Frequency of 6 is :"+r6);
	System.out.println("Frequency of 7 is :"+r7);
	System.out.println("Frequency of 8 is :"+r8);
	System.out.println("Frequency of 9 is :"+r9);
}
}
