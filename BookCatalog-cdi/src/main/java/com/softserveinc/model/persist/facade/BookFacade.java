package com.softserveinc.model.persist.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.softserveinc.model.persist.entity.Author;
import com.softserveinc.model.persist.entity.Book;

@Stateless
public class BookFacade implements BookFacadeLocal {

	@PersistenceContext(unitName = "primary")
	EntityManager entityManager;
	
	public BookFacade() {}

	public List<Book> getBooksWithRating(String rating) {
		Query query = entityManager.createQuery("select distinct b from Review r join r.book b "
				+ " where r.rating = :rat");
		query.setParameter("rat", rating);
		return (List<Book>) query.getResultList();
	}

	public Book getBookByName(String name) {
		Query query = entityManager.createQuery("select b from Book b where b.bookName like :nam ");
		query.setParameter("nam", name);
		return (Book) query.getSingleResult();
	}

	public Book getBookByISNBN(String isbn) {
		Query query = entityManager.createQuery("select b from Book b where b.isbn like :isb ");
		query.setParameter("isb", isbn);
		return (Book) query.getSingleResult();
	}

	public List<Book> getBooksByPublisher(String publisher) {
		Query query = entityManager.createQuery("select b from Book b where b.publisher like :pub ");
		query.setParameter("pub", publisher);
		return (List<Book>) query.getResultList();
	}

	public List<Book> getAllBooksByAuthor(Author author) {

		return null;
	}
}
