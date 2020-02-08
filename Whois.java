import java.net.*;
import java.io.*;

public class Whois{
	public static void main(String s[])throws Exception{
		Socket sock = new Socket("whois.internic.net",43);
		InputStream ip = sock.getInputStream();
		OutputStream op = sock.getOutputStream();
		String str = "infinityskills.com\n";
		byte buffer[] = str.getBytes();
	
		op.write(buffer);

		int ch;

		while((ch = ip.read()) != -1){
			System.out.print((char) ch);
		}
		sock.close();
	}	

}