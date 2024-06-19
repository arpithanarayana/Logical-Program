package com.te.datastructure;

public class MergeSortedLinkedList {
	private static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static Node mergeList(Node l1, Node l2) {
		Node node = new Node(0);
		Node current = node;
		while(l1!=null && l2!=null) {
			if(l1.data<=l2.data) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		if(l1!=null) {
			current.next = l1;
		} else {
			current.next = l2;
		}
		return node.next;
	}
	
	public void display(Node head) {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MergeSortedLinkedList merge = new MergeSortedLinkedList();
		Node l1 = new Node(1);
		l1.next = new Node(2);
		l1.next.next = new Node(3);
		Node l2 = new Node(4);
		l2.next = new Node(5);
		l2.next.next = new Node(6);
		Node mergeList = merge.mergeList(l1, l2);
		System.out.println(mergeList);
	}
}
