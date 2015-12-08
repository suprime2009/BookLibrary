package com.softserveinc.model.persist.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.softserveinc.model.persist.entity.Author;
import com.softserveinc.model.persist.entity.Book;

@Stateless
public class AuthorFacade implements AuthorFacadeLocal{
	
	@PersistenceContext(unitName = "primary")
	EntityManager entityManager;
	
	public AuthorFacade() {
	
	}

	public List<Author> getAllAuthorsByBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public Author getAuthorByFullName(String firstName, String secondName) {
		Query query = entityManager.createQuery("select distinct a from Author a where"
				+ " firstName like :fn and secondName like :sn");
		query.setParameter("fn", firstName);
		query.setParameter("sn", secondName);
		return (Author) query.getSingleResult();
	}

	public List<Author> getAuthorsByAverageRating(String rating) {
		// TODO Auto-generated method stub
		return null;
	}

}

