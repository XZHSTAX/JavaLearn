package myGeneric;

public class MyArrayListClass<E> {
	Object[] obj = new Object[10];
	int size=0;
	
	
	public boolean add(E e) {	
		obj[size] = e;
		size++;
		return true;
	}
	
	public E get(int index) {
		return (E)obj[index];
	}
}
