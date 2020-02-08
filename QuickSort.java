//Quick Sort
public class QuickSort{
	public static void quickSort(int[] arr,int left,int right){
		int i = left;
		int j = right;
		int tmp;
		int pivot = arr[(left+right)/2];
	
		while(i<=j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if(i <=j){
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		if(left < j){
			quickSort(arr,left,j);
		}
		if(i < right){
			quickSort(arr,i,right);
		}	
	}

	public static void display(int[] arr){
			for(int i=0;i<arr.length;++i){
				System.out.println(arr[i]);
			}	
	
	}	


	public static void main(String str[]){
		int[] data = new int[]{4,7,3,9,1,2,5,6,10,8};
		System.out.println("array before sorting:");
		display(data);
		quickSort(data,0,data.length-1);
		System.out.println("array after sorting:");
		display(data);	
	}

}