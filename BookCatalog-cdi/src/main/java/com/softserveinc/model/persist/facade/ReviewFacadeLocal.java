package com.softserveinc.model.persist.facade;

import java.util.List;

import javax.ejb.Local;

import com.softserveinc.model.persist.entity.Book;
import com.softserveinc.model.persist.entity.Review;

@Local
public interface ReviewFacadeLocal {
	
	List<Review> getAllReviewsByCommenter(String commenterName);

	Book getMostReviewedBook();

}
