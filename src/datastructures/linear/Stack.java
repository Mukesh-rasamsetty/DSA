package datastructures.linear;

public class Stack {
	private int top;
	private int size;
	private int[] stack;

	public Stack(int size) {
		this.top = -1;
		this.size = size;
		this.stack = new int[size];
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return this.top == -1;
	}

	public boolean isFull() {
		return this.top == this.size-1;
	}

	public void push(int value) {
		this.top++;
		stack[this.top] = value;
	}

	public int pop() {
		if (this.isEmpty()) {
			return -1;
		} else {
			return stack[this.top--];
		}
	}

	public int peek() {
		if (this.isEmpty()) {
			return -1;
		} else {
			return stack[this.top];
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		System.out.println("Fuction: getSize()\tExcepted: 5\tActual: " + stack.getSize());
		System.out.println("Fuction: isEmpty()\tExcepted: true\tActual: " + stack.isEmpty());
		System.out.println("Fuction: isFull()\tExcepted: false\tActual: " + stack.isFull());
		System.out.println("Fuction: pop()\tExcepted: -1\tActual: " + stack.pop());
		System.out.println("Fuction: peek()\tExcepted: -1\tActual: " + stack.peek());
		stack.push(10);
		System.out.println("Fuction: isEmpty()\tExcepted: false\tActual: " + stack.isEmpty());
		System.out.println("Fuction: peek()\tExcepted: 10\tActual: " + stack.peek());
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("Fuction: isFull()\tExcepted: true\tActual: " + stack.isFull());
		System.out.println("Fuction: peek()\tExcepted: 50\tActual: " + stack.peek());
		System.out.println("Fuction: pop()\tExcepted: 50\tActual: " + stack.pop());
	}
}
