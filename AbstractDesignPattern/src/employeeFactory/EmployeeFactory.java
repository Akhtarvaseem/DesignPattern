package employeeFactory;

import employeeAbstractFactory.EmployeeAbstractFactory;
import oprationOnModel.Employee;

public class EmployeeFactory {

	// getEmployee
	
	public static Employee getEmployee(EmployeeAbstractFactory abstractFactory) {
		
		return abstractFactory.createEmployee();
		
	}
	
}
