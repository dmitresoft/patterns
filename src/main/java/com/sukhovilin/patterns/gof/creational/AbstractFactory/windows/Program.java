package com.sukhovilin.patterns.gof.creational.AbstractFactory.windows;

/**
 * @author Dmitry Sukhovilin
 */
class Program {

	public static void main(String[] args) {
		WindowManager manager = new WindowManager();

		WindowsFactory gtk = new GtkWindowsFactory();
		manager.generateUI(gtk);

		WindowsFactory kde = new KdeWindowsFactory();
		manager.generateUI(kde);
	}

}
