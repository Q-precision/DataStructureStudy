
class MergeSort implements Sorter {
	public String getName() { return "MergeSort"; }
	
	public void mergesortIt(int[] array, int[] temp, int from, int to)
	{
		if( from >= to)
			return;

		int middle = (from + to) / 2;
		mergesortIt( array, temp, from, middle); 	// sort the left
		mergesortIt( array, temp, middle + 1, to);	// sort the right
		mergeHalves( array, temp, from, to);		// merge the 2 half
	}

	public void mergeHalves(int[] array, int[] temp, int from, int to)
	{
		int leftEnd = (from + to) / 2;
		int rightStart = leftEnd + 1;
		int size = to - from + 1; 	

		int left = from;
		int right = rightStart;
		int index = from;

		while( left <= leftEnd && right <= to){
			if( array[left] <= array[right] )
			{
				temp[index] = array[left];
				left++;
			}
			else
			{
				temp[index] = array[right];
				right++;
			}
			index++;
		}

		System.arraycopy(array, left, temp, index, leftEnd - left  + 1);
		System.arraycopy(array, right, temp, index, to - right + 1);
		System.arraycopy(temp, from, array, from, size);
	}

	public void sort(int[] unsorted) {
		mergesortIt(unsorted, new int[unsorted.length], 0, unsorted.length - 1); 
	}
}