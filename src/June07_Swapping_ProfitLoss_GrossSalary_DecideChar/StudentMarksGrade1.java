package June07_Swapping_ProfitLoss_GrossSalary_DecideChar;

import java.util.Scanner;


//Set Student marks using Switch case
public class StudentMarksGrade1 {
	
	 static char setGrade(int per)
	 {
		char ch=' ';
		 if(per>=90)
         {
			 ch='A';     
         }
		 
         else if(per>=80)
         {
          	ch= 'B';
         }
         else if(per>=70)
         {
          	ch= 'C';
         }
         else if(per>=60)
         {
          	ch= 'D';
         }
         else if(per>=50)
         {
          	ch= 'E';
         }
         else if(per>=40)
         {
          	ch= 'F';
         }
		 return ch;
      }//set grade ends
	
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
         
       char grade= setGrade(per);
         
         switch(grade)       //grade is char variable here....we can take int,char,String variable type
         {
         case 'A':
        	 System.out.println("Grade A");
        	 break;
        	 
         case 'B':
        	 System.out.println("Grade B");
        	 break;
        	 
         case 'C':
        	 System.out.println("Grade C");
        	 break;
        	 
         case 'D':
        	 System.out.println("Grade D");
        	 break;
        	 
         case 'E':
        	 System.out.println("Grade E");
        	 break;
   	 
         }//switch ends here        
}// main ends here
}
