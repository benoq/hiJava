package hi.ressourceManagement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import hi.action.Constants;

public class ResourceLocator {
	
	public static void main( String[] args ) throws URISyntaxException, MalformedURLException
    {
       ResourceLocator objectOfThisClass = new ResourceLocator();
		
//		showRootDirOperatinSystem();
//		objectOfThisClass.showRootDirProject();
		URL u = objectOfThisClass.bringSourceFolder();
		System.out.println(u);
    }
	
	public static void showRootDirOperatinSystem() {
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path name: dirs) {
		    System.err.println("SytemRootFolder: " +name);
		}
	}
	
	public void showRootDirProject() throws URISyntaxException {
	    URL u = getClass().getProtectionDomain().getCodeSource().getLocation();
	    File f = new File(u.toURI());
	    System.out.println("RootfolderOfCompiledFiles: "+f.getParent());
	}
	
	public URL bringSourceFolder() throws URISyntaxException, MalformedURLException {
		return new File(Constants.pathForSrcFolder).toURI().toURL();
	}
}
