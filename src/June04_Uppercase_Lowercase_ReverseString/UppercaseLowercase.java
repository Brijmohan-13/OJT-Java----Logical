package June04_Uppercase_Lowercase_ReverseString;

//**Program to convert uppercase to Lowercase and vice versa

//ASCII---American standard code for information interchange
//ASCII for A-Z is 65-90
//ASCII for A-Z is 97-122 
//Scanner class is used to read single letter(char) input ----(System.in)keyboard input
//BufferedReader can be used to read String input from user----(System.in)keyboard input
//Keyboard input is STANDARD input to system....(system.in)

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UppercaseLowercase {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Please Enter text :");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //allows keyboard input
		String s=br.readLine();  //convert keyboard input to String
		char[] ch=s.toCharArray();  //convert String into char Array....[B][r][i][j][M][o][h][a][n]
		
		for (int i=0;   i<ch.length; i++ )
		{
			if(ch[i]>=65  &&  ch[i]<=90)
			{
				ch[i]=(char) (ch[i]+32);    //adding 32 & implicit casting
			}
			
			else if(ch[i]>=97  &&  ch[i]<=122)
			{
				ch[i]=(char) (ch[i]-32);    //adding 32 & implicit casting
			}
		}// for loop ends here
		
		System.out.println(ch);  //char array has special treatment
	}
}