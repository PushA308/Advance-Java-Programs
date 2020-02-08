public class StringB{
	public static void main(String[] arg){
		StringBuilder line = new StringBuilder("now the time");
		System.out.println(line.toString());
		/*line.insert(8,"race");
		System.out.println(line.toString());
		System.out.println("found at index:"+line.indexOf("the"));
		line.delete(4,7);
		System.out.println(line.toString());
		line.deleteCharAt(7);
		System.out.println(line.toString());
		*/
		line.reverse();
		System.out.println(line.toString());
		
	}
}