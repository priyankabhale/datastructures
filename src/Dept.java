import java.util.HashMap;
import java.util.Map.Entry;

public class Dept {

	private int depid;
	private String deptname;

	public Dept(int depid, String deptname) {
		super();
		this.depid = depid;
		this.deptname = deptname;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	@Override
	public int hashCode() {
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public String toString() {
		return "Dept [depid=" + this.depid + ", deptname=" + this.deptname + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + depid; result = prime * result + ((deptname ==
	 * null) ? 0 : deptname.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Dept other = (Dept) obj; if (depid != other.depid) return false; if
	 * (deptname == null) { if (other.deptname != null) return false; } else if
	 * (!deptname.equals(other.deptname)) return false; return true; }
	 */
	public static void main(String[] args) {

		Dept dept = new Dept(1, "it");
		Dept dept1 = new Dept(1, "itko");
		Dept dept2 = new Dept(1, "itpol");

		// Dept dept1 =new Dept(2, "electro");
		// Dept dept1 =new Dept(1, "it");

		// Dept dept1 =new Dept(2, "electro");
		// Dept dept2 =new Dept(3, "machine");

		System.out.println(dept.hashCode());
		System.out.println(dept1.hashCode());
		System.out.println(dept2.hashCode());

		System.out.println(dept == dept1);

		HashMap<Dept, String> map = new HashMap<>();
		map.put(dept, "a");
		map.put(dept1, "b");
		map.put(dept2, "c");

		System.out.println(map);

		dept.setDepid(4);
		// dept.setDeptname("machine");

		System.out.println(map);

		System.out.println(map.get(dept));

		System.out.println("***********************");
		System.out.println(map);
		map.remove(dept);

		System.out.println(map);
		map.put(dept, "e");
		System.out.println(map);
		System.out.println(map.get(dept));

		System.out.println();

		for (Entry<Dept, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		/*
		 * int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 10 };
		 * 
		 * 
		 * 
		 * 
		 * int arr[]= {1,2,3,5,6,7,8,9,10,11,12,14,15,17,18,19,20};
		 * 
		 * int temp[]=new int[20];
		 * 
		 * for(int i:arr) { temp[i-1]=1; }
		 * 
		 * for(int i=0;i<temp.length;i++) {
		 * 
		 * if(temp[i]==0) { System.out.println(i+1); } }
		 * 
		 * int y = 0; int z = 0; int a = 0; int size = arr.length - 1; for (int x = 0 ;
		 * x < size; x++){ y = x+1; z = arr[y] - arr[x]; a = arr[x] + 1; if (z==1){
		 * continue; } else{ System.out.println("The Missing Number is " + a ); } }
		 * 
		 * 
		 * 
		 * int n=10; int arr2[]={10,1,3,10}; int arr4[]=
		 * {1,2,3,5,6,7,8,9,10,11,12,14,15,17,18,19,20};
		 * 
		 * // int arr2[]={10,10,4,4,3,2,5,3,2,8,8}; int
		 * arr1[]={1,2,4,5,6,8,9,7,3,10,2,8}; System.out.println("first array");
		 * missingNo(arr4,20); System.out.println("\nsecond array:"); missingNo(arr1,n);
		 * 
		 * 
		 * int[] array = {1, 2,3,4, 6}; for (int i = 0; i < array.length - 1; i++) { if
		 * (array[i + 1] != array[i] + 1) { System.out.println("MISSING ELEMENT " +
		 * (array[i] + 1)); } }
		 */

	}

	public static void missingNo(int arr[], int n) {
		int b[] = new int[n];
		int flag = 0;
		for (int i = 0; i < arr.length; i++) { // [10, 1, 3, 10]
			b[arr[i] - 1] = arr[i];
		}
		// System.out.println(Arrays.toString(b));
		for (int i = 0; i < n; i++) {
			if (b[i] == 0) {
				flag = 1;
				System.out.print(i + 1 + ",");
			}
		}
		if (flag == 0) {
			System.out.println("No missing element");
		}
	}

}
