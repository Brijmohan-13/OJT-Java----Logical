package June16_Series;

public class LongestWord_NoRepeatedCharacters {
	
	public static void main(String[] args) {
		
		String s="Java by kiran , training institute , pune";
		
		String maxLength="";
				
		String[] words=s.split(" ");
		
		for(String word : words)
		     {
					if(!isRepeat(word))
					{
						if(maxLength.length()<word.length())
						{
							maxLength=word;
						}
					}
		     }	
		
		System.out.println(maxLength);
		
	}//main ends
	
	static boolean isRepeat(String word)
	{
		boolean isCharRepeated=false;
		
		char[] ch=word.toCharArray();
		for(int i=0;  i<ch.length;  i++)
		{
			int firstIndex=word.indexOf(ch[i]);
			int lastIndex=word.lastIndexOf(ch[i]);
			
			if(firstIndex!=lastIndex)
			{
				isCharRepeated= true;
				break;
			}
			
		}
		
		return isCharRepeated;
	}
	}//class ends
