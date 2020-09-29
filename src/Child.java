import java.util.Arrays;
import java.util.HashMap;

public class Child extends Parent {
	int x = 15;

	public Child() {
	}

	public static void testParent(int arr[])  {
		arr[1] = 10;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		testParent(arr);
		System.out.println(Arrays.toString(arr));
		
		Child c = new Child();
		Parent p = new Parent();
		Parent pnew = new Child();
		System.out.println(c.x + " " + p.x + " " + ((Child) pnew).x + " " + pnew.x);

		// upcasting ~ casting child to a parent
		p = c;

//		downcasting ~ casting from parent to child
		c = (Child) pnew;

//		throw an exception because Parent's runtime object is Parent but not Child
//		it is not possible to cast superclass to subclass so, this will end up with ClassCastException.
//		(for this to work comment 14th and 17th line)
//		c = (Child)p;

		HashMap<String, String> m = new HashMap<>();
		m.keySet();
		m.values();
		m.entrySet();

	}

}
