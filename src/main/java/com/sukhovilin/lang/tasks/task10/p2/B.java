package com.sukhovilin.lang.tasks.task10.p2;

import com.sukhovilin.lang.tasks.task10.p1.A;

public class B extends A {
	public void process(A a) {
		//a.i = a.i * 2;
	}

	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		b.process(a);
		System.out.println(a.getI());
	}
}
