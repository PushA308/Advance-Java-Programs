import java.io.*;
import java.nio.file.*;

public class FileData{
	public static void main(String arg[]){
		Path filePath = Paths.get(arg[0]);
		System.out.println("File name:"+filePath.getName(1));
		try{
			if(!Files.isHidden(filePath)){
				System.out.println("File is not hidden.");
			}
			else{
				System.out.println("File is hidden.");
			}
			if(Files.isWritable(filePath)){
				System.out.println("File is writable.");
			}

			if(Files.isReadable(filePath)){
				System.out.println("File is readable.");
			}
		}
		catch(Exception e){
			System.out.println("Error checking file attributes");
		}
	}
}