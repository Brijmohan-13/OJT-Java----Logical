package June17_Collection;
	
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

//IMP****Program to find out of Frequency of Character in given String
//We can use any Map-Hashmap,LinkedHashmap,Treemap
public class FrequencyOfCharacter {
	
/*  Given String: java	
	
        key      value
	
	  	j		1
		a		2		
		v		1                    */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		
		String s=sc.next();
		sc.close();
		char[] ch=s.toCharArray();
		
		LinkedHashMap<Character, Integer>  lh=new LinkedHashMap<Character, Integer>();          //any map can be used as per req.
		
		
		for(char c:ch)
		{
			if(lh.containsKey(c))
			{
				lh.put(c, lh.get(c)+1);           //update entry
			}
			else
			{
				lh.put(c, 1);             // new entry
		    }
		}//for loop ends
		
		System.out.println(lh);
		
		Set<Character> keyset=lh.keySet();
		for(Character key:	keyset)
		{
			System.out.println("Character "+key+" has appeared " +lh.get(key)+" times in the given word.");
		}
	}//main ends
}//class ends
