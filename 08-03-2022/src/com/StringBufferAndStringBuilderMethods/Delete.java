package com.StringBufferAndStringBuilderMethods;

public class Delete {

	public static void main(String[] args) {
		
		StringBuffer name1 = new StringBuffer("Welcome to India, welcome to chennai");
		
		System.out.println(name1.delete(16, 36));
		
		System.out.println(name1.delete(0, 7));
		
	}

}
