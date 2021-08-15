package June03_ReplaceString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Program for replacing String...for each loop used

public class ReplaceString1 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Text");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();        //"java is difficult" 
		String[] str=s.split(" ");    //convert string to string array
		

		for(int i=0   ;i<str.length     ;i++)       //for each loop can not be used here...because here we have to work on index
		{
			if(str[i].equals("difficult"))            //== can not be used here..must use equals("")  since it is String array
			{	
				str[i]="easy";
			}
	    }// for loop ends here
		
			
		//*****here we can not directly print String str array...so need to convert string array into String
		
		
		String s2="";
		                           //for each loop is used when all the elements of Array are to be iterated/retrieved with no conditions
		for(String str2:str)       //str reference was pointing to String array now str2 is pointing to same array
			                       //we can say that str1 and str2 are references of String type 
		{
			s2=s2+str2+" ";
		}// for loops ends here
		
		
		s2.trim();   //to delete last space
		System.out.println(s2);
	}//main ends here
}

