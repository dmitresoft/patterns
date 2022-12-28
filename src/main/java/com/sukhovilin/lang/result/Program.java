package com.sukhovilin.lang.result;

public class Program {

	public static void main(String[] args) {
		new Program().run();
	}

	private void run() {

		final int result = function();
		System.out.println(result);

	}

	private int function() {

		try {
			if (1 == 1) {
				throw new IllegalArgumentException("some message");
			}

			return 100;

		} catch (Exception e) {
			
			System.out.println("catched exception is: " + e.getMessage());
			return 101;
			
		} finally {
			
			System.out.println("finally block");
			return 102;
			
		}

	}

}
