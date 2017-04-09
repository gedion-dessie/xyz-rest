package com.xyzstaffing.persistence;

import java.util.List;

public interface GenericDAO<T> {
	public abstract T find(long id);
	public abstract List<T> findAll();
	public abstract void save(T t);
}
