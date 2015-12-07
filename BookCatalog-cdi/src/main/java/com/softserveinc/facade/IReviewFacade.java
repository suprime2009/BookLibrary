package com.softserveinc.facade;

import java.util.List;

import javax.ejb.Local;

import com.softserveinc.entity.Book;
import com.softserveinc.entity.Review;

@Local
public interface IReviewFacade {

	List<Review> getAllReviewsByCommenter(String commenterName);

	Book getMostReviewedBook();

}
