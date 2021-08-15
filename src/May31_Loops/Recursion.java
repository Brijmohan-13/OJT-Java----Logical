package May31_Loops;

public class Recursion {

//priting 1-5 numbers without using using loop
//Recursion is calling the function inside the function it itself
	
	static void printNumbers(int no){
		
		System.out.println(no);
		
		no++;
		
		if(no<=5)
		printNumbers(no);
	}	
public static void main(String[] args) {
	
	printNumbers(1);
}}
