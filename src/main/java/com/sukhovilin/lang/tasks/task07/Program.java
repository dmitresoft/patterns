package com.sukhovilin.lang.tasks.task07;

public class Program {

	public static void main(String[] args) {
		
		doIt("test");
		
	}
	
	public static void doIt(String String) { // 1
		int i = 10;
		i: for (int k = 0; k < 10; k++) { // 2
			System.out.println(String + i); // 3
			if (k * k > 10)
				continue i; // 4
		}
	}
}
