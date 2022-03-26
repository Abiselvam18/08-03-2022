package com.StringBufferAndStringBuilderMethods;

public class Substring {

	public static void main(String[] args) {
		
		StringBuffer msg = new StringBuffer("How are you");
		
		System.out.println(msg.substring(10));
		
		System.out.println(msg.substring(8));
		
		System.out.println("=============");
		
		System.out.println(msg.substring(4, 11));

	}

}
