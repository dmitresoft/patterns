package com.sukhovilin.patterns.interprise.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class PersonRepository implements Repository<Integer, String> {

	private static int _id = 1;
	private Map<Integer, String> persons = new HashMap<Integer, String>();

	private int getId() {
		return _id++;
	}

	@Override
	public String load(Integer id) {
		return persons.get(id);
	}

	@Override
	public Integer save(String entity) {
		final int id = getId();
		persons.put(id, entity);
		return id;
	}

	@Override
	public void delete(Integer id) {
		persons.remove(id);
	}

	@Override
	public Collection<String> list() {
		return persons.values();
	}

	@Override
	public int count() {
		return persons.size();
	}

}