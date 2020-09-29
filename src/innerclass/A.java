package innerclass;

public class A {
	private int i = 10;
	private static int m = 50;

	class B {
		int j = 11;
	}

	static class C {
		int k = 12;
		static int l = 13;
		public void ma() {
			System.out.println("test "+m);
		}
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.i);

		A.B b = a.new B();
		System.out.println(b.j);

		A.C c = new A.C();
		System.out.println(c.k);
		System.out.println(c.l);
		c.ma();
	}
}
