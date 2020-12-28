package pl.krystian.RestApi;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	 String fName;
	 String lName;
	 int age;
	
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public int getAge() {
		return age;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
