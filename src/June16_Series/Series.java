package June16_Series;


//Write a java program to print 1,3,7,13,21,31
public class Series {
	
 /* 1    2*0+1
	3	 2*1+1
	7	 2*2+3
	13	 2*3+7
	21	 2*4+13
	31   2*5+21       */
	
	
	
	public static void main(String[] args) {
		
		int result=1;
		
		for(int i=0; i<=5;  i++)
		{
			result=result+2*i;
			System.out.println(result);
		}
	}

}
