package com.sukhovilin.patterns.gof.creational.AbstractFactory.windows;

class KdeWindowsFactory extends WindowsFactory {

	@Override
	public AbstractButton createButton() {
		return new KdeButton();
	}

	@Override
	public AbstractCheckbox createCheckbox() {
		return new KdeCheckbox();
	}

}