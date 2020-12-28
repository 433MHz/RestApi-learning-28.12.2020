package pl.krystian.RestApi;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployee() {
		
		Employee emp = new Employee();
		emp.setfName("Krystian");
		emp.setlName("Izdebski");
		emp.setAge(21);
		
		return emp;
	}
}
