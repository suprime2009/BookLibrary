package com.softserveinc.model.persist.home;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.softserveinc.model.persist.entity.Review;

@Stateless
@LocalBean
public class ReviewHome implements ReviewHomeLocal {

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
