import java.util.ArrayList;

public class AList{
	public static void main(String s[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Arraylist:"+al);
		System.out.println("ArrayList size"+al.size());
		int total =0;
		for(int i=0;i<al.size();i++){
			total += al.get(i);
		}
		double avg = total/al.size();
		System.out.println("Average:"+avg);
		al.remove(4);
		System.out.println("Arraylist:"+al);
		System.out.println("New ArrayList size"+al.size());	

		al.add(60);
		al.add(70);
		System.out.println(" newer Arraylist:"+al);
		System.out.println(" newer ArrayList size"+al.size());
		for(Integer i:al){
			total += i;
		}
		double avg1 = total/al.size();

		System.out.println("newer Average:"+avg1);
	}


}