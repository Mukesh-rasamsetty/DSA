package datastructures.linear;

public class Queue {
	private int front, rear;
	private int size;
	private int[] queue;

	public Queue(int size) {
		this.front = -1;
		this.rear = -1;
		this.size = size;
		this.queue = new int[this.size];
	}

	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.front == -1 || this.front > this.rear;
	}

	public boolean isFull() {
		return this.rear == size - 1;
	}

	public int peek() {
		return this.isEmpty() ? -1 : this.queue[this.front];
	}

	public void enqueue(int value) {
		if (this.isFull()) {
			System.out.println("Queue is Full");
		} else {
			if (this.front == -1) {
				this.front = 0;
			}
			this.rear++;
			this.queue[this.rear] = value;
		}
	}

	public int dequeue() {
		if (this.isEmpty()) {
			return -1;
		} else {
			return this.queue[this.front++];
		}
	}

	public void display() {
		if (this.isEmpty()) {
			System.out.println("Queue is Empty...!");
		}
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enqueue(10);
		queue.display();
		queue.dequeue();
		queue.display();
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.display();
		queue.dequeue();
		queue.display();
		queue.enqueue(60);
		queue.dequeue();
		queue.display();
		queue.enqueue(70);
		queue.dequeue();
		queue.display();
		queue.enqueue(80);
		queue.dequeue();
		queue.display();
	}
}
