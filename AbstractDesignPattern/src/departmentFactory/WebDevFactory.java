package departmentFactory;

import employeeAbstractFactory.EmployeeAbstractFactory;
import oprationOnModel.Employee;
import oprationOnModel.WebDevloper;

public class WebDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		
		return new WebDevloper();
	}

}
