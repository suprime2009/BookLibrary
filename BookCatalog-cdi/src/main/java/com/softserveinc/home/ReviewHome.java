package com.softserveinc.home;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.softserveinc.entity.Review;

public class ReviewHome implements IHome<Review> {

	@PersistenceContext(unitName = "primary")
	EntityManager entityManager;

	public ReviewHome() {
	}

	public void create(Review object) {
		entityManager.persist(object);

	}

	public void update(Review object) {
		entityManager.merge(object);

	}

	public void delete(Review object) {
		entityManager.remove(object);

	}

	public List<Review> findAll() {
		TypedQuery<Review> query = entityManager.createNamedQuery("Review.findAll", Review.class);
		List<Review> results = query.getResultList();
		return results;
	}

	public Review findByID(int id) {
		return (Review) entityManager.find(null, id);
	}

}
