import java.nio.file.Path;
import java.time.LocalDate;

public class Commit {
	private Commit parent = null;
	private Commit child = null;
	
	private Path pTree;
	
	private String summary;
	private String author;
	private String date;
	
	public Commit(String pt, String changes, String author, Commit prev) {
		
	}
	
	public void setChild(Commit next) {
		
	}
	
	public String encrypt(String contents) {
		
	}
	
	public String getDate() {
		return LocalDate.now();
	}
	
	public void writeFile() {
		
	}
	
}
