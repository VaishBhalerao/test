package com.afternoon;

import java.util.Scanner;

public class B {

	Scanner sc=new Scanner(System.in);
	public void acceptData(int g[]) {
		System.out.println("Accept Data -> ");
		for(int i=0;i<g.length;i++) {
			g[i]=sc.nextInt();
		}
	}
	public void descendingSorting(int b[]) {
		for(int a=0;a<b.length;a++) {
			for(int c=a+1;c<b.length;c++) {
				if(b[a]<b[c]) {
					int s=b[a];
					b[a]=b[c];
					b[c]=s;
				}			
				}
		}
		}
	public void showData(int g[] ){
		System.out.println("Show Data -> ");
		for(int i=0;i<g.length;i++) {
			System.out.println(g[i]);
		}
	}
	public static void main(String[] args) {
		int a[]=new int[5];
		  B b1=new B();
		  b1.acceptData(a);
		  b1.descendingSorting(a);
		  b1.showData(a);
		
	}
}
