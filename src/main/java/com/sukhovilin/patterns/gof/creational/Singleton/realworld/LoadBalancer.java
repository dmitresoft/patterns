package com.sukhovilin.patterns.gof.creational.Singleton.realworld;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * The 'Singleton' class
 */
class LoadBalancer {
	private static LoadBalancer instance;
	private List<String> servers = new LinkedList<String>();
	private Random random = new Random();

	// Lock synchronization object
	private static Object syncLock = new Object();

	// Constructor (protected)
	protected LoadBalancer() {
		// List of available servers
		servers.add("ServerI");
		servers.add("ServerII");
		servers.add("ServerIII");
		servers.add("ServerIV");
		servers.add("ServerV");
	}

	public static LoadBalancer getLoadBalancer() {
		// Support multithreaded applications through
		// 'Double checked locking' pattern which (once
		// the instance exists) avoids locking each
		// time the method is invoked
		if (instance == null) {
			synchronized (syncLock) {
				if (instance == null) {
					instance = new LoadBalancer();
				}
			}
		}
		return instance;
	}

	// Simple, but effective random load balancer
	public String getServer() {
		int r = random.nextInt(servers.size());
		return servers.get(r).toString();
	}
}