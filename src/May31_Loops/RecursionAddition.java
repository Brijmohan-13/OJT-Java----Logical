package May31_Loops;

public class RecursionAddition {

	static void printNumbers(int no,int sum)
	{
		sum=sum+no;
		
		no++;
		
		if(no<=5)
		printNumbers(no,sum);
		else
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		printNumbers(1,0);
			}
}
