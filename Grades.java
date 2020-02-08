import java.util.HashMap;

public class Grades{
	public static void main(String s[]){
		HashMap<String,Integer> grades = new HashMap<String,Integer>();
		grades.put("push",70);
		grades.put("atm",80);
		grades.put("kusha",60);
		grades.put("motha",90);

		System.out.println(grades.get("push"));

		System.out.println(grades.size());

		if(grades.containsKey("atm"))
		{
			grades.remove("atm");
			System.out.println("entry removed");
			
		}	
		System.out.println(grades.size());

	}



}