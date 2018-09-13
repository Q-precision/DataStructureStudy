public class SherlockAndAnagram
{
	public static class Point {
		char key;
		long count;
		Point next;
		Point previous;

		public Point(char key, long count, Point previous)
		{
			this.key = key;
			this.count = count;
			this.previous = previous;	
			this.next = null;
		}
	}
	public static long solve( int n, String data)
	{
		if(n != data.length())
			return -1;

		// create the first point node 
		Point head = new Point(data.charAt(0), 1, null);
		Point current = head;
		for(int i=1; i<n; i++)
		{
			if(current.key == data.charAt(i))
				current.count++;
			else{
				Point next = new Point(data.charAt(i), 1, current);
				current.next = next;
				current = next;
			}
		}

		current = head;
		long answer = 0;
		while( current != null )
		{
			System.out.print(current.key + " => " + current.count + ", " );
			current = current.next;

			if( current.count == 1 )
			{
				// check prev and next for palindromic
				if(current.next == null)
					continue;

				if(current.prev.key == current.next.key)
				{
					answer +=
				}
			}
		}
		System.out.println();
		return 0;

	}

	public static void main( String[] args)
	{
		solve(4, "aaaa");
		// System.out.println("aaaa contains: " + solve(4, "aaaa") );
		// System.out.println("aaassda contains: " + solve(7, "aaassda") );
		solve(7, "aaassda");
	}
}