package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("delhi");
		s.push("kerela");
		s.push("mumbai");
		
		System.out.println(s.search("delhi"));
		System.out.println(s.search("mumbai"));
		System.out.println(s.search("oop"));
		
	
		
		

	}

}
