package June17_Collection;

public class Employee implements Comparable<Employee>{
	
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

	@Override
	public int compareTo(Employee e1) {
		
		if(salary>e1.salary)
			return -1;
		else if(salary<e1.salary)
			return 1;
		else
			return 0;

}
	
	
	
	
	
	
	
	
	
}
