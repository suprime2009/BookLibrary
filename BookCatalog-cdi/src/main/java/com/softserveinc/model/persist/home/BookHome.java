package com.softserveinc.model.persist.home;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.softserveinc.model.persist.entity.Book;



@Stateless
@LocalBean
public class BookHome implements BookHomeLocal {

	@PersistenceContext(unitName = "primary")
	EntityManager entityManager;

	public BookHome() {
	}

	public void create(Book object) {
		entityManager.persist(object);
	}

	public void update(Book object) {
		entityManager.merge(object);
	}

	public void delete(Book object) {
		entityManager.remove(object);

	}

	public Book findByID(int id) {
		return (Book) entityManager.find(null, id);
	}

	public List<Book> findAll() {
		TypedQuery<Book> query = entityManager.createNamedQuery("Book.findAll", Book.class);
		List<Book> results = query.getResultList();
		return results;
	}
}