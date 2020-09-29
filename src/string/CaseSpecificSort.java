package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Intefaces.DoSomething;
import streams.Employee;

public class CaseSpecificSort {
	public static void main(String[] args) {
//		boolean b1 = true;
//		if ((b1 == true) || place(true)) {
//			System.out.println("C");
//		}

		List<String> list = new ArrayList<String>();
		list.add("Corona is a curable disease");
		list.add("thing to carry in picnic");
		list.add("no one cares");
		
		list.stream().
			flatMap(str -> Stream.of(str.split(" "))).
				map(e->e.toLowerCase()).
					filter(e -> e.startsWith("c")).
						forEach(System.out::println);
		
		DoSomething ds = (x,y)-> x+y;
		System.out.println(ds.doSomethingPlease(2, 3));
		
		ds.show();
		DoSomething.test();
		
		Employee e1 = new Employee(1,"tom",25000);
		Employee e2 = new Employee(2,"John",20000);
		Employee e3 = new Employee(1,"tom",25000);
		HashMap<Employee, Integer> map2 = new HashMap<>();
		map2.put(e1, 10);
		map2.put(e2, 11);
		map2.put(e3, 11);
		System.out.println(map2.size());
		System.out.println(map2.get(e3));
		
		System.out.println(map2.containsKey(e3));
		
		List<Employee> empList = Arrays.asList(new Employee(1,"tom",25000),new Employee(2,"John",20000),
				new Employee(3,"Harry",10000),new Employee(4,"Lenon",2000),
				new Employee(5,"Sally",22000),new Employee(6,"Vincet",50000));
		System.out.println("compare: "+empList.contains(e1));
		
		Map<Integer, String> map = empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		map.forEach((x,y) -> System.out.println(x+" "+y));
		
		map.entrySet().stream().filter(x -> x.getValue().startsWith("S")).forEach(System.out::println);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		 
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1.stream().mapToInt(i -> i).sum());
        
        
	
		
	}

	public static boolean place(boolean location) {
		if (location == true) {
			System.out.println("B");
		}
		System.out.println("A");
		return true;
	}

}
