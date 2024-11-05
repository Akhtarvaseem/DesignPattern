package departmentFactory;

import employeeAbstractFactory.EmployeeAbstractFactory;
import oprationOnModel.Employee;
import oprationOnModel.Mangager;

public class MangerFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		
		return new Mangager();
	}

}
