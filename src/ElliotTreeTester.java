import java.util.ArrayList;

public class ElliotTreeTester {
	public static void main (String [] args) {
		
		ArrayList<String> test = new ArrayList<String>();
		
		test.add("blob : hash1");
		test.add("tree: hash2");
		test.add("blob : hash3");
		
		Tree testTree = new Tree(test);
		
	}

}
