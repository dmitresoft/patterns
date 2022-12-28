package com.sukhovilin.patterns.gof.creational.AbstractFactory.windows;

class GtkWindowsFactory extends WindowsFactory{

	@Override
	public AbstractButton createButton() {
		return new GtkButton();
	}

	@Override
	public AbstractCheckbox createCheckbox() {
		return new GtkCheckbox();
	}
	
}