package hackerrank;

public class Calculator {

	 int power(int n, int p) throws Exception{
		int value = 0;

		if (n < 0 || p <0)
			throw new Exception ("n and p should be non-negative");
	
		value = (int) Math.pow(n,p);
		return value;
	}
}
