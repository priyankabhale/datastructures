import java.util.ArrayList;
import java.util.List;

public class Interview {
	
	private List<Integer> list = new ArrayList<>();
	
	public Interview() {
		// TODO Auto-generated constructor stub
	}
	
	public Interview(int size) {
		list = new ArrayList<>(10);
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}
	
	
	//producer,: produces the data
	//consumer ; consumes the data
	//both of them will work asyn
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		ProducerDemo p = new ProducerDemo(list);
		Thread tp = new Thread(p);
		tp.start();
		
		ConsumerDemo c = new ConsumerDemo(list);
		Thread tc = new Thread(c);
		tc.start();

		
	}

}
