package clints;

import factoryDesigneTech.FactoryDesigne;
import modelsOfObject.Employee;

public class Test1 {

	public static void main(String[] args) {
		
		Employee employee1 = FactoryDesigne.getEmployee("java");
		Employee employee2 = FactoryDesigne.getEmployee("python");
		Employee employee3 = FactoryDesigne.getEmployee("web");
		System.out.println(employee1.salary());
		System.out.println(employee2.salary());
		System.out.println(employee3.salary());
	}
	
	
}
