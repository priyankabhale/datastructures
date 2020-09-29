public class ClassLoaderTest extends ClassLoader {
	
	synchronized void message() {
			try {
				System.out.println("waiting started ... ");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		try {
			
			ClassLoaderTest c = new ClassLoaderTest();
			c.message();
			
//			System.out.println("Class loader for current : "+ClassLoaderTest.class.getClassLoader());
//			Class.forName("ClassLoaderTest", true, ClassLoader.class.getClassLoader().getParent());

//			ArrayList<Employee> list = new ArrayList<>();
//			Employee employee = new Employee(1, "Kani", 123334);
//			Employee employee1 = new Employee(1, "Mani", 123876834);
//			Employee employee2 = new Employee(1, "Guni", 2432334);
//			list.add(employee);
//			list.add(employee1);
//			list.add(employee2);
//
//			Collections.sort(list);
//			System.out.println("sort by Name in descending");
//
//			list.stream().forEach(e -> System.out.println(e.getName()));
//			System.out.println();
//
//			System.out.println("sort by Salary in ascending");
//
//			Collections.sort(list, new Comparator<Employee>() {
//				@Override
//				public int compare(Employee o1, Employee o2) {
//					return (Long.valueOf(o1.getSalary()).compareTo(Long.valueOf(o2.getSalary())));
//				}
//			});
//
////			Collections.sort(list, (Employee a, Employee b) -> b.getName().compareTo(a.getName()));
//
//			list.stream().forEach(e -> System.out.println(e.getName()));
//
//			HashMap<Integer, String> map = new HashMap<>();
//			map.put(27657, "Zack");
//			map.put(17125, "cody");
//			map.put(8691, "Candice");
//			List mapTolist = new LinkedList<>(map.entrySet());
//
//			Collections.sort(mapTolist, new Comparator<Map.Entry<Integer, String>>() {
//				public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//					return o1.getValue().compareTo(o2.getValue());
//				}
//			});
//
//			Set<Entry<Integer, String>> set = map.entrySet();
//			for (Map.Entry<Integer, String> m : set) {
//				System.out.println(m.getValue());
//			}
//
//			Map<Integer, String> conMap = new ConcurrentHashMap<>();
//			conMap.put(null, "abc");
//			
//			Map<Integer, String> hashTableMap = new Hashtable<>();
//			hashTableMap.put(null, "pqr");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
