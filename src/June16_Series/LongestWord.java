package June16_Series;


//Write a java program to find Longest word
public class LongestWord {

	
	public static void main(String[] args) {
		
		String s="Java by kiran , Training Institute pune ";
		
		String[] str=s.split(" ");
		
		System.out.println(str.length);
		
		System.out.println(str[2].length());
		
		
		String longestWord="Java";
		
		for(int i=1;  i<str.length;  i++)
		{ 
			if(longestWord.length()<str[i].length())
			{
				longestWord=str[i] ;
			}
		}	
		
		System.out.println("Longest word is "+longestWord);
		
		
		
		
		
		
		
		
		
		
		
	}
	}
