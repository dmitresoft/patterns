package com.sukhovilin.patterns.gof.behavioral.TemplateMethod.realworld;

import java.util.Set;

/**
 * The 'AbstractClass' abstract class
 */
abstract class DataAccessObject {
	protected String connectionString;
	protected Set<String> dataSet;

	public void Connect() {
	}

	public abstract void Select();

	public abstract void Process();

	public void Disconnect() {
	}

	// The 'Template Method'
	public void run() {
		Connect();
		Select();
		Process();
		Disconnect();
	}
}