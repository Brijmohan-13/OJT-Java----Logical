package June11_Array;


//Program to find minimum salary of Employee

public class Employee
{
	int eno,salary;

	
	
	public Employee(int eno, int salary) {
		super();
		this.eno = eno;
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + "]";
	}
}
