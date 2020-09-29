package ArrayAlgortihms;

class Demo {
	public static void demoMethod() {
		System.out.println("method of super class");
	}
}

public class Sample extends Demo {
	public static void demoMethod() {
		System.out.println("method of sub class");
	}

	public static void main(String args[]) {
		Sample.demoMethod();
	}
}