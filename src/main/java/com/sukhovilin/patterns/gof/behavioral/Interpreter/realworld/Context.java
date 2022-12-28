package com.sukhovilin.patterns.gof.behavioral.Interpreter.realworld;

/**
 * The 'Context' class
 */
class Context {
	private String input;
	private int output;

	// Constructor
	public Context(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}
}