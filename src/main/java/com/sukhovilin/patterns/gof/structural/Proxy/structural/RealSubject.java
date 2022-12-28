package com.sukhovilin.patterns.gof.structural.Proxy.structural;

/**
 * The 'RealSubject' class
 */
class RealSubject extends Subject {

	public RealSubject() {
		System.out.println("Initializion of real subject...");
	}

	@Override
	public void request() {
		System.out.println("Called RealSubject.request()");
	}

}