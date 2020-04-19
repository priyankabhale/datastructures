package streams;

public class Employee{

	private int id;
	private String name;
	private long salary;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String name, long salary) {
		super();
		this.id = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int empid) {
		this.id = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
