import java.util.TreeMap;

public class Numbers{
	public static void main(String str[]){
		TreeMap<String,String> numbers = new TreeMap<String,String>();
		
		numbers.put("push","123");
		numbers.put("caul","124");
		numbers.put("sady","125");
		numbers.put("dobby","126");
		numbers.put("marry","127");

		System.out.println(numbers.size());

		System.out.println(numbers.get("sady"));
		numbers.put("karen","128");
		System.out.println(numbers.size());
		numbers.remove("caul");
		System.out.println(numbers.size());

	}

}