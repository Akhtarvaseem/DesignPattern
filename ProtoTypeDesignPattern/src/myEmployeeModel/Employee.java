package myEmployeeModel;

import java.util.ArrayList;
import java.util.List;

public class Employee  implements Cloneable{

	private int id;
	private String name;
	private List<String> address;
	public int getId() {
		return id;
	}
	public String getName()  {
	
		return name;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
//		Thread.sleep(3000);
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		// shallow copy
		//return super.clone();
		
		
		// deep copy
		Employee em=new Employee();
		em.setId(getId());
		em.setName(getName());
	
		List<String> temp = new ArrayList<String>();
		for (String add : this.getAddress()) {
			temp.add(add);
		}  
		em.setAddress(temp);
		return em;
		
	}
	
	
}
