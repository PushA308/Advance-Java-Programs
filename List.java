public class List<T>{

	private T[] datastore;
	private int size;
	private int pos;

	public List(int numElements){
		size = numElements;
		pos = 0;
		datastore = (T[]) new Object[size];
	}
	public void add(T element){
		datastore[pos] = element;
		pos++;
	}
	public String tostring(){
		String element = "";
		for(int i=0;i<pos;i++){
			element += datastore[i] +  " ";
		}
		return element;

	}
}