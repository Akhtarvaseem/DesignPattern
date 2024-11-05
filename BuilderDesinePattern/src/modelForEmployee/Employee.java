package modelForEmployee;

public class Employee{

	
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}

	
	
     
	 @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	Employee(EmployeeBuilder builder) {
		
		this.id=builder.id;
		this.name=builder.name;
		this.salary=builder.salary;
	}

	
	
  public	static class EmployeeBuilder{
		private int id;
		private String name;
		private int salary;
		
		
		public EmployeeBuilder() {
			
		}
		public static EmployeeBuilder builder() {
			return new EmployeeBuilder();
			
		}

		
		public EmployeeBuilder setId(int id) {
			this.id = id;
			return this;
		}
		public EmployeeBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public EmployeeBuilder setSalary(int salary) {
			this.salary = salary;
			return this;
		}
		
		
		public Employee build() {
			Employee employee = new Employee(this);
			return employee;
			
		}
		
		
	}
	
}
