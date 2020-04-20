package inheritance_rules;

public class ConcreteClass implements ChildInterface1,ChildInterface2
{
	public static void main(String[] args) {
		ConcreteClass classConcreteClass = new ConcreteClass();
		classConcreteClass.print();
	}

	//				SuperInterface(I)
	//				default print()
	//			       /		 \
	//			      /			  \
	//	ChildInterface1(I)		ChildInterface2(I)
//					 \\ 		   //
//					  \\		  //
//					 ConcreteClass(C)
//	if we use print method in the class then superinterface print will be executed
}
 