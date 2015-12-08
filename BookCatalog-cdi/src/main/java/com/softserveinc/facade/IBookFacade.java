package com.softserveinc.facade;

import java.util.List;

import javax.ejb.Local;

import com.softserveinc.entity.Author;
import com.softserveinc.entity.Book;

/**
 * Describes all facade methods for Book entity
 * @author pkrav
 *
 */
@Local
public interface IBookFacade {

	/**
	 * method gets books which have rating from review equal to passed in parameter
	 * @param rating from review
	 * @return List<Book>
	 */
	List<Book> getBooksWithRating(String rating);

	/**
	 * method gets book from database table by book name
	 * @param name of book
	 * @return Book entity
	 */
	Book getBookByName(String name);

	/**
	 * method gets book from database table by ISBN number
	 * @param isbn unique book number
	 * @return Book entity
	 */
	Book getBookByISNBN(String isbn);

	/**
	 * method gets books from database table by publisher
	 * @param publisher of book
	 * @return List<Book>
	 */
	List<Book> getBooksByPublisher(String publisher);

	/**
	 * method gets books of author from database.
	 * @param author Author entity
	 * @return List<Book>
	 */
	List<Book> getAllBooksByAuthor(Author author);

}
