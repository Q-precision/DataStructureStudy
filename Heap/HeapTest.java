import java.util.*;
public class HeapTest {
	public static void main(String[] args)
	{
		int[] array = { 19, 100, 9, 10 };
		Heap myheap = new Heap(array);

		array = myheap.toArray();

		for( int item : array)
			System.out.println(item);
	}
}