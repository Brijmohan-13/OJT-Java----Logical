package June04_Uppercase_Lowercase_ReverseString;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChangeCaseForOnlyForFirstLetter {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Please enter text");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) ;
		
		String s=br.readLine();
		char[] ch=s.toCharArray();    //[B][r][i][j][m][o][h][a][n]
		
		
		if(ch[0]>=65 && ch[0]<=90)
		{
			ch[0]=(char) (ch[0]+32);
		}
		
		else if(ch[0]>=97 && ch[0]<=122)
		{
			ch[0]=(char) (ch[0]-32);
		}
		
		System.out.println(ch);
		
		
		
		
	
	}

}
