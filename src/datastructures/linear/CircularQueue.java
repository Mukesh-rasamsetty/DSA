package datastructures.linear;

public class CircularQueue {
	private int front,rear;
	private int size;
	private int[] queue;
	
	public CircularQueue(int size) {
		this.size = size;
		this.front = this.rear = -1;
		this.queue = new int[size];
	}
	
	public boolean isEmpty() {
		return this.front == -1;
	}
	
	public boolean isFull() {
		return this.front == ((this.rear+1)%this.size);
	}
	
	public void enqueue(int value) {
		if(this.isFull()) {
			System.out.println("Circular Queue is Full...!");
			return;
		}
		if (this.front == -1) {
			this.front = 0;
		}
		this.rear = (this.rear + 1) % this.size;
		this.queue[this.rear] = value;
	}
	
	public int dequeue() {
		if (this.isEmpty()) {
			return -1;
		} else {
			int value = this.queue[this.front];
			if (this.rear == this.front) {
				this.rear = -1;
				this.front = -1;
			} else {
				this.front = (this.front + 1) % this.size;
			}
			return value;
		}
	}
	
	public void display() {
		if (this.front == -1 || this.rear == -1) {
			System.out.println("Circular Queue is Empty...!");
			return;
		}
		System.out.print("Elements in the Queue are: ");
		int i = this.front;
		while (i != this.rear) {
			System.out.print(this.queue[i]+" ");
			i = (i+1)%this.size;
		}
		System.out.print(this.queue[this.rear]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(3);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.display();
		System.out.println(queue.dequeue());
		queue.display();
		queue.enqueue(50);
		queue.display();
		System.out.println(queue.dequeue());
		queue.display();
		System.out.println(queue.dequeue());
		queue.display();
		System.out.println(queue.dequeue());
		queue.display();
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
	}
}
