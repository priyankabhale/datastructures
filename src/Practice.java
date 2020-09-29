import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		int num =0;
		String s = "123";
		for(int i=0;i<3;i++) {
			num = num*10+ (s.charAt(i)) -48;
		}
		System.out.println(num);
		
		List<Actors> list1 = Arrays.asList(new Actors("Tom"), new Actors("Bellatrix"), new Actors("Lucius"));
		List<Actors> list2 = Arrays.asList(new Actors("Harry"), new Actors("Ron"), new Actors("Hermione"));
		List<Actors> list3 = Arrays.asList(new Actors("Tom"), new Actors("Ron"), new Actors("Harry"));

		WebSeries webSeries1 = new WebSeries("HP1", 5, list1);
		WebSeries webSeries2 = new WebSeries("HP2", 10, list2);
		WebSeries webSeries3 = new WebSeries("HP3", 9, list3);

		List<WebSeries> webList = new ArrayList<>();
		webList.add(webSeries1);
		webList.add(webSeries2);
		webList.add(webSeries3);

//		webList.sort((WebSeries w1, WebSeries w2) -> w2.getRating() - w1.getRating());
//		webList.stream().limit(1).forEach(System.out::println);
		
		Map<Object, List<WebSeries>> map = webList.stream().collect(Collectors.groupingBy(e -> e.getActors()));
		map.entrySet().forEach(e -> System.out.println(e.getKey()+" "+e.getValue()));
		

	}
	static class Parent{
	    String name;
	    List<Child> sons;

	    public Parent(final String name, final List<Child> sons) {
	        this.name = name;
	        this.sons = sons;
	    }

	    @Override
	    public String toString() {
	    	return "Sons [name=" + name + " sons "+sons+" ]";
	    }
	}

	static class Child{
	    public Child(final String name) {
	        this.name = name;
	    }

	    String name;


	    @Override
	    public String toString() {
	    	return "Actors [name=" + name + "]";
	    }
	}

	static void SonsToFathers(){
	    Child c1 = new Child("aa");
	    Child c2 = new Child("bb");

	    List<Parent> parents = Arrays.asList(
	            new Parent("P1", Arrays.asList(c1)),
	            new Parent("P2", Arrays.asList(c1,c2)),
	            new Parent("P3", Arrays.asList(c2)));


//	    Map<Child,List<Parent>> childToParents = parents.stream()
//	            .flatMap(p -> p.sons.stream()
//	                    .collect(Collectors.toMap(Function.identity(), s -> p))
//	                    .entrySet()
//	                    .stream())
//	            .collect(Collectors.groupingBy(
//	                    Map.Entry::getKey, 
//	                    mapping(Map.Entry::getValue, e-> e)));


//	    System.out.println(childToParents);
	}

}
