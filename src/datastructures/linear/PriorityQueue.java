package datastructures.linear;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {
	private void heapify(List<Integer> list, int i) {
		int size = list.size();
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < size && list.get(left) > list.get(largest)) {
			largest = left;
		}
		if (right < size && list.get(right) > list.get(largest)) {
			largest = right;
		}
		if (largest != i) {
			int temp = list.get(largest);
			list.set(largest, list.get(i));
			list.set(i, temp);
			heapify(list, largest);
		}
	}

	public void insert(List<Integer> list, int value) {
		int size = list.size();
		if (size == 0) {
			list.add(value);
		} else {
			list.add(value);
			for (int i = size / 2 - 1; i >= 0; i--) {
				heapify(list, i);
			}
		}
	}

	public void deleteNode(List<Integer> list, int value) {
		int size = list.size();
		int i;
		for (i = 0; i < size; i++) {
			if (value == list.get(i))
				break;
		}
		int temp = list.get(i);
		list.set(i, list.get(size - 1));
		list.set(size - 1, temp);
		list.remove(i - 1);
		for (int j = size / 2 - 1; j >= 0; j--) {
			heapify(list, j);
		}
	}

	public void printArray(List<Integer> list) {
		for (Integer value : list) {
			System.out.print(value + " ");
		}
	}

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>();
		PriorityQueue h = new PriorityQueue();
		h.insert(array, 3);
		h.insert(array, 4);
		h.insert(array, 9);
		h.insert(array, 5);
		h.insert(array, 2);

		System.out.println("Max-Heap array: ");
		h.printArray(array);

		h.deleteNode(array, 4);
		System.out.println("After deleting an element: ");
		h.printArray(array);
	}

}
