package June04_Uppercase_Lowercase_ReverseString;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//****Most IMP Program-Reverse String 

public class ReverseString {

	public static void main(String[] args) throws Exception {
		
	System.out.println("Enter the Text :");
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	String s=br.readLine();       //convert keyboard input to String
	
	char[] ch1=s.toCharArray();    //   [B][R][I][J][M][O][H][A][N]
	
	char[] ch2=new char[ch1.length];   //new char to store elements
	
	int index = 0;

	for(int i=ch1.length-1  ;i>=0    ;i--)
	{
		ch2[index]=ch1[i];
		index++;
	}
	System.out.println(ch2);
	}//main ends here
}

//class extends class
//interface extends interface
//class implements interface


