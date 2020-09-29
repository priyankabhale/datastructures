package collectiontests;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class CollectionsImpl{
	public static void main(String[] args) {
		List<Integer> linkedlist = new LinkedList();
		List<Integer> arraylist = new ArrayList();
		List<Integer> vector = new Vector<>();
		List<Integer> stack = new Stack();
		List<Integer> cp = new CopyOnWriteArrayList<>();
		
		Set<Integer> hashset = new HashSet<>();
		Set<Integer> treeset = new TreeSet<>();
		Set<Integer> lSet = new LinkedHashSet();
		
		Queue pQ= new PriorityQueue<>();
		Queue pBQ= new PriorityBlockingQueue<>();
		Queue dQ= new ArrayDeque<>();
		
		Properties p = new Properties();
		Map hmp = new HashMap<>();
		Map lhmp = new LinkedHashMap<>();
		Map ht = new Hashtable();
		Map tmp = new TreeMap<>();
		Map chmp = new ConcurrentHashMap<>();
		Map whmp = new WeakHashMap<>();
		
		
//		seti.add(1);
//		seti.add(2);
//		A a = new A();
//		System.out.println(a.getInt());
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		System.out.println(q.poll());
		System.out.println(q.remove());
		System.out.println(q.remove());// gives error
		
	}
}

//class A{
//	public Number getInt() {
//		return 1;
//	}
//}

//class B extends A{
//	public Integer getInt() {
//		return 2;
//	}
//}