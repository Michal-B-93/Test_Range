package miscellaneous;

import java.util.Random;
public class SubsequentRandomValues {

	
	public SubsequentRandomValues(int chance, int tries, int tableSize)
	{
		if(chance < 0 || chance >= 100 || tries < 0 || tableSize < 1)
			throw new IllegalArgumentException();
		
		int[] tab = new int[tableSize + 1];
		int hits;
		Random random = new Random();
		
		for(int i = 0; i < tries; ++i)
		{
			hits = 0;
			for(;;++hits)
			{
				if((random.nextInt(100) + 1) > chance)
				{
					break;
				}
			}
			
			if(hits >= tableSize)
			{
				++tab[tableSize];
			}
			else
			{
				++tab[hits];
			}
		}
		
		for(int i: tab)
		{
			System.out.println(i);
		}
	}
}
