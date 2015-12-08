package com.softserveinc.facade;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.softserveinc.entity.Book;
import com.softserveinc.entity.Review;

/**
 * Describes all facade methods for Review entity
 * @author pkrav
 *
 */
@Stateless
@LocalBean
public class ReviewFacade implements IReviewFacade{
	
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
