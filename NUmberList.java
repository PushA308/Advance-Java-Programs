public class NUmberList<T> implements IList<T>{
	private T[] datastore;
	private int size;
	private int pos;
	
	public NUmberList(int numElement){
		size = numElement;
		pos = 0; 
		datastore = (T[]) new Object[size];
	}
	public void add(T element){
	datastore[pos] = element;
	pos++;
	}	
	public T get(int n){
		return datastore[n];
	}	
}