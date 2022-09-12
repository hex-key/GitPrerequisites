import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Index {
	/**
	 * Can "initialize" a project which
		creates an empty file named 'index'
		creates a directory named 'objects'
		Can add Blobs given a filename
		Creates a blob for the given filename
		Saves the filename and Blob SHA1 as key/value pairs
		Appends that pair to a list in a file named 'index'
		Can remove Blobs given a filename
		Removes the filename and Blob SHA1 from the key/value pair
		Deletes the blob saved in the 'objects' folder
	 */

	public void initProject() {
		Path obj = Paths.get("objects");
		try {
			Files.createDirectory(obj);
		} catch (FileAlreadyExistsException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
