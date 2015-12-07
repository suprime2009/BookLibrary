package com.softserveinc.home;

import java.util.List;

public interface IHome<T> {
	
	void create(T object);
	
	void update(T object);
	
	void delete(T object);
	
	List<T> findAll();
	
	T findByID(int id);
}
