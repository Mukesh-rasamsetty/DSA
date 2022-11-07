package datastructures.linear;

public class SingleLinkedList {
	private Node head;

	static class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	public SingleLinkedList() {
		this.head = null;
	}

	public void add(int value) {
		if (this.head == null) {
			this.head = new Node(value);
		} else {
			Node temp = this.head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			Node node = new Node(value);
			temp.setNext(node);
		}
	}

	public void add(int value, int index) {
		if (this.head == null) {
			System.out.println("Index out of Bounds...!");
		} else if (index == 0) {
			Node temp = new Node(value);
			temp.setNext(this.head);
			this.head = temp;
		} else {
			int i = 0;
			Node temp = this.head;
			while (i < index - 1 && temp.getNext() != null) {
				temp = temp.getNext();
				i++;
			}
			Node node = new Node(value);
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
	}

	public void delete(int value) {
		if (this.head != null) {
			if (this.head.getData() == value) {
				this.head = this.head.getNext();
				return;
			}
			Node temp = this.head;
			while (temp.getNext() != null && temp.getNext().getData() != value) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
	}

	public void traverse() {
		if (this.head == null) {
			System.out.println("List is Empty...!");
			return;
		}
		Node temp = this.head;
		while (temp.getNext() != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.traverse();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.traverse();
		linkedList.add(30, 1);
		linkedList.add(40, 0);
		linkedList.add(30, 6);
		linkedList.traverse();
		linkedList.delete(30);
		linkedList.traverse();
	}

}
