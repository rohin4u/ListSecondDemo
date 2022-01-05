package com;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("india");
		l.add("delhi");
		l.add(455);
		l.add(null);
		l.add(89l);
		
		
		System.out.println(l);
		
		l.remove(4);
		l.set(2, "Kerela");
		
		System.out.println(l);
		
		l.addFirst("america");
		l.addLast(788);
		System.out.println(l);
		
		
		
		

	}

}
