package com.softserveinc.entity;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.softserveinc.facade.AuthorFacade;
import com.softserveinc.facade.BookFacade;


public class Main {
	public static void main(String[] args) throws NamingException {
		BookFacade bf = new BookFacade();
		Book book = bf.getBookByName("some");
		System.out.println(book.getBookName());
		
		List<Book> list = bf.getBooksWithRating("3");
		System.out.println(list.get(0).getBookName());
		
		AuthorFacade af = new AuthorFacade();
		Author author = af.getAuthorByFullName("author", "fred");
		System.out.println(author);
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("primary");
//		
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction( ).begin( );
//		
//		Author au = new Author();
//		au.setFirstName("author");
//		au.setSecondName("fred");
//		au.setIdauthor(3);
//		System.out.println(au);
//		Set<Author> set = new HashSet<Author>();
//		set.add(au);
//	
//
//		em.persist(au);
//		
//
//
//		Book book = new Book();
//		book.setBookName("some");
//		book.setIdbook(1);
//		book.setPublisher("some");
//		book.setBookAuthors(set);
//		em.persist(book);
//		
//		Review rew = new Review();
//		rew.setBook(book);
//		rew.setComment("some");
//		rew.setCommenterName("other");
//		rew.setRating("3");
//		em.persist(rew);
//		
//		
//		
//		em.getTransaction().commit();
//		em.close();
//		   emf.close();

//		BookSevice bookService = new BookSevice(em);
//
//		System.out.println("--- Finding genre ---");
//
//		Book book = bookService.findGenre(1);
//
//		System.out.println(String.format("Found genre: %s", genre));
//
//		for (Artist artist : genre.getArtists()) {
//
//			System.out.println(String.format("Genre artist: %s", artist));
//
//		}

	}

}