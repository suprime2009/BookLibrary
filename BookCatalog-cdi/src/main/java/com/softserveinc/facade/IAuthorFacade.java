package com.softserveinc.facade;

import java.util.List;

import javax.ejb.Local;

import com.softserveinc.entity.Author;
import com.softserveinc.entity.Book;

@Local
public interface IAuthorFacade {

	List<Author> getAllAuthorsByBook(Book book);

	Author getAuthorByFullName(String firstName, String secondName);

	List<Author> getAuthorsByAverageRating(int rating);

}
