
class BubbleSort implements Sorter {
	public String getName() { return "BubbleSort"; }
	public void swap(int[] array, int from, int to)
	{
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}

	public void sort(int[] unsorted) 
	{
		boolean sorted = false;
		int unsortedDataIndex = unsorted.length - 1; 
		while( !sorted )
		{
			sorted = true;
			for (int i=0; i < unsortedDataIndex; i++ )
			{
				if( unsorted[i] > unsorted[i + 1] )
				{
					swap(unsorted, i, i + 1);
					sorted = false;
				}
			}

			unsortedDataIndex--;
		}
	}
}