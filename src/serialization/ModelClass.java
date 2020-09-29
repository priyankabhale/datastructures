package serialization;

import java.io.Serializable;

public class ModelClass implements Serializable {
//	private static final long serialVersionUID = 42L;

	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
	}

}
