package clients;

import java.util.Arrays;

import myEmployeeModel.Employee;

public class Test1 {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		
		System.out.println("start .......");
		
		// main object
		Employee employee=new Employee();
		employee.setId(11);
		employee.setName("Akhtar");
		employee.setAddress(Arrays.asList("noida","delhi","lucknow"));
		
		// these are called shallow copy
	
		
		System.out.println(employee.hashCode() +"    "+employee);
		employee.setName("vaseem");
		
		// clone 1 
		Employee employee2 = (Employee)employee.clone();
		
		// clone 2
		Employee employee3 = (Employee)employee.clone();
		
		
		// add object in List 
		employee2.getAddress().add(3, "siddharthnagar");
		
		// remove object in list
		employee2.getAddress().remove(1);
		
		System.out.println(employee2.hashCode() +"    "+employee2);
		System.out.println(employee2.hashCode() +"    "+employee3);
		

		
		
	}
}
