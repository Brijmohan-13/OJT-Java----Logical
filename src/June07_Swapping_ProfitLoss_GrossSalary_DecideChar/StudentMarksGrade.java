package June07_Swapping_ProfitLoss_GrossSalary_DecideChar;

import java.util.Scanner;


public class StudentMarksGrade {   
	
	public static void main(String[] args) {
		
		int p,ch,b,m,cm;
		
		Scanner sc=new Scanner(System.in);

        System.out.println("Enter Physics marks");
		p=sc.nextInt();
		System.out.println("Enter chemistry marks");
		ch=sc.nextInt();
		System.out.println("Enter biology marks");
		b=sc.nextInt();
		System.out.println("Enter maths marks");
		m=sc.nextInt();
		System.out.println("Enter computer marks");
		cm=sc.nextInt();
		
         int sum=p+ch+b+m+cm;
         int per=sum*100;
         per=per/500;
         
       if (per>=90)
       {
    	   System.out.println("Grade A");
       }
        
       else if (per>=80)
       {
    	   System.out.println("Grade B");
       }
       else  if (per>=70)
       {
    	   System.out.println("Grade C");
       }
       else if (per>=60)
       {
    	   System.out.println("Grade D");
       }
       else if (per>=50)
       {
    	   System.out.println("Grade E");
       }           
}// main ends here
}
