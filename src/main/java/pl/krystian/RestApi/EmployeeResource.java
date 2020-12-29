package pl.krystian.RestApi;

import com.google.gson.Gson;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeResource {

	EmployeeRepository employeeRepository = new EmployeeRepository();
	ObjectToJSONConverter objectToJSONConverter = new ObjectToJSONConverter();
	
	@GET
	@Path("get{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployee(@PathParam("id") int id) {
		return objectToJSONConverter.convertToJSON(employeeRepository.getEmployee(id));
	}
	
	@POST
	@Path("add")
	public String addEmployee(String emp) {
		Gson gson = new Gson();
		Employee employee = gson.fromJson(emp, Employee.class);
		
		String message = ("id:" + employee.getId() + " | first name:" + employee.getfName() + " |  last name:" + employee.getlName() + " | age:" + employee.getAge());
	
		return message;
	}
}
