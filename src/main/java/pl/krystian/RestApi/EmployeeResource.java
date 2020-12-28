package pl.krystian.RestApi;

import java.util.ArrayList;

import com.google.gson.Gson;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("employee")
public class EmployeeResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployee() {
		
		Employee emp;
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		for (int i = 0; i <=1000; i ++) {
			emp = new Employee();
			emp.setfName("Krystian" + i);
			emp.setlName("Izdebski" + i);
			emp.setAge(i);
			emps.add(emp);
		}
		
		Gson gson = new Gson();
		return gson.toJson(emps);
	}
}
