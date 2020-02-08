import java.util.regex.*;

public class RegEx3{
	public static void main(String str[]){
		String names = "piyush atram kunal atran subhash atrom";
		String patt = "at.*?";
		Pattern pattern = Pattern.compile(patt);
		Matcher match = pattern.matcher(names);
		System.out.println(names);
		names = match.replaceAll("atram ");
		System.out.println(names);
		
	}
}