public class SortingTester {
	public static void main( String[] args )
	{
		int[] unsortedArray = {10, 1, 2, 3};
		SortingByStrategy mySorter = new SortingByStrategy();

		mySorter.strategy =  new BubbleSort();
		mySorter.sortAndPrint( unsortedArray );

		mySorter.strategy =  new MergeSort();
		mySorter.sortAndPrint( unsortedArray );

		mySorter.strategy =  new QuickSort();
		mySorter.sortAndPrint( unsortedArray );
	}
}