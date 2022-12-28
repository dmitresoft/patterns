package com.sukhovilin.patterns.interprise.repository;

import java.util.Collection;

interface Repository<Id, T> {

	T load(Id id);

	Id save(T entity);

	void delete(Id id);

	Collection<T> list();

	int count();

}