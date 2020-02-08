//metacharacters: \w \d \s

import java.util.regex.*;

public class RegEx2{
	public static void main(String str[]){
		String words = "now is the 10 times faster or now it is not 90 times slow";
		//String patt = "\\w+";
		//String patt = "\\d+";
		String patt = "\\s";
		Pattern pattern = Pattern.compile(patt);
		Matcher match = pattern.matcher(words);
		System.out.println(words);
		/*while(match.find()){
			System.out.println("found"+patt+"at: "+match.start());
			System.out.println("match:"+match.group());
		}*/
		int count = 0;
		while(match.find()){
			++count;
		}
		System.out.println("Total spaces:"+count);		
	}
}







