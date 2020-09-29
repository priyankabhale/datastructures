package ArrayAlgortihms;

import java.io.FileNotFoundException;

public class BTest extends ATest {
	@Override
	public void normalMethod() throws FileNotFoundException {
		System.out.println("B Test");
	}

	public void specificB() {
		System.out.println("B specific method ");
	}

	public static void staticMethod() {
		System.out.println("B Test static");
	}

	public void name(Integer a) {
		System.out.println("Integer");
	}

	public void name(int a) {
		System.out.println("int");
	}
	
	public void name(double a) {
		System.out.println("double");
	}
	
	public void name(long a) {
		System.out.println("long");
	}

	public void overloadtest(Object o) {
		System.out.println("object");
	}

	public void overloadtest(String o) {
		System.out.println("string");
	}

	public static void demoMethod() {
		System.out.println("method of sub class");
	}

//	public void test() {
//		System.out.println("Btest");
//	}

	public static void main(String[] args) {
		ATest.staticMethod();
		BTest.staticMethod();
//		BTest.demoMethod();

		BTest b = new BTest();
		b.name(10l);
		b.overloadtest("here");
	}
}
