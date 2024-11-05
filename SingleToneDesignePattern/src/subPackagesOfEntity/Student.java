package subPackagesOfEntity;

import java.io.Serializable;

/* MAKE THESE CLASS AS SINGLETONE .
 * These are two type 
 * 1. lazy way
 * 2.Egger way
 * */


// Lazy way to create 
public class Student  implements Serializable, Cloneable{

	
	private static Student student;
	
	private Student() {
		
		// stop to object created by reflection method
//		if(student!=null) {
//			
//			throw new RuntimeException("Object already created");
//		}
	}
	
	
	public Object readResolve() {
		return student;
		
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	
//		return super.clone();
		
		//solution 
		return student;
	}
	
	public static Student getStudent() {
		
		synchronized (Student.class) {
			
			if(student==null) {
				student = new Student();	
			}
		}
	       
	       
		 return student;
	}
	
	
}
/*
 * Problem -> we can't create this way because when we use multiply thread then its not best technique
 * solution -> make this synchronize 
*/
