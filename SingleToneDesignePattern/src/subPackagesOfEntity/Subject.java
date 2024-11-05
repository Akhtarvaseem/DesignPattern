package subPackagesOfEntity;

//  Eager way to create pattern

public class Subject {

	
	private static Subject subject=new Subject();
	
	public static Subject getSubject() {
		return subject;
		
	}
}
/*
 * Problem - if we not use object in our program then wastage of memory
*/