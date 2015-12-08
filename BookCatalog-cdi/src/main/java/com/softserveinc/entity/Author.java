package com.softserveinc.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.google.common.base.MoreObjects;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;


/**
 * The persistent class for the author database table.
 * @author pkrav
 * 
 */
@Entity
@Table(name = "author")
@NamedQuery(name="Author.findAll", query="SELECT a FROM Author a")
public class Author implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="author_id")
	private int idAuthor;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="first_name")
	private String firstName;

	@Column(name="second_name")
	private String secondName;

	public Author() {
	}

	public Author(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public Author(int idAuthor, Timestamp createdDate, String firstName, String secondName) {
		super();
		this.idAuthor = idAuthor;
		this.createdDate = createdDate;
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public int getIdauthor() {
		return this.idAuthor;
	}

	public void setIdauthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return this.secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idAuthor, createdDate, firstName, secondName);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Author author = (Author) obj;
		return Objects.equals(idAuthor, author.idAuthor) 
				&& Objects.equals(createdDate, author.createdDate)
				&& Objects.equals(firstName, author.firstName) 
				&& Objects.equals(secondName, author.secondName);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues()
				.add("idAuthor", idAuthor)
				.add("createdDate", createdDate)
				.add("firstName", firstName)
				.add("secondName", secondName)
				.toString();
	}
}