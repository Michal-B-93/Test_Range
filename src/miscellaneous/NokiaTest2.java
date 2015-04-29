package miscellaneous;

public class NokiaTest2 {

	static public int solution(int N)
	{
		if(N < 0 || N > 20000)
			throw new IllegalArgumentException();
		
		int result = 0;
		int height = 0;
		int NSquared = N * N;
		
		for(int i = N - 1; i > 0; --i)
		{
			height = NSquared - i * i;// disc height at the "i" point on the x axis
			height = (int)Math.floor(Math.sqrt(height));
			System.out.println(height);
			result += 2 * (height * 2 + 1);//points on the y axis where 'x' is i
			if(result > 1000000000)
				return -1;
		}
		
		result += 2;//two border points on the x axis
		result += N * 2 + 1;// points on the y axis
		
		return result;
	}
}
