package June11_Array;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee[] employees=new Employee[5];
		
		employees[0]=new Employee(1,5000);
		employees[1]=new Employee(2,10000);
		employees[2]=new Employee(3,2000);
		employees[3]=new Employee(4,2000);
		employees[4]=new Employee(5,8000);
		
		int minsal=employees[0].salary;
		int mineno=employees[0].eno;

		for(int i=1;  i<4;  i++)
		{
			if(minsal>employees[i].salary)  // if condition is true both statements will get executed
			{
				minsal=employees[i].salary;
				mineno=employees[i].eno;
			}
		}
		System.out.println("Minimun salary of employee and his number : "+ minsal+" , "+mineno);
		
		
		Employee[] minSalEmployees=new Employee[5];
		int index=0;
		for(int i=0;  i<5  ;i++)
		{
			if (minsal==employees[i].salary)
			{
				minSalEmployees[index]=employees[i];
				index++;
			}
		}
			System.out.println("List if Minimum salary of employess");

			for(int i=0;  i<5;  i++)
			{
				if(minSalEmployees[i]!=null)
				System.out.println(minSalEmployees[i]);		
			}
}
}
