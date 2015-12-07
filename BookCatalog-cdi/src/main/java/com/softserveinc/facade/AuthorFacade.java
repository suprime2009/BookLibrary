package com.softserveinc.facade;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.softserveinc.entity.Author;
import com.softserveinc.entity.Book;

@Stateless
@LocalBean
public class AuthorFacade implements IAuthorFacade{
	
	@PersistenceContext(unitName = "primary")
	EntityManager entityManager;
	
	EntityManagerFactory emf;
	
	public AuthorFacade() {
		emf = Persistence.createEntityManagerFactory("primary");
		entityManager = emf.createEntityManager();
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

	public List<Author> getAuthorsByAverageRating(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

}
