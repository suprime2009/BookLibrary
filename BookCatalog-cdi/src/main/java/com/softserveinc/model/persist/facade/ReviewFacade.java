package com.softserveinc.model.persist.facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.softserveinc.model.persist.entity.Book;
import com.softserveinc.model.persist.entity.Review;

@Stateless
public class ReviewFacade implements ReviewFacadeLocal{
	
	@PersistenceContext(unitName = "primary")
	EntityManager entityManager;
	
	public ReviewFacade() {}

	/**
	 * method gets all reviews of commenter from database table.
	 * @param commenterName name of review commenter
	 * @return List<Review>  
	 */
	public List<Review> getAllReviewsByCommenter(String commenterName) {
		Query query = entityManager.createQuery("select r from Review r where"
				+ " commenterName like :cn");
		query.setParameter("cn", commenterName);
		return (List<Review>) query.getResultList();
	}

	/**
	 * method gets a book from database which has most reviews.
	 * @return Book entity
	 */
	public Book getMostReviewedBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
