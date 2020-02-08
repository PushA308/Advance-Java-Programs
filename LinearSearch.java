
public class LinearSearch{
	public static int min(int[] arr){
		int minimum = arr[0];
	
		for(int i=1;i<arr.length;i++){
			if(arr[i] <minimum){
				minimum = arr[i];
			}
		}
		return minimum;
	}

	public static void main(String str[]){
		int[] data = new int[]{4,7,3,9,1,2,5,6,10,8};
		
		int minimum = min(data);
		
		System.out.println("min num is:"+minimum);
	}
}