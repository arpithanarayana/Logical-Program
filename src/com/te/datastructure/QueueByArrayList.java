package com.te.datastructure;

import java.util.ArrayList;

public class QueueByArrayList {
	private static ArrayList<Integer> items;
	
	public QueueByArrayList() {
		items = new ArrayList<>();
	}
	
	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	public int size() {
		return items.size();
	}
	
	public void append(int data) {
		items.add(data);
	}
	
	public int prepend() {
		if(isEmpty()) {
			return 0;
		}
		return items.remove(0);
	}
	
	public int peek() {
		if(isEmpty()) {
			return 0;
		}
		return items.get(0);
	}
	
	public void print() {
		for(int num: items) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		QueueByArrayList list = new QueueByArrayList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.print();
		System.out.println("=========================");
		list.prepend();
		list.print();
		System.out.println("===========================");
		System.out.println(list.peek());
		System.out.println("============================");
 	}

}
