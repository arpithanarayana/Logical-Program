package com.te.datastructure;

import java.util.ArrayList;

public class StackByArrayList {
	private static ArrayList<Integer> items;
	
	public StackByArrayList() {
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
			return -1;
		}
		return items.remove(items.size()-1);
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return items.get(items.size()-1);
	}
	
	public void print() {
		for(int num: items) {
			System.out.print(num+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		StackByArrayList stack = new StackByArrayList();
		stack.append(10);
		stack.append(20);
		stack.append(30);
		stack.append(40);
		stack.print();
		System.out.println("=================================");
		System.out.println(stack.prepend());
		System.out.println("=================================");
		System.out.println(stack.peek());
	}

}
