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
	
	public Employee getEmployee(int id) {
		
		for(Employee emp : employees) {
			if(emp.getId() == id)
			{
				return emp;
			}
		}
		return null;
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
