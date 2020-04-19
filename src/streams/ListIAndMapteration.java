package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListIAndMapteration {

	public static void main(String[] args) {
		try {
			List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);
//			intList.forEach(System.out::println);
			
//			Stream.of(intList).forEach(System.out::println);
//			List<String> collect = intList.stream().map(x -> x.toString()).collect(Collectors.toList());
			List<Integer> collect = intList.stream().map(x -> x+2).collect(Collectors.toList());
//			System.out.println(collect);
			
//			collect = intList.parallelStream().filter(x -> x%2==0).collect(Collectors.toList());
//			System.out.println(collect);
			
			List<Employee> empList = Arrays.asList(new Employee(1,"tom",25000),new Employee(2,"John",20000),
					new Employee(3,"Harry",10000),new Employee(4,"Lenon",2000),
					new Employee(5,"Sally",22000),new Employee(6,"Vincet",50000));
			
			Map<String, Long > map =
			empList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
			
//			map.forEach((x,y) -> System.out.println(x)); //lambda
//			map.entrySet().stream().filter(x -> x.getValue()>20000).//.collect(Collectors.toList());
//			forEach(System.out::println);
			
//			List<String> s = map.entrySet().stream().filter(x -> x.getValue()>20000).
//			map(x -> x.getKey()).collect(Collectors.toList());
//			forEach(System.out::println);
//			collect(Collectors.joining());
//			System.out.println(s);
			
			Map<String, Long > map2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
			collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));;
			map2.forEach((x,y) -> System.out.println(x));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
