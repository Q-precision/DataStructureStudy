public class SortingTester {
	public static void main( String[] args )
	{
		SortingByStrategy mySorter = new SortingByStrategy();

		int[] unsortedArray = {10, 1, 5, 3};
		mySorter.strategy =  new BubbleSort();
		mySorter.sortAndPrint( unsortedArray );

		int[] unsortedArray2 = {10, 1, 5, 3};
		mySorter.strategy =  new MergeSort();
		mySorter.sortAndPrint( unsortedArray );

		int[] unsortedArray3 = {10, 1, 5, 3};
		mySorter.strategy =  new QuickSort();
		mySorter.sortAndPrint( unsortedArray );
	}
}