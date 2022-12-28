package com.sukhovilin.patterns.gof.structural.Proxy.structural;

/**
 * MainApp startup class for Structural Proxy Design Pattern.
 * 
 * @author Dmitry Sukhovilin
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		
		new Program().run();
	}

	private void run() {
		// Create proxy and request a service
		Subject proxy = new Proxy();
		process(proxy);
		
		System.out.println("--------------");
		
		// Direct call
		Subject real = new RealSubject();
		process(real);
	}

	private void process(Subject subject) {
		subject.request();
	}

}
