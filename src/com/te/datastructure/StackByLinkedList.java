package com.te.datastructure;

public class StackByLinkedList {
	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	private Node top;
	public StackByLinkedList() {
		this.top = top;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int removedata = top.data;
		top = top.next;
		return removedata;
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return top.data;
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		Node current = top;
		while(current!=null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		StackByLinkedList stack = new StackByLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.print();
		System.out.println("==============================");
		System.out.println(stack.pop());
		System.out.println("================================");
		System.out.println(stack.peek());
	}

}
