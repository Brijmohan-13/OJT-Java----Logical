package June03_ReplaceString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Program for replacing String

public class ReplaceString {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Text");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();        //"java is difficult" 
		System.out.println(s.length());   //length() is method here

		String[] str=s.split(" ");    //convert string to string array
		
		for(int i=0   ;i<str.length    ;i++)
		{
			if(str[i].equals("difficult"))            //== can not be used here..must use equals("")  since it is String array
			{	
				str[i]="easy";
			}
	    }// for loop ends here
		
			
		//*****here we can not directly print String str array...so need to convert string array into String
		
		String s2="";
		for(int i=0  ;i<str.length  ;i++)       
			//length is variable here
			//also for each loop can be used here
			
		{
			s2=s2+str[i]+" ";
		}// for loops ends here
		
		s2.trim();   //to delete last space
		System.out.println(s2);
		System.out.println(s2.length());    //length is method here
	}//main ends here
}


//******************
// int[] a={11,22,54,56,78,12} ;.....simple example

//Student[] std={new student(4,50),  new student(2,40),   new student(9,80)};    ....std array with type Student
//for(Student std1: std)
//{
//            SOP(std1.rno)      }.........this will give all rno under Student
//append() in StringBuffer is used to add



