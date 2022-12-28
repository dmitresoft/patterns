package com.sukhovilin.patterns.gof.creational.AbstractFactory.windows;

class WindowManager {

	public void generateUI(WindowsFactory factory) {
		Displayable button = factory.createButton();
		Displayable checkbox = factory.createCheckbox();
		
		System.out.println(button.show());
		System.out.println(checkbox.show());
	}
}