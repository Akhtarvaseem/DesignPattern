package client;

import modelForEmployee.Employee;

public class Test1 {

	
	public static void main(String[] args) {
		
		Employee employee = new Employee.EmployeeBuilder()
				.setId(11)
				.setName("sumit")
				.setSalary(23333)
				.build();
		
		System.out.println(employee);
		
		
		Employee employee2 =Employee.EmployeeBuilder.builder()
				.setId(12)
				.setName("kisan")
				.setSalary(33333)
				.build();
		
		
		
		System.out.println(employee2.hashCode());
	}
}
