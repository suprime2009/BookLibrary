package com.softserveinc.facade;

import java.util.List;

import javax.ejb.Local;

import com.softserveinc.entity.Author;
import com.softserveinc.entity.Book;

@Local
public interface IBookFacade {

	List<Book> getBooksWithRating(String rating);

	Book getBookByName(String name);

	Book getBookByISNBN(String isbn);

	List<Book> getBooksByPublisher(String publisher);

	List<Book> getAllBooksByAuthor(Author author);

}
