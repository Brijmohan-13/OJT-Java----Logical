package June07_Swapping_ProfitLoss_GrossSalary_DecideChar;

import java.util.Scanner;

/*Decide Character type
A-Z---65-90
a-z---97-122
0-9---48-57
remaining are special*/

public class DecideCharacterType {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Text");
	char ch1=sc.next().charAt(2);
	
	if ((ch1>=65 && ch1<=90) || (ch1>=97 && ch1<=122))         //******
	{
			System.out.println("Characher is Alphabet");
	}
	else if((ch1>=47 && ch1<=58))
	{
		System.out.println("Characher is digit");
	}
	else
	{
		System.out.println("Character is special character");
	}
}
}
/*String s="";      empty string
String s=null;    null string*/