package com.xyzstaffing.persistence.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.xyzstaffing.persistence.GenericDAO;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	@PersistenceContext
	protected EntityManager entityManager;

	protected Class<T> daoType;

	public void setDaoType(Class<T> type) {
		daoType = type;
	}

	@Override
	public T find(long id) {
		return entityManager.find(daoType, id);
	}
	
	@Override
	public List<T> findAll() {
		return entityManager.createQuery("from " + daoType.getName(), daoType).getResultList();
	}
	
	@Override
	public void save(T t) {
		entityManager.persist(t);
	}

}
