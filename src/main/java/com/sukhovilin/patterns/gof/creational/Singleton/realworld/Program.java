package com.sukhovilin.patterns.gof.creational.Singleton.realworld;


/**
 * MainApp startup class for Real-World Singleton Design Pattern.
 */
class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {
		LoadBalancer b1 = LoadBalancer.getLoadBalancer();
		LoadBalancer b2 = LoadBalancer.getLoadBalancer();
		LoadBalancer b3 = LoadBalancer.getLoadBalancer();
		LoadBalancer b4 = LoadBalancer.getLoadBalancer();

		// Same instance?
		if (b1 == b2 && b2 == b3 && b3 == b4) {
			System.out.println("Same instance\n");
		}

		// Load balance 15 server requests
		LoadBalancer balancer = LoadBalancer.getLoadBalancer();
		for (int i = 0; i < 15; i++) {
			String server = balancer.getServer();
			System.out.println("Dispatch Request to: " + server);
		}

	}

}