package com.mastek.dao;

import java.util.List;

public interface IDao<T> {
	
	List<T> findAll();
	T findById(String id);
	boolean save(T object);
	boolean delete (String id);

}
