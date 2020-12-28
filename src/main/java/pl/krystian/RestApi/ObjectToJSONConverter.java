package pl.krystian.RestApi;

import java.util.List;

import com.google.gson.Gson;

public class ObjectToJSONConverter {

	Gson gson = new Gson();
	
	
	public String convertToJSON(List<Employee> emps){
		return gson.toJson(emps);
	}
	
	public String convertToJSON(Employee emp){
		return gson.toJson(emp);
	}
}
