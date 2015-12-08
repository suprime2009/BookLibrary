package com.softserveinc.model.persist.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.google.common.base.MoreObjects;

import java.sql.Timestamp;
import java.util.Objects;


/**
 * The persistent class for the review database table.
 * @author pkrav
 * 
 */
@Entity
@Table(name = "review")
@NamedQuery(name="Review.findAll", query="SELECT r FROM Review r")
public class Review implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private int idreview;

	@Column(name="comment_")
	private String comment;

	@Column(name="commenter_name")
	private String commenterName;

	@Column(name="created_date")
	private Timestamp createdDate;

	private String rating;

	//bi-directional many-to-one association to Book
	@ManyToOne
	@JoinColumn(name="book_id")
	private Book book;

	public Review() {
	}
	
	public Review(String comment, String commenterName, String rating, Book book) {
		super();
		this.comment = comment;
		this.commenterName = commenterName;
		this.rating = rating;
		this.book = book;
	}

	public Review(int idreview, String comment, String commenterName, Timestamp createdDate, String rating, Book book) {
		super();
		this.idreview = idreview;
		this.comment = comment;
		this.commenterName = commenterName;
		this.createdDate = createdDate;
		this.rating = rating;
		this.book = book;
	}

	public int getIdreview() {
		return this.idreview;
	}

	public void setIdreview(int idreview) {
		this.idreview = idreview;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommenterName() {
		return this.commenterName;
	}

	public void setCommenterName(String commenterName) {
		this.commenterName = commenterName;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idreview, comment, commenterName, createdDate, rating, book);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Review review = (Review) obj;
		return Objects.equals(idreview, review.idreview) 
				&& Objects.equals(comment, review.comment)
				&& Objects.equals(commenterName, review.commenterName) 
				&& Objects.equals(createdDate, review.createdDate)
				&& Objects.equals(rating, review.rating) 
				&& Objects.equals(book, review.book);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues()
				.add("idreview", idreview)
				.add("comment", comment)
				.add("commenterName", commenterName)
				.add("createdDate", createdDate)
				.add("rating", rating)
				.add("book", book)
				.toString();
	}
}
