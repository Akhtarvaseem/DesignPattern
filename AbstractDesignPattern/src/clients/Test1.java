package clients;

import departmentFactory.AnodriodDevFactory;
import departmentFactory.MangerFactory;
import employeeFactory.EmployeeFactory;
import oprationOnModel.Employee;

public class Test1 {

	public static void main(String[] args) {
		
		// for android 
		Employee employee = EmployeeFactory.getEmployee(new AnodriodDevFactory());
		
		System.out.println(employee.name() +" and his salary "+employee.salary());
		
		Employee employee2 = EmployeeFactory.getEmployee(new MangerFactory());
		
		System.out.println(employee2.name() +"     "+employee2.salary());
	}
}
