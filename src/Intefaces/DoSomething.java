package Intefaces;

@FunctionalInterface
public interface DoSomething {
	
	void doSomethingPlease();
	
	default void show() {
		System.out.println("Do Something");
	}
}
