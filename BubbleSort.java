//Bubble Sort
public class BubbleSort{
	public static void main(String str[]){
		int size = 10;
		int[] data = new int[size];
		
		for(int i=0;i<size;++i){
			data[i] = (int)(Math.random() * 50);
		}
		System.out.println("Elements before sorting:");
		for(int i=0;i<size;++i){
			System.out.println(data[i]);
		}

		for(int i=1;i<size;i++){
			for(int j=0;j<size-1;j++){
				if(data[j] > data[j+1]){
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements after sorting:");
		for(int i=0;i<size;++i){
			System.out.println(data[i]);
		}
		
	}
}