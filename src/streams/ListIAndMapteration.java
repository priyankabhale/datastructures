package streams;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ListIAndMapteration {

	public static void main(String[] args) {
		try {
			List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//			intList.forEach(System.out::println);

//			Stream.of(intList).forEach(System.out::println);
//			List<String> collect = intList.stream().map(x -> x.toString()).collect(Collectors.toList());
			List<Integer> collect = intList.stream().map(x -> x + 2).collect(Collectors.toList());
//			System.out.println(collect);

//			collect = intList.parallelStream().filter(x -> x%2==0).collect(Collectors.toList());
//			System.out.println(collect);

//			List<Employee> empList = Arrays.asList(new Employee(1,"tom",25000),new Employee(2,"John",20000),
//					new Employee(3,"Harry",10000),new Employee(4,"Lenon",2000),
//					new Employee(5,"Sally",22000),new Employee(6,"Vincet",50000));
//			
//			Map<String, Long > map =
//			empList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));

//			map.forEach((x,y) -> System.out.println(x)); //lambda
//			map.entrySet().stream().filter(x -> x.getValue()>20000).//.collect(Collectors.toList());
//			forEach(System.out::println);

//			List<String> s = map.entrySet().stream().filter(x -> x.getValue()>20000).
//			map(x -> x.getKey()).collect(Collectors.toList());
//			forEach(System.out::println);
//			collect(Collectors.joining());
//			System.out.println(s);
//			
//			Map<String, Long > map2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
//			collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));;
//			map2.forEach((x,y) -> System.out.println(x));
//			
//			List<Integer> a = Arrays.asList(1,2,3,5);
//			List<Integer> b = Arrays.asList(1,2,3,4);
//			
//					List c = b.stream().filter(e -> !a.contains(e))
////					.peek(System.out::println)
//					.collect(Collectors.toList());
//			c.stream().forEach(System.out::println);
//			filter(e -> !a.contains(e)).peek(System.out::println);
//			.forEach(System.out::println);

//			HashMap<String, Object> map = new HashMap<>();
//			map.put("a", 1);
//			map.put("b", 2);
//			map.put("c", 3);
//
//			map.entrySet().stream().filter(e -> !("b".equals(e.getKey())))
//					.forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));


			HashMap<String, String> innerMap = new HashMap<>();
			innerMap.put("a1", "ashish");
			innerMap.put("a2", "pri");
			innerMap.put("a3", "fartu");

			HashMap<String, HashMap<String, String>> outermap = new HashMap<>();
			outermap.put("friends", innerMap);

			List<HashMap<String, HashMap<String, String>>> list = new ArrayList<>();
			list.add(outermap);

			List<Map<String, Map<String, String>>> newList = 
					list.stream().
						map(outer -> outer.entrySet().stream().
								map(inner -> new SimpleEntry<>(inner.getKey(),inner.getValue().entrySet().stream().
										filter(entry -> !"fartu".equals(entry.getValue()))
										.collect(Collectors.toMap(Entry::getKey, Entry::getValue))))
								.collect(Collectors.toMap(Entry::getKey, Entry::getValue)))
					.collect(Collectors.toList());
			
			
			list.forEach(map -> map.forEach(
				    (key, value) -> value.entrySet()
				        .removeIf(entry -> "fartu".equals(entry.getValue()))));
			
			System.out.println("had iterate");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
