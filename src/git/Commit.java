package git;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;

public class Commit {
	private Commit parent = null;
	private Commit child = null;
	
	private Path pTree;
	
	private String summary;
	private String author;
	private String date;
	
	public String hash;
	
	public Commit(String pt, String changes, String auth, Commit prev) {
		this.pTree = Paths.get(pt);
		this.summary = changes;
		this.author = auth;
		this.date = getDate();
		prev.setChild(this);
	}
	
	public void setChild(Commit next) {
		this.child = next;
	}
	
	public String encrypt(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger num = new BigInteger(1, messageDigest);
			String hex = num.toString(16);
			while (hex.length() < 32) {
				hex = "0" + hex;
			}
			return hex;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getDate() {
		return LocalDate.now().toString();
	}
	
	public void writeFile() throws Exception {
		String content = this.summary + this.date + this.author ; // also get path of parent commit dsfasdflkjs
		String shaHash = encrypt(content);
		this.hash = shaHash;
		PrintWriter pw = new PrintWriter(new FileWriter(new File("objects/" + shaHash)));
		pw.println(pTree);
		pw.println(parent == null ? "" : parent.hash);
		pw.println(child == null ? "" : child.hash);
		pw.println(author);
		pw.println(date);
		pw.println(summary);
	}
	
}
