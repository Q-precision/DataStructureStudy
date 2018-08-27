
public class TestProgram {
	public static void main(String[] args)
	{
		LinkedList myList = new LinkedList();

		myList.head = new Node(5);
		System.out.print("Success! node addition number = " + myList.head.data);
	}
}