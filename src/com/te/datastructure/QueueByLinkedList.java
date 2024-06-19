package com.te.datastructure;

public class QueueByLinkedList {
	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node front;
	private Node rear;
	
	public QueueByLinkedList() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
	public void enqueue(int data) {
		Node node = new Node(data);
		if(isEmpty()) {
			front = rear = null;
		} else {
			rear.next = node;
			rear = node;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		} 
		int removedata = front.data;
		front = front.next;
		if(front!=null) {
			rear = null;
		}
		return removedata;
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		Node current = front;
		while(current!=null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return front.data;
	}
	
	public static void main(String[] args) {
		QueueByLinkedList queue = new QueueByLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.print();
		System.out.println("================================");
		System.out.println(queue.peek());
		System.out.println("================================");
		System.out.println(queue.dequeue());
	}
}
