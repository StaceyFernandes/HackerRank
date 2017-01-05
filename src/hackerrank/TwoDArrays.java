package hackerrank;
import java.util.Scanner;


public class TwoDArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max=-999;
        int count;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
          //      System.out.print(i);
          //     System.out.print(j);
                }
            }
    for (int i =0; i<4;i++){
    	for(int j=0; j<4; j++){
    		count = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    		/***System.out.println(arr[i][j]);
    		System.out.println(arr[i][j+1]);
    		System.out.println(arr[i][j+2]);
    		System.out.println(arr[i+1][j+1]);
    		System.out.println(arr[i+2][j]);
    		System.out.println(arr[i+2][j+1]);
    		System.out.println(arr[i+2][j+2]);**/

    		
    		
    		System.out.println("count " + count);
    		if(count > max){
    			max = count;
    			System.out.println(max);
    		}
    	}	
    }
    System.out.println(max);
    }    
}
//1 1 1 0 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 2 4 4 0 0 0 0 2 0 0 0 0 1 2 4 0


