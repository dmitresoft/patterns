package com.sukhovilin.patterns.gof.structural.Proxy.structural;

/**
 * The 'Proxy' class
 */
class Proxy extends Subject {
	private RealSubject realSubject;

	@Override
	public void request() {
		
		// Use 'lazy initialization'
		if (realSubject == null) {
			System.out.println("Loading real subject...");
			realSubject = new RealSubject();
		}
		
		System.out.println("Calling to real subject...");
		realSubject.request();
	}
}