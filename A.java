package com.afternoon;

public class A {

	public static void main(String[] args) {
		int a=10,b=5,c;
		System.out.println("Values before swapping -> ");
		System.out.println("A -> "+a);
		System.out.println("B -> "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Values after swapping -> ");
		System.out.println("A -> "+a);
		System.out.println("B -> "+b);
	}
}
