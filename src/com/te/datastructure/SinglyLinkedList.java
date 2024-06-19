package com.te.datastructure;

public class SinglyLinkedList {
	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	private Node head;
	public SinglyLinkedList() {
		this.head = null;
	}
	
	// add the element in list
	public void append(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
			return;
		} 
		Node current = head;
		if(current.next!=null) {
			current = current.next;
		}
		current.next = node;
	}
	
	// add the element at first
	public void prepend(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	
	// reverse the list
	public void reverse() {
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	// remove the element at particular index
	public void removeAtIndex(int index) {
		if(head==null || index<0) {
			return;
		} if(index ==0) {
			head = head.next;
		}
		Node current = head;
		Node prev = null;
		int c =0;
		while(current!=null && c<index) {
			prev = current;
			current = current.next;
			c++;
		}
		if(current==null) {
			return;
		}
		prev.next = current.next;
	}
	
	// add the element at particular index
	public void addAtIndex(int index, int data) {
		Node node = new Node(data);
		if(index<0) {
			return;
		} if(index==0) {
			node.next = head;
			head = node;
			return;
		}
		Node current = head;
		int c = 0;
		while(current!=null && c<index-1) {
			current = current.next;
			c++;
		}
		if(current==null) {
			return;
		}
		node.next = current.next;
		current.next = node;
	}
	
	// print the list element
	public void print() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.print();
	}

}
