public class List<T>{

	private T[] datastore;
	private size;
	private pos;

	public List(int numElements){
		size = numElements;
		pos = 0;
		datastore = (T[]) new Object[size];
	}

}