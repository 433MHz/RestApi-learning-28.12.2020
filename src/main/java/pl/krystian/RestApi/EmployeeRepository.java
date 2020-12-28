package pl.krystian.RestApi;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
	private Employee employee = new Employee();
	private List<Employee> employees = new ArrayList<>();
	
	public List<Employee> getEmployees()
	{
		addEmployees();
		return employees;
	}
	
	public Employee getEmployee() {
		
		Employee emp = new Employee();
		emp.setId(101);
		emp.setfName("Krystian");
		emp.setlName("Izdebski");
		emp.setAge(21);
		return emp;
	}
	
	
	public void addEmployees() 
	{
		for(int i = 0; i <= 100; i++) {
			employee = new Employee();
			employee.setId(i);
			employee.setfName("Krystian" + i);
			employee.setlName("Izdebski" + i);
			employee.setAge(i+10);
			employees.add(employee);
		}
	}

}
