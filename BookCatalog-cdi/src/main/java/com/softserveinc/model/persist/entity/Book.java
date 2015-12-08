package com.softserveinc.model.persist.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.google.common.base.MoreObjects;

import java.util.Date;
import java.util.Objects;
import java.sql.Timestamp;
import java.util.Set;

/**
 * The persistent class for the book database table.
 * @author pkrav
 * 
 */
@Entity
@Table(name = "book")
@NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "book_id")
	private int idBook;

	@Column(name = "book_name")
	private String bookName;

	@Column(name = "created_date")
	private Timestamp createdDate;

	@Column(name = "isbn")
	private String isbn;

	@Column(name = "publisher")
	private String publisher;

	@Temporal(TemporalType.DATE)
	@Column(name = "year_published")
	private Date yearPublished;

	// bi-directional many-to-one association to BookAuthor
	@ManyToMany
	@JoinTable(name = "book_author", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = {
			@JoinColumn(name = "author_id") })
	private Set<Author> autors;

	public Book() {
	}

	public Book(String bookName, String isbn, String publisher, Date yearPublished, Set<Author> autors) {
		super();
		this.bookName = bookName;
		this.isbn = isbn;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.autors = autors;
	}

	public Book(int idBook, String bookName, Timestamp createdDate, String isbn, String publisher, Date yearPublished,
			Set<Author> autors) {
		super();
		this.idBook = idBook;
		this.bookName = bookName;
		this.createdDate = createdDate;
		this.isbn = isbn;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.autors = autors;
	}

	public int getIdbook() {
		return this.idBook;
	}

	public void setIdbook(int idBook) {
		this.idBook = idBook;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getYearPublished() {
		return this.yearPublished;
	}

	public void setYearPublished(Date yearPublished) {
		this.yearPublished = yearPublished;
	}

	public Set<Author> getBookAuthors() {
		return this.autors;
	}

	public void setBookAuthors(Set<Author> autors) {
		this.autors = autors;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idBook, bookName, createdDate, isbn, publisher, yearPublished, autors);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Book book = (Book) obj;
		return Objects.equals(idBook, book.idBook) 
				&& Objects.equals(bookName, book.bookName)
				&& Objects.equals(createdDate, book.createdDate) 
				&& Objects.equals(isbn, book.isbn)
				&& Objects.equals(publisher, book.publisher) 
				&& Objects.equals(yearPublished, book.yearPublished)
				&& Objects.equals(autors, book.autors);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues()
				.add("idBook", idBook)
				.add("bookName", bookName)
				.add("createdDate", createdDate)
				.add("isbn", isbn)
				.add("publisher", publisher)
				.add("yearPublished", yearPublished)
				.add("autors", autors)
				.toString();
	}

}