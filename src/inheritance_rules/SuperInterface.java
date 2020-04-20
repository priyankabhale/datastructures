package inheritance_rules;

public interface SuperInterface {
	default void print() {
		System.out.println("SuperInterface");
	}
}
