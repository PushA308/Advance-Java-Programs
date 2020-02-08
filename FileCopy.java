import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class FileCopy{
	public static void main(String arg[]) throws IOException{
		File sourceFile = new File(arg[0]);
		File destFile = new File(arg[1]);	
		if(!destFile.exists()){
			destFile.createNewFile();
		}
		FileChannel sourceChannel = null;
		FileChannel destChannel = null;

		try{
			sourceChannel = new FileInputStream(sourceFile).getChannel();
			destChannel = new FileOutputStream(destFile).getChannel();
			destChannel.transferFrom(sourceChannel,0,sourceChannel.size());  
		}
		finally{
			if(sourceChannel != null){
				sourceChannel.close();
			}
			if(destChannel != null){
				destChannel.close();
			}
		}
	}
}