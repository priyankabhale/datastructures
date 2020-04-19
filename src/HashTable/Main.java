package HashTable;

public class Main {

	public static void main(String[] args) {
		Student s = new Student("John", 2, 8.7);
		Student s1 = new Student("Tim", 5, 5.7);
		Student s2 = new Student("Sean", 8, 9.7);
		Student s3 = new Student("Tobby", 1, 2.3);
		Student s4 = new Student("Ray", 4, 5.7);
		Student s5 = new Student("Awais", 4, 5.7);

		HashTableClass table = new HashTableClass();

		table.insert(table.toHashcode(s.roll_no), s);
		table.insert(table.toHashcode(s1.roll_no), s1);
		table.insert(table.toHashcode(s2.roll_no), s2);
		table.insert(table.toHashcode(s3.roll_no), s3);
		table.insert(table.toHashcode(s4.roll_no), s4);
		table.insert(table.toHashcode(s5.roll_no), s5);

//		System.out.println(table.fetchStdInfor(4).toString());
		table.deleteStd(2);
		table.showData();

	}

}
