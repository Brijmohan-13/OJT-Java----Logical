package June08_FrequncyOfNumber_TotalNumberOfNotes_SumOfFirst3Numbers;

//sum of first three numbers without using for loop(Recursion)

public class SumOfFirstThreeNumbers1 {
	
	static void add(int sum,int num){
		
		sum=sum+num;
		num++;
		
		if(num<=3)
		{
			add(sum,num);
		}
		else
		{
			System.out.println(sum);
		}
    	}//add methods ends here
	
	public static void main(String[] args) {
			
		add(0,1);

}//main method ends here
}
//Random class is in java.util package....random method from this class gives random numbers
