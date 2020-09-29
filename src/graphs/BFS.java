package graphs;

public class BFS{
	
	public void name(long a) {
		System.out.println("long");
	}
	
	public void name(Integer a) {
		System.out.println("Integer");
	}
	
	public static void main(String[] args) {
//		Integer i = 127;
//		Integer i1 = new Integer(127);
//		System.out.println();
		BFS b = new BFS();
		b.name(new Integer(1));
	}

}
