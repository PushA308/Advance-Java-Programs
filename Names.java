import java.util.HashSet;

public class Names{
	public static void main(String str[]){
		HashSet<String> names = new HashSet<String>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");

		System.out.println(names.size());
		for (String name: names){
			System.out.println(name);
		}
		String s = "E";
	
		if(names.contains(s)){
			System.out.println(s+" is present in set");
		}else{
			System.out.println(s+" is not present in set");
		}

	}


}