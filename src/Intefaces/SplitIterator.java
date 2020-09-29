package Intefaces;
import java.util.Iterator;
import java.util.List;

public class SplitIterator implements Iterator<Integer>{
	
	private List<Integer> l;
	int count = -2;
	
	public SplitIterator(List<Integer> l) {
		this.l = l;
	}

	@Override
	public boolean hasNext() {
		int size = l.size();
		return ((count+2) < size);
	}

	@Override
	public Integer next() {
		count = count+2;
		return l.get(count);
	}

}
