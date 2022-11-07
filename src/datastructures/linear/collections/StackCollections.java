package datastructures.linear.collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackCollections {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		System.out.println("Fuction: size()\tExcepted: 0\tActual: " + stack.size());
		System.out.println("Fuction: isEmpty()\tExcepted: true\tActual: " + stack.isEmpty());
		try {
			stack.pop();
		} catch (EmptyStackException e) {
			try {
				stack.peek();
			} catch (Exception ex) {
				stack.push(10);
				System.out.println("Fuction: isEmpty()\tExcepted: false\tActual: " + stack.isEmpty());
				System.out.println("Fuction: peek()\tExcepted: 10\tActual: " + stack.peek());
				stack.push(20);
				stack.push(30);
				stack.push(40);
				stack.push(50);
				System.out.println("Fuction: size()\tExcepted: 5\tActual: " + stack.size());
				System.out.println("Fuction: peek()\tExcepted: 50\tActual: " + stack.peek());
				System.out.println("Fuction: pop()\tExcepted: 50\tActual: " + stack.pop());
			}
		}
	}
}
