package June17_Collection;

import java.util.Arrays;
import java.util.Scanner;


//Program to calculate third highest salary
public class EmployeeTest {
	
	
	
	public static void main(String[] args) {
		
		
		Employee employee1 =new Employee(10,5000);
		Employee employee2 =new Employee(20,7000);
		Employee employee3 =new Employee(15,6000);
		Employee employee4 =new Employee(5,2000);
		
		int size=4;
		
		Employee [] employees=new Employee[size];
		
		employees[0]=employee1;
		employees[1]=employee2;
		employees[2]=employee3;
		employees[3]=employee4;
		
		//SORTING can be done by
		//Arrays.sort();
		//TreeSet<Employee> ts=new TreeSet<Employee>();
		
		Arrays.sort(employees);
		
		
		for(Employee employee :employees)
		{
			System.out.println(employee);
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which highest salary do you want ?");
		int index=sc.nextInt();
		sc.close();
		index=index-1;
		
		System.out.println("Salary is : "+ employees[index].salary);
		
		
		

	}
}
