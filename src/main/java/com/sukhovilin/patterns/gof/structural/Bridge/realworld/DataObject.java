package com.sukhovilin.patterns.gof.structural.Bridge.realworld;

/**
 * The 'Implementor' abstract class
 */
abstract class DataObject {
	public abstract void nextRecord();

	public abstract void priorRecord();

	public abstract void addRecord(String name);

	public abstract void deleteRecord(String name);

	public abstract void showRecord();

	public abstract void showAllRecords();
}