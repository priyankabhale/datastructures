package inheritance_rules_part2.copy;

public interface ChildInterface1 extends SuperInterface {

	@Override
	default void print() {
		System.out.println("Child interface 1");
	}

}
