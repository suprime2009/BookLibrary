package com.softserveinc.facade;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.softserveinc.entity.Book;
import com.softserveinc.entity.Review;

@Stateless
@LocalBean
public class ReviewFacade implements IReviewFacade{
	
	@PersistenceContext(unitName = "primary")
	EntityManager entityManager;
	
	public ReviewFacade() {}

	public List<Review> getAllReviewsByCommenter(String commenterName) {
		Query query = entityManager.createQuery("select r from Review r where"
				+ " commenterName like :cn");
		query.setParameter("cn", commenterName);
		return (List<Review>) query.getResultList();
	}

	public Book getMostReviewedBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
