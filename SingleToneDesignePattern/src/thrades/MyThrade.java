package thrades;

import subPackagesOfEntity.Student;

public class MyThrade extends Thread{

	@Override
	public void run() {
	
//		System.out.println("running thrade ...........  "+getId()+ "  "+ getName());
		
		Student student=Student.getStudent();
		System.out.println("thrade 1 "+student.hashCode());
		
		
		Student student2=Student.getStudent(); 
		System.out.println("thrade 2 "+student2.hashCode());
	}
}
