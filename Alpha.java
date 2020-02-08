import java.util.TreeSet;

public class Alpha{
	public static void main(String srt[]){
		TreeSet<String> names = new TreeSet<String>();

		names.add("B");
		names.add("F");
		names.add("D");
		names.add("A");
		names.add("X");
		names.add("P");

		System.out.println("size:"+names.size());
		
		for(String s : names){
			System.out.println(s);
		}
		System.out.println("name before F:"+names.lower("F"));
		System.out.println("name before F:"+names.higher("F"));
	
		System.out.println("first element:"+names.first());
		System.out.println("second element:"+names.last());


	}

}