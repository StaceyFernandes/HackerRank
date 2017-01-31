package hackerrank;

public class Difference {
	private int[] elements;
	public int maximumDifference;
	
	Difference(int[] elements){
		this.elements = elements;
	}
	
	
	public void computeDifference(){
		//brute force suggested - found min and found max and returned diff
		int min=10000000;
		int max= -10000000;
		for (int i=0; i<elements.length; i++){
			if (elements[i]< min){
				min = elements[i];
			}
			if (elements[i]>max){
				max = elements[i];
			}
		}
		this.maximumDifference = max-min;
		//return maximumDifference;
	}
	
}
