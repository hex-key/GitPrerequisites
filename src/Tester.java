import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Index i = new Index();
		i.initProject();
		i.addBlob("funContent.txt");
		Scanner kb = new Scanner(System.in);
		System.out.println("check stuff now");
		String s = kb.next();
		i.removeBlob("funContent.txt");
	}

}
