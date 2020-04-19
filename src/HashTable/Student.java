package HashTable;

public class Student {
	String name;
	int roll_no;
	double cgpa;

	public Student() {
	}

	public Student(String name, int roll_no, double cgpa) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", cgpa=" + cgpa + "]";
	}
}
