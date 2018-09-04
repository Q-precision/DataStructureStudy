class SortingByStrategy {
	public Sorter strategy;

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
	}
}