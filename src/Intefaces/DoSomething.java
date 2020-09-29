package Intefaces;

@FunctionalInterface
public interface DoSomething {
	
	int doSomethingPlease(int x , int y);
	
	default void show() {
		System.out.println("Do Something");
	}
	
	default void showa() {
		System.out.println("Do Something a");
	}
	
	static void test() {
		System.out.println("Static");
	}
	
	static void test(int a) {
		System.out.println("Static = 2");
	}
}
