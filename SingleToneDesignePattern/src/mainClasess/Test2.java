package mainClasess;

import subPackagesOfEntity.Subject;

public class Test2 {

	
	public static void main(String[] args) {
		
		Subject subject = Subject.getSubject();
		System.out.println(subject.hashCode());
		Subject subject2 = Subject.getSubject();
		System.out.println(subject2.hashCode());
	}
}
