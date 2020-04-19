package HashTable;

public class HashTableClass {
	StdList[] arr;
	int size;
	int totalstudents;

	public HashTableClass() {
		size = 100;
		arr = new StdList[100];
	}

	int toHashcode(int r) {
		int ascii = 0;
		int codeval = 0;
		ascii = (int) (char) r;
		codeval = ascii % arr.length;
		return codeval;
	}

	boolean insert(int key, Student data) {
		if (arr[key] == null) {
			arr[key] = new StdList();
		}
		arr[key].insertItem(data);
		totalstudents++;
		return true;
	}

	int getTotal() {
		return totalstudents;
	}

	Student fetchStdInfor(int rollno) {
		int key = toHashcode(rollno);
		if (arr[key] == null)
			return null;
		else {
			Student student = arr[key].findItem(rollno);
			if (student != null)
				return student;
			else
				return null;
		}
	}

	boolean deleteStd(int r) {
		boolean have = arr[toHashcode(r)].haveRollNo(r);
		if (have) {
			int key = toHashcode(r);
			arr[key].deleteItem(r);
			totalstudents--;
			return true;
		}
		return false;
	}

	void showData() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				arr[i].showItem();
		}

	}

}
