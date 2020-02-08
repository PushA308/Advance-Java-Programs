import java.util.*;

public class StackEx{
	public static void main(String str[]){
		Stack<String> names = new Stack<String>();

		names.push("pusha");
		names.push("atm");
		names.push("kesha");
		names.push("dura");

		System.out.println("current peek:"+names.peek());				
		System.out.println("stack elements:" );					
		for (String s : names){
			System.out.println(s);
		}
		System.out.println("stack size:"+names.size());				

		names.pop();

		System.out.println("current peek:"+names.peek());				
		System.out.println("stack elements:" );					
		for (String s : names){
			System.out.println(s);
		}
		System.out.println("stack size:"+names.size());				
		

	}

}