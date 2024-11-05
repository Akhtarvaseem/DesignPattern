package mainClasess;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import subPackagesOfEntity.Student;
import subPackagesOfEntity.Students;
import thrades.MyThrade;

public class Test1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		
		
//		MyThrade  t1=new MyThrade();
//		t1.start();
//		
//		MyThrade  t2=new MyThrade();
//		t2.start();
//		
//		MyThrade  t3=new MyThrade();
//		t3.start();
		
		
		
		
		
		Student student=Student.getStudent();
		System.out.println(student.hashCode());
//		
//		
//		Student student2=Student.getStudent(); 
//		System.out.println(student2.hashCode());
		
		
		
	//1 .way	
//Break the singletone designe pattern , This technique called reflection API
		/*

		Constructor<Student> constructor = Student.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Student student3 = constructor.newInstance();
		System.out.println(student.hashCode());
		
		Student student4 = constructor.newInstance();
		System.out.println(student4.hashCode());
		
		 */
         
		
		/*
		 * Using ENUM
		 * 
		Students instance = Students.INSTANCE;
		System.out.println(instance.hashCode());
		
		Students instance2 = Students.INSTANCE;
		System.out.println(instance2.hashCode());
		Students instance3 = Students.INSTANCE;
		System.out.println(instance3.hashCode());
		*/
		
		
//	2. way to berak the singletone designe pattern 
		
		/*
		Student student1=Student.getStudent();
		ObjectOutputStream oss;
		try {
			oss = new ObjectOutputStream(new FileOutputStream("abc.ob"));
			oss.writeObject(student1);
			System.out.println("serilization done...");
			
			
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("abc.ob"));
			Student object = (Student) in.readObject();
			
			System.out.println(object.hashCode());
			
			// Solution is implement readResolve method
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
// 3. Cloning
		
		Student s1=(Student) student.clone();
		System.out.println(s1.hashCode());
		
		Student s2=(Student) student.clone();
		System.out.println(s2.hashCode());
		
	}
}
