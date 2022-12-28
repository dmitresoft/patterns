package com.sukhovilin.patterns.gof.creational.AbstractFactory.realworld;

/**
 * The 'AbstractFactory' abstract class
 */
abstract class ContinentFactory {
	public abstract Herbivore CreateHerbivore();

	public abstract Carnivore CreateCarnivore();
}