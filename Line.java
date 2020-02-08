import java.util.PriorityQueue;

public class Line{
	public static void main(String str[]){
		PriorityQueue<String> line = new PriorityQueue<String>();	
		line.add("john");
		line.add("cena");
		line.add("roman");	
		line.add("cris");
		line.add("seth");

		System.out.println("Size of line:"+line.size());
		for(String s : line){
			System.out.println(s);
		}
		line.poll();
		System.out.println("line after poll:");
		for(String s : line){
			System.out.println(s);
		}
		line.remove("roman");
		System.out.println("line after remove roman:");
		for(String s : line){
			System.out.println(s);
		}
		System.out.println(line.peek());
		
		



	}

}