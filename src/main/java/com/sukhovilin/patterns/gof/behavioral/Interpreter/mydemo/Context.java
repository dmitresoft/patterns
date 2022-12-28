package com.sukhovilin.patterns.gof.behavioral.Interpreter.mydemo;

class Context {
	private int position;
	private String value;

	public Context(String value) {
		this.value = value;
		position = 0;
	}

	public boolean hasMore() {
		return position < value.length();
	}

	public char getNext() {
		return value.charAt(position);
	}

	public void inc() {
		++position;
	}
}