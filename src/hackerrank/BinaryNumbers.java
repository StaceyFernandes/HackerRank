package hackerrank;
import java.util.Scanner;
public class BinaryNumbers {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int max = -999;
        int counter=0;
        int remainder;
        int num;
        
        while (n>0){
        remainder = n%2;
        n = n/2;
        if (remainder == 1){
            counter ++;
        }else{
            counter =0;
        }
        if(counter >max){
            max = counter;
        }
        }
        System.out.println(max);
    }
}
