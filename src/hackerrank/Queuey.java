package hackerrank;
import java.util.LinkedList;
import java.util.Stack;

import sun.misc.Queue;

public class Queuey {
	
	LinkedList queue = new LinkedList();
	
	//making a queue instance
	public Queuey(){
		queue = new LinkedList();
	}
	//is it empty
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	//what is the size
	public int size(){
		return queue.size();
	}
	//enqueuing an item
	public void enqueue(int n){
		queue.addLast(n);	
	}
	//dequeuing an item
	public int dequeue(){
		return (int) queue.remove(0);
	}
	//peek at the first item
	public int peek(){
		return (int) queue.get(0);
	}
	public static void main(String [] args){
		Stack<String> stacky = new Stack<>();
		Queue<String> queue = new Queue<>();
		stacky.push("there?");
		stacky.push("you");
		stacky.push("hello");
		System.out.print(stacky.pop() +" ");
		System.out.print(stacky.pop() +" ");
		System.out.print(stacky.pop() +"end");
		
		/***
		Queuey numberQueue = new Queuey();
		numberQueue.enqueue(1);
		numberQueue.enqueue(2);
		System.out.print(numberQueue.dequeue() + " ");
		System.out.print(numberQueue.dequeue() + ".");
		***/
	}
}
