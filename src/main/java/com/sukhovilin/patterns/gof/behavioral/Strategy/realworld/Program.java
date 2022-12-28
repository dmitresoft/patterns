package com.sukhovilin.patterns.gof.behavioral.Strategy.realworld;


/**
 * MainApp startup class for Real-World Strategy Design Pattern.
 * 
 * @author Dmitry Sukhovilin
 */
public class Program {

	/**
	 * Entry point into console application.
	 */
	public static void main(String[] args) {

		// Two contexts following different strategies
		SortedList studentRecords = new SortedList();
		studentRecords.add("Samual");
		studentRecords.add("Jimmy");
		studentRecords.add("Sandra");
		studentRecords.add("Vivek");
		studentRecords.add("Anna");

		studentRecords.setSortStrategy(new QuickSort());
		studentRecords.sort();

		studentRecords.setSortStrategy(new ShellSort());
		studentRecords.sort();

		studentRecords.setSortStrategy(new MergeSort());
		studentRecords.sort();
	}
}