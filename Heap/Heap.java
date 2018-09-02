
class Heap 
{
	int [] heap;
	int size;

	public Heap()
	{
		this.size = 0;
		int[] heap = new int[10];
	}

	public Heap(int[] data)
	{
		this.size = 0;
		this.heap = new int[ data.length ];

		for( int item : data )
			this.add(item);
	}

	private boolean hasParent(int childIndex)
	{
		return this.getParentIndex(childIndex) >= 0;
	}

	private int getParentIndex(int childIndex)
	{
		if(childIndex % 2 != 0)
			return (childIndex <= 2) ? childIndex - 1 : childIndex / 2 - 1;
		else
			return (childIndex <= 2) ? childIndex - 2 : childIndex / 2 - 2;
	}

	private int getLeftChildIndex(int parentIndex)
	{
		return parentIndex * 2 + 1;
	}	

	private int getRightChildIndex(int parentIndex)
	{
		return parentIndex * 2 + 2;
	}

	private boolean hasRightChild(int parentIndex)
	{
		return this.getRightChildIndex(parentIndex) < this.size;
	}

	private boolean hasLeftChild(int parentIndex)
	{
		return this.getLeftChildIndex(parentIndex) < this.size;
	}

	private void ensureEnoughSpace()
	{
		if(this.size >= this.heap.length)
		{
			int[] temp = new int[this.size * 2];
			for(int i=0; i < this.size; i++)
				temp[i] = this.heap[i];

			this.heap = temp;
		}
	}

	public void add(int item)
	{
		this.ensureEnoughSpace();
		this.heap[this.size] = item;
		this.heapifyUp(this.size);
		this.size++;
	}

	public int poll()
	{
		return 0;
	}

	public int peek()
	{
		return this.heap[0];
	}

	private void heapifyUp(int itemIndex)
	{
		if(this.hasParent(itemIndex))
		{
			int parentIndex = this.getParentIndex(itemIndex);
			if(this.heap[parentIndex] > this.heap[itemIndex])
				this.swap(parentIndex, itemIndex);
		}
	}

	private void heapifyDown()
	{

	}

	private void swap(int from, int to)
	{
		int temp = this.heap[from];
		this.heap[from] = this.heap[to];
		this.heap[to] = temp;
	}

	public int[] toArray()
	{
		return this.heap;
	}

}