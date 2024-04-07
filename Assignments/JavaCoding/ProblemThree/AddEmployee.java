package ProblemThree;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	private static List<Employee> emplist = new ArrayList<Employee>();
	
	public static List<Employee> getEmployeeList(){
		return emplist;
		
	}
	public static void setEmployeeList(List<Employee> emplist){
		AddEmployee.emplist = emplist;
	}
	
	
	public  void AddEmployee(Employee emp) {
		emplist.add(emp);
		
	}	
	public Employee getEmployee(int id) {
		for(Employee employee:emplist) {
			if(employee.getId()==id) {
				return employee;
			}
		}
		return null;
		
	
	}

}
