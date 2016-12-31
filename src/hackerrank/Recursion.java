package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Recursion {
	
    public  void main(String[] args) {
    	Integer number;
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("enter number:");
    	number = keyboard.nextInt();
    	factorial(number);	
    }
    public Integer factorial(Integer num){
    	if (num<0) return -999;
    	if (num == 0) return 1;
    	else return num * factorial(num-1);
    }
}