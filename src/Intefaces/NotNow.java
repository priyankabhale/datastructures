package Intefaces;

@FunctionalInterface
public interface NotNow {
	
	void dontDoIt();
	
	default void show() {
		System.out.println("NotNow");
	}
}
