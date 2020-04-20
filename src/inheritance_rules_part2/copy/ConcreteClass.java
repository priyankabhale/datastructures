package inheritance_rules_part2.copy;

public class ConcreteClass implements ChildInterface1
{
	public static void main(String[] args) {
		ConcreteClass classConcreteClass = new ConcreteClass();
		classConcreteClass.print();
	}
//			SuperInterface default print()
//				  |
//			ChildInterface1 default print()
//				  ||
//			ConcreteClass
//	when peint is called, the child interface print will be executed ,
}
