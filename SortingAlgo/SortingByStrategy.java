class SortingByStrategy {
	public Sorter strategy;

	private void print(int[] array)
	{
		System.out.println("Sorted by " + strategy.getName() + "strategy" );
		for(int item : array)
		{
			System.out.print(item + "  ");
		}
		System.out.println("\n");
	}

	public SortingByStrategy()
	{
		this.strategy = null;
	}

	public SortingByStrategy(Sorter strat)
	{
		this.strategy = strat;
	}

	public void sortAndPrint(int[] data)
	{
		if(strategy == null)
			return;
		
		strategy.sort(data);
		print(data);
	}
}