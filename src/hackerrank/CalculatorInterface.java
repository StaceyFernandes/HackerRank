package hackerrank;

interface AdvancedArithmetic{
	int divisorSum(int n);
}
 class CalculatorInterface implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		//get divisors
		int sum = 0;
		for (int i=1; i<=n; i++){
			if ((n%i)==0){
				sum +=i;
				System.out.println(sum + " "+ i );
			}
			
		}
		return sum;
	}
	
	public static void main(String[] args){
		
		CalculatorInterface calcdiv= new CalculatorInterface();
		System.out.println(calcdiv.divisorSum());
	}
	
	
}
