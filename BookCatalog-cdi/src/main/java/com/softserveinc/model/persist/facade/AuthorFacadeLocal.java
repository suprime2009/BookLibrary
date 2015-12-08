package com.softserveinc.model.persist.facade;

import java.util.List;

import javax.ejb.Local;

import com.softserveinc.model.persist.entity.Author;
import com.softserveinc.model.persist.entity.Book;

/**
 * Describes all facade methods for Author entity
 * @author pkrav
 *
 */
@Local
public interface AuthorFacadeLocal {
	/**
	 * method gets authors of book from database.
	 * @param book entity
	 * @return List<Authors>
	 */
	List<Author> getAllAuthorsByBook(Book book);

	/**
	 * method gets author from database by first name and second name.
	 * @param firstName
	 * @param secondName
	 * @return Author
	 */
	Author getAuthorByFullName(String firstName, String secondName);

	/**
	 * method gets authors of books by average rating from reviews
	 * @param rating
	 * @return
	 */
	List<Author> getAuthorsByAverageRating(String rating);

}
