package pl.krystian.RestApi;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployee() {
		
		EmployeeRepository employeeRepository = new EmployeeRepository();
		ObjectToJSONConverter objectToJSONConverter = new ObjectToJSONConverter();
		
		return objectToJSONConverter.convertToJSON(employeeRepository.getEmployee());
	}
	
	@POST
	@Path("add")
	public String addEmployee(String emp) {
		Gson gson = new Gson();
		Employee employee = gson.fromJson(emp, Employee.class);
		
		System.out.println("id:" + employee.getId() + " | first name:" + employee.getfName() + " |  last name:" + employee.getlName() + " | age:" + employee.getAge());
	
		return "Otrzymano";
	}
}
