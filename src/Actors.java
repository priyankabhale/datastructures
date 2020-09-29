import java.util.List;

public class Actors {

	String name;

	public Actors(String name) {
		super();
		this.name = name;
	}

	public Actors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Actors [name=" + name + "]";
	}
	
	

}
