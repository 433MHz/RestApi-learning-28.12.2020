package pl.krystian.RestApi;

import jakarta.ws.rs.GET;
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
		
		return objectToJSONConverter.convertToJSON(employeeRepository.getEmployees());
	}
}
