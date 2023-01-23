package com.sukhovilin.patterns.gof.behavioral.Visitor.parserdemo;

import java.util.LinkedList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		new Program().run();
	}

	private void run() {

		// creating a list of tags

		List<Tagable> tags = new LinkedList<>();
		tags.add(new TextTag());
		tags.add(new HTag());
		tags.add(new TableTag());
		tags.add(new TextTag());

		// creating a visitor

		Visitor visitor = new VisitorImpl();

		// to visit all of them

		for (Tagable tag : tags) {
			tag.visit(visitor);
		}
		
		System.out.println(visitor);
	}

}

interface Tagable {
	void visit(Visitor visitor);
}

class HTag implements Tagable {

	@Override
	public void visit(Visitor visitor) {
		visitor.visit(this);
	}

}

class TextTag implements Tagable {

	@Override
	public void visit(Visitor visitor) {
		visitor.visit(this);
	}

}

class TableTag implements Tagable {

	@Override
	public void visit(Visitor visitor) {
		visitor.visit(this);
	}

}

interface Visitor {
	void visit(HTag tag);

	void visit(TextTag tag);

	void visit(TableTag tag);
}

class VisitorImpl implements Visitor {

	private StringBuilder sb = new StringBuilder();

	@Override
	public void visit(HTag tag) {
		sb.append("visited by: " + tag.getClass().getSimpleName());
		sb.append("\n");
	}

	@Override
	public void visit(TextTag tag) {
		sb.append("visited by: " + tag.getClass().getSimpleName());
		sb.append("\n");
	}

	@Override
	public void visit(TableTag tag) {
		sb.append("visited by: " + tag.getClass().getSimpleName());
		sb.append("\n");
	}

	@Override
	public String toString() {
		return sb.toString();
	}
}
