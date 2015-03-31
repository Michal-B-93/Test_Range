package miscellaneous;

public class Anagram {

	private int tab1[], tab2[];
	public Anagram(String str1, String str2)
	{
		tab1 = new int[26];
		tab2 = new int[26];
		stringToTable(str1, str2);
		display(tab1);
		display(tab2);
		if(equalTables(tab2, tab1))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Nie anagram");
		}
	}
	
	private void stringToTable(String str1, String str2)
	{
		char char1[] = str1.toCharArray(), char2[] = str2.toCharArray();
		for(int i = 0;i < str1.length(); ++i)
		{
			++tab1[char1[i] - 97];
		}
		for(int i = 0;i < str2.length(); ++i)
		{
			++tab2[char2[i] - 97];
		}
	}
	
	private boolean equalTables(int tab1[], int tab2[])
	{
		for(int i = 0; i < 26; ++i)
		{
			if(tab1[i] != tab2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	private void display(int tab[])
	{
		System.out.println("wypisuje tablice:");
		for(int i: tab)
		{
			System.out.println(i);
		}
	}
}
