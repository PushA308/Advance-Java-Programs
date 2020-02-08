public class ListDriver{
	public static void main(String a[]){
		List<String> glist = new List<String>(10);
		glist.add("milk");
		glist.add("eggs");
	
		System.out.println("Grocery List:"+glist.tostring());

		List<Integer> numbers = new List<Integer>(5);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);	

		System.out.println("Numbers:"+numbers.tostring());
		
	}
	
}