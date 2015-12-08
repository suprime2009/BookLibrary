package com.softserveinc.home;

import java.util.List;
/**
 * interface that describes basic CRUD operations
 * @author pkrav
 *
 * @param <T>
 */
public interface IHome<T> {
	
	/**
	 * method creates a record in a database
	 * @param object to add to database
	 */
	void create(T object);
	
	/**
	 * method updates a record in database
	 * @param object to update in database
	 */
	void update(T object);
	
	/**
	 * method deletes a record from database
	 * @param object to delete record from database
	 */
	void delete(T object);
	
	/**
	 * method gets all records from database table
	 * @return list of entities
	 */
	List<T> findAll();
	
	/**
	 * method finds a record in database table by id
	 * @param id of entity
	 * @return single entity object
	 */
	T findByID(int id);
}
