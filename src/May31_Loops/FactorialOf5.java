package May31_Loops;

public class FactorialOf5 {

	//write A program to give factorial 5(5!)-1x2x3x4x5

	public static void main(String[] args) {
		int fact=1;
		for (int i=1; i<=5; i++)
	{
		fact=fact*i;	
	}
		
		System.out.println(fact);
}
}
