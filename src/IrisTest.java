import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class IrisTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		Path filePathToWrite = Paths.get("test.txt");
		try {
			Files.writeString(filePathToWrite, "First testing file", StandardCharsets.ISO_8859_1);
		}
		catch (IOException exception) {
			System.out.println("Write failed");
		}
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		// delete the index file. we will rewrite soon
	    File indexFile = new File("test.txt"); 
	    if (indexFile.delete()) { 
	      System.out.println("Final delete successful");
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
		
	}

	@Test
	void testInit() {
		Index index = new Index();
		
		index.initProject();
		
		File file = new File ("index");
		
		assertTrue(file.exists());
	}
	
	

}
