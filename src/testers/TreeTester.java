package testers;
import java.util.ArrayList;

import git.Blob;
import git.Tree;

public class TreeTester {
	public static void main (String [] args) {
		
		ArrayList<String> test = new ArrayList<String>();
		
		Blob blob1 = new Blob("file1.txt");
		
		Tree testTree = new Tree(test);
		
	}
}
