package June03_ReplaceString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Program for replacing String

public class ReplaceString2 {
	
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
		//StringBuffer is the standard way...out of for loop/for each loop
		
		StringBuffer sb=new StringBuffer();
		
		for(String str1:str)
		{
			sb.append(str1+" ");
		}
		
	System.out.println(sb);
				
	}//main ends here
}
