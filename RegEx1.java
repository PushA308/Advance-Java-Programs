import java.util.regex.*;

public class RegEx1{
	public static void main(String str[]){
		String words = "now is the time or now it is not the time";
		String patt = "is";
		Pattern pattern = Pattern.compile(patt);
		Matcher match = pattern.matcher(words);
		System.out.println(words);
		while(match.find()){
			System.out.println("found"+patt+"at: "+match.start());
			System.out.println("match:"+match.group());
		}
	}
}