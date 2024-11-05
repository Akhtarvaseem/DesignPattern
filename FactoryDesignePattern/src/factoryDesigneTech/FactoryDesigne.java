package factoryDesigneTech;

import modelsOfObject.Employee;
import modelsOfObject.JavaDevloper;
import modelsOfObject.PythonDevloper;
import modelsOfObject.WebDevloper;

public class FactoryDesigne {

	//
	public static Employee getEmployee(String str) {
		Employee employee ;
		if(str.equalsIgnoreCase("JAVA")) {
			
			 employee = new JavaDevloper();
		}
		else if(str.equalsIgnoreCase("PYTHON"))
		{
		employee=new PythonDevloper();
	    }
		else if(str.equalsIgnoreCase("WEB")) {
			
			employee=new WebDevloper();
		}else {
			return	null;
		}
		return employee;
    }
}
