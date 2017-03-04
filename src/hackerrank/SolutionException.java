package hackerrank;

import java.util.Scanner;

public class SolutionException {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		
		try {
			int s = Integer.parseInt(S);
			System.out.println(s);
		}
		catch(NumberFormatException e){
			System.out.println("Bad String");	
		}
	}
}
