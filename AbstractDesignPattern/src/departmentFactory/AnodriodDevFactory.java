package departmentFactory;

import employeeAbstractFactory.EmployeeAbstractFactory;
import oprationOnModel.AndroidDevloper;
import oprationOnModel.Employee;

public class AnodriodDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new AndroidDevloper();
	}

}
