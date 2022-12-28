package com.sukhovilin.lang.tasks.task09;

class Super {
	static String ID = "QBANK";
}

class Sub extends Super {
	static {
		System.out.print("In Sub");
	}
}