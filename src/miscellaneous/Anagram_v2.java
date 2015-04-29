package miscellaneous;

import java.util.Arrays;

public class Anagram_v2 {
	
	static public boolean areAnagrams(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		char tab1[] = str1.toCharArray();
		char tab2[] = str2.toCharArray();
		
		Arrays.sort(tab1);
		Arrays.sort(tab2);
		
		for(int i = 0; i < tab1.length; ++i)
		{
			if(tab1[i] != tab2[i])
			{
				return false;
			}
		}
		
		return true;
	}
}
