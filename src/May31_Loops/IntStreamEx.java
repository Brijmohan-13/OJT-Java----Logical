package May31_Loops;

import java.util.stream.IntStream;

public class IntStreamEx {

//to print range of numbers 1-5 Stream can be used
// functional interface relates with lamda expression
//functional interface has only one method always
//end value is exclusive in range

	
	
	public static void main(String[] args) {
		
	IntStream.range(1, 6).forEach(number->System.out.println(number));
	
	
	//range is method here'
	//for each is method
	//for each requires functional interface
}
}
