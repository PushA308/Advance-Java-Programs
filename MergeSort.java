//Merge Sort
public class MergeSort{
	public static void mergeSort(int[] arr,int low,int high){
		int size = arr.length;
		if(low<high){
			int middle = (low + high) / 2;
			mergeSort(arr,low,middle);
			mergeSort(arr,middle+1,high);
			merge(arr,low,middle,high);
		}	
	}

	public static void merge(int[] arr,int low, int middle, int high){
		int size =arr.length;
		int[] tmp = new int[size];
		for(int i=low;i<=high;++i){
			tmp[i] = arr[i];
		}
		int i=low;
		int j=middle+1;
		int k=low;

		while(i<=middle && j<=high){
			if(tmp[i] <=tmp[j]){
				arr[k] = tmp[i];
				++i;	
			}else{
				arr[k] = tmp[j];
				++j;
			}
			k++;
		}
		while(i<=middle){
			arr[k] = tmp[i];
			++k;
			++i;
		}
	}

	public static void main(String str[]){
		int size = 10;
		int[] data = new int[]{4,2,6,1,9,7,8,5,3,10};
		int low =0;
		int high =9;
		System.out.println("Elements before sorting:");
		for(int i=0;i<size;++i){
			System.out.println(data[i]);
		}
		mergeSort(data,low,high);
		
		System.out.println();
		System.out.println("Elements after sorting:");
		for(int i=0;i<size;++i){
			System.out.println(data[i]);
		}
		
	}
}