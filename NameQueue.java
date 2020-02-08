import java.util.LinkedList;

public class NameQueue
{
	public static void main(String str[]){
		LinkedList<String> names = new LinkedList<String>();
		
		names.addLast("pusha");
		names.addLast("atm");
		names.addLast("green");
		names.addLast("drek");
		for (String s : names){
			System.out.println(s);
		}
		System.out.println();	
		System.out.println(names.size());
		names.removeFirst();
		for (String s : names){
			System.out.println(s);
		}
		System.out.println(names.size());	
	}

}