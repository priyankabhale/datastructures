package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticeJava8 {
	static List<EmployeeNew> employeeList = new ArrayList<EmployeeNew>();

	public static void main(String[] args) {
		initializeList();
		employeeList.stream().sorted(Comparator.comparingDouble(EmployeeNew::getSalary).reversed())
				.forEach(System.out::println);

	}

//	oldest employee in the organization? What is his age and which department he belongs to	
	public static void oldestAgeEmp() {
		Optional<EmployeeNew> opt = employeeList.stream().max(Comparator.comparing(EmployeeNew::getAge));
		System.out.println(opt.orElseGet(null));
	}

//	 Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
	public static void partitionByAge() {
		Map<Boolean, List<EmployeeNew>> entrySet = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		for (Entry<Boolean, List<EmployeeNew>> entry : entrySet.entrySet()) {
			System.out.println("----------------------------");

			if (entry.getKey()) {
				System.out.println("Employees older than 25 years :");
			} else {
				System.out.println("Employees younger than or equal to 25 years :");
			}

			System.out.println("----------------------------");

			List<EmployeeNew> list = entry.getValue();

			for (EmployeeNew e : list) {
				System.out.println(e.getName());
			}
		}
	}

	public static void salStats() {
		DoubleSummaryStatistics stat = employeeList.stream()
				.collect(Collectors.summarizingDouble(EmployeeNew::getSalary));
		System.out.println("avg: " + stat.getAverage());
		System.out.println("min: " + stat.getMin() + " max: " + stat.getMax() + " total: " + stat.getSum());
	}

//	average salary of male and female employees
	public static void avgSalByGender() {
		Map<String, Double> map = employeeList.stream().collect(
				Collectors.groupingBy(EmployeeNew::getGender, Collectors.averagingDouble(EmployeeNew::getSalary)));
		map.entrySet().stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
	}

//	How many male and female employees are there in the sales and marketing team
	public static void nosOfEmpByGenderInDept() {
		Map<String, Long> map = employeeList.stream()
				.filter((e) -> e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
				.collect(Collectors.groupingBy(EmployeeNew::getGender, Collectors.counting()));
		map.entrySet().stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
	}

//	Senior Most Employee Details 
	public static void seniorMostEmployee() {
		Optional<EmployeeNew> opt = employeeList.stream().sorted(Comparator.comparingInt(EmployeeNew::getYearOfJoining))
				.findFirst();
		System.out.println(opt.orElseGet(null));
	}

//	Details Of Youngest Male Employee In Product Development :
	public static void youngesEmp() {
		Optional<EmployeeNew> opt = employeeList.stream()
				.filter((e) -> e.getGender().equals("Male") && e.getDepartment().equals("Product Development"))
				.min(Comparator.comparingInt(EmployeeNew::getAge));
		System.out.println(opt.orElseGet(null));
	}

	public static void avgSalOfEachDept() {
		Map<String, Double> map = employeeList.stream().collect(
				Collectors.groupingBy(EmployeeNew::getDepartment, Collectors.averagingDouble(EmployeeNew::getSalary)));
		map.entrySet().stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
	}

	public static void countEmpInEachDept() {
		Map<String, Long> map = employeeList.stream()
				.collect(Collectors.groupingBy(EmployeeNew::getDepartment, Collectors.counting()));
		map.entrySet().stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
	}

	public static void namesOfEmpJoinedAfter2015() {
		employeeList.stream().filter((e) -> e.getYearOfJoining() > 2015).map(EmployeeNew::getName)
				.forEach(System.out::println);
	}

	public static void getHighestSalEmp() {
		Optional<EmployeeNew> highestPaidEmployee = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeNew::getSalary)));
		System.out.println(highestPaidEmployee.orElseGet(null));
	}

	public static void printAvgAgeOfGender() {
		Map<String, Double> map = employeeList.stream()
				.collect(Collectors.groupingBy(EmployeeNew::getGender, Collectors.averagingInt(EmployeeNew::getAge)));
		map.entrySet().stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
	}

	public static void printAllDepartments() {
		employeeList.stream().map(EmployeeNew::getDepartment).distinct().forEach(System.out::println);
	}

	public static void countEmpByGenderLong() {
		Map<String, Long> map = employeeList.stream()
				.collect(Collectors.groupingBy(EmployeeNew::getGender, Collectors.counting()));
		map.entrySet().stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
	}

	public static void countEmpByGenderList() {
		Map<String, Long> map = employeeList.stream()
				.collect(Collectors.groupingBy(EmployeeNew::getGender, Collectors.counting()));
		map.entrySet().stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));
	}

	public static void initializeList() {

		employeeList.add(new EmployeeNew(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new EmployeeNew(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new EmployeeNew(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new EmployeeNew(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new EmployeeNew(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new EmployeeNew(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new EmployeeNew(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new EmployeeNew(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new EmployeeNew(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new EmployeeNew(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new EmployeeNew(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new EmployeeNew(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new EmployeeNew(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new EmployeeNew(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new EmployeeNew(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new EmployeeNew(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new EmployeeNew(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
	}

}
