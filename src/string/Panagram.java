package string;

public class Panagram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		int mark[] = new int[26];
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				index = str.charAt(i) - 'A';
			} else if (c >= 'a' && c <= 'z') {
				index = str.charAt(i) - 'a';
			} else
				continue;
			
			mark[index] = 1;

		}
		
		boolean flag = false; 
		for(int m :mark) {
			if(m==0) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("not an panagram");
		else
			System.out.println("A panagram");
			
	}

}
