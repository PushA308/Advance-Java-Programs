import java.util.TreeSet;

public class WordList{
	public static void main(String str[]){
		String text;

		text = "i am very good engineering student from the vjt institute"+ "the main attraction of engineering is girls"+ "i live to the world of heritage in vjti" + "where are teacher are attractive especially lady teacher"+ "they have nice tone and figure" + "i love them very much" + "i will tell other student to join vjti college"+ "this institute is full of badass teacher";
		
		String[] words = text.split(" "); 		
	
		System.out.println("Size of text:"+text.length());
		for (String s : words){
			System.out.println(s);
		}
		
		TreeSet<String> wordList = new TreeSet<String>();
		for (String wl : words){
			wordList.add(wl);
		}
	
		System.out.println("treeset list of words size:"+wordList.size());
		for (String wl : wordList){
			System.out.println(wl);
		}		
	
	}


}