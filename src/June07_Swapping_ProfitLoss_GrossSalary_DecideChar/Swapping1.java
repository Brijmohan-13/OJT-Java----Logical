package June07_Swapping_ProfitLoss_GrossSalary_DecideChar;


//Swapping of two numbers without using third variable

public class Swapping1 {
	
public static void main(String[] args) {
	
	int no1=10;
	int no2=20;
	
	System.out.println("Original values are:");
	System.out.println("no1="+no1);
    System.out.println("no2="+no2);
	
	int no3=no1+no2;
	no1=no3-no1;
	no2=no3-no1;
	
	System.out.println("Swapped values are:");
	System.out.println("no1="+no1);
    System.out.println("no2="+no2);
}
}
//object can be created ....constructor initialize object variables
//print variables before swap
//repeat lines 17,18,19...print after swap

