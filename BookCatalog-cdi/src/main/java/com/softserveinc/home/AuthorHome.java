package com.softserveinc.home;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.softserveinc.entity.Author;

@Stateless
@LocalBean
public class AuthorHome implements IHome<Author> {

	@PersistenceContext(unitName = "primary")
	EntityManager entityManager;

	public AuthorHome() {
	}

	public void create(Author object) {
		entityManager.persist(object);
	}

	public void update(Author object) {
		entityManager.merge(object);
	}

	public void delete(Author object) {
		entityManager.remove(object);
	}

	public List<Author> findAll() {
		TypedQuery<Author> query = entityManager.createNamedQuery("Author.findAll", Author.class);
		List<Author> results = query.getResultList();
		return results;
	}

	public Author findByID(int id) {
		return (Author) entityManager.find(null, id);
	}

}
