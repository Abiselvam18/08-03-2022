package com.StringBufferAndStringBuilderMethods;

public class LengthCapacity {

	public static void main(String[] args) {

		StringBuffer name1 = new StringBuffer("Welcome to India");//Default capacity is always 16
		
		StringBuffer name2 = new StringBuffer();
		
		System.out.println(name1.length());//16
		System.out.println(name1.capacity());//len+cap=>16+16=32
		
		System.out.println("===================");
		
		System.out.println(name2.length());
		System.out.println(name2.capacity());//0+16=16

	}

}
