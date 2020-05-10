package app;

import java.util.Arrays;

public class MyList<E> {
	private int size                    = 0;
	private static int DEFAULT_CAPACITY = 10;
	private Object elements[];

	public MyList(){
		elements = new Object[DEFAULT_CAPACITY];
	}

	public void ensureCapa() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	public void add(E e){
		if (size == elements.length) {
			ensureCapa();
		}
		elements[size++] = e;
	}

	/**
	 * #en: Get the object from a certain position
	 * #vi: Lấy đối tượng từ một vị trí nhất định
	 * get()
	 * @param index
	 * @return <E>
	 */
	public E get(int index){
		if (index>= size || index <0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
		}
		return (E) elements[index];
	}
}
